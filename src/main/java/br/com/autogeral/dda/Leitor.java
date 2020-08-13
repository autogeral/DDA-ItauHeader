package br.com.autogeral.dda;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;

import br.com.autogeral.dda.arquivo.retorno.DebitoDiretoAutorizadoInteface;
import br.com.autogeral.dda.arquivo.retorno.HeaderArquivo;
import br.com.autogeral.dda.arquivo.retorno.RegistroDetalheSegmentoG;
import br.com.autogeral.dda.arquivo.retorno.RegistroDetalheSegmentoH;
import br.com.autogeral.dda.arquivo.retorno.RegistroHeaderLote;
import br.com.autogeral.dda.arquivo.retorno.RegistroTrailerArquivo;
import br.com.autogeral.dda.arquivo.retorno.RegistroTrailerLote;

public class Leitor {

	public FixedFormatManager FFM = new FixedFormatManagerImpl();
	static String DIRETORIO_RAIZ = "C:\\Users\\kaique.mota\\Desktop\\Cnab\\VS01040A.RET";
	private BufferedReader br;

	public static void main(String[] args) {
		Leitor l = new Leitor();
		File f = new File(DIRETORIO_RAIZ);
		l.defineLeitura(f);
	}

	public List<DebitoDiretoAutorizadoInteface> defineLeitura(File diretorio) {
		
		List<DebitoDiretoAutorizadoInteface> registros = null;
		if (diretorio.getName().toLowerCase().contains("vs")) {
			registros = this.lerArquivo(diretorio);
		}
		
		return registros;
	}

	public List<DebitoDiretoAutorizadoInteface> lerArquivo(File file) {

		//System.out.println("Lendo : " + file.getAbsolutePath());
		List<DebitoDiretoAutorizadoInteface> registros = new ArrayList<>();
		if (file.exists()) {
			try {
				InputStream is = new FileInputStream(file);
				InputStreamReader isr = new InputStreamReader(is, Charset.forName("ISO-8859-1"));
				br = new BufferedReader(isr);
				String l;
				while ((l = br.readLine()) != null) {
					trataRegistro(l, registros);
				}
			} catch (IOException ex) {
				System.err.println(ex);
				System.err.println("Erro ao tentar ler o arquivo");
			}
		} else {
			System.err.println("Arquivo não encontrado!!");
		}
		return registros;
	}

	public List<DebitoDiretoAutorizadoInteface> trataRegistro(String l,
			List<DebitoDiretoAutorizadoInteface> registros) {

		String tipoRegistro = l.substring(7, 8);
	//	System.out.println("Linha :" + l);
		switch (tipoRegistro) {

		case "0": {
			HeaderArquivo headerArquivo = FFM.load(HeaderArquivo.class, l);
			registros.add(headerArquivo);
		}
			break;

		case "1": {
			RegistroHeaderLote rh = FFM.load(RegistroHeaderLote.class, l);
			registros.add(rh);
		}
			break;
		case "3": {
			RegistroDetalheSegmentoG rd = null;
			RegistroDetalheSegmentoH rh = null;
			if (l.substring(13, 14).equals("G")) {
				rd = FFM.load(RegistroDetalheSegmentoG.class, l);
				rd.setCodigoCompletoBoleto(rd.getCodigoBancoCamaraCompensacao()
						.concat(Integer.toString(rd.getCodigoMoedaTitulo()).concat(rd.getDigitoDAC())
								.concat(rd.getFatorVencimento()).concat(rd.getValorImpressoCodigoBarras())
								.concat(rd.getCampoLivre())));
//				System.out.println("CODIGO LINHA DIGITAVEL = "
//						+ rd.getCodigoBancoCamaraCompensacao().concat(Integer.toString(rd.getCodigoMoedaTitulo()))
//								.concat(rd.getCodigoCompletoBoleto().substring(19, 24)).concat("*")
//								.concat(Integer.toString(rd.getTipoRegistro()))
//								.concat(rd.getCodigoCompletoBoleto().substring(24, 34)).concat("*")
//								.concat(rd.getCodigoCompletoBoleto().substring(34, 44)).concat("*")
//								.concat(rd.getCodigoCompletoBoleto().substring(5, 9)).concat(rd.getDigitoDAC())
//								.concat(rd.getCodigoCompletoBoleto().substring(9, 19)));
//				System.out.println(rd.getCodigoCompletoBoleto().substring(20, 24));
				registros.add(rd);
			} else {
				rh = FFM.load(RegistroDetalheSegmentoH.class, l);
				registros.add(rh);
			}		}
			break;
		case "5": {
			RegistroTrailerLote rtl = FFM.load(RegistroTrailerLote.class, l);
			registros.add(rtl);
		}
			break;
		case "9": {
			RegistroTrailerArquivo rta = FFM.load(RegistroTrailerArquivo.class, l);
			registros.add(rta);
		}
			break;

		default:
			System.err.println("Linha Não lida : " + l);
		}
		return registros;
	}
}
