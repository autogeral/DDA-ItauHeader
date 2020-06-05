package br.com.autogeral.dda;

import br.com.autogeral.dda.arquivo.retorno.Boleto;
import br.com.autogeral.dda.arquivo.retorno.DebitoDiretoAutorizadoInteface;
import br.com.autogeral.dda.arquivo.retorno.HeaderArquivo;
import br.com.autogeral.dda.arquivo.retorno.RegistroDetalheSegmentoG;
import br.com.autogeral.dda.arquivo.retorno.RegistroDetalheSegmentoH;
import br.com.autogeral.dda.arquivo.retorno.RegistroHeaderLote;
import br.com.autogeral.dda.arquivo.retorno.RegistroTrailerArquivo;
import br.com.autogeral.dda.arquivo.retorno.RegistroTrailerLote;
import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class Leitor {

    public FixedFormatManager FFM = new FixedFormatManagerImpl();
    public static List<DebitoDiretoAutorizadoInteface> registros = new ArrayList<>();
    public static List<Boleto> boletos = new ArrayList<Boleto>();
    static String DIRETORIO_RAIZ = "C:\\Users\\kaique.mota\\Desktop\\Varredura";

    public static void main(String[] args) {
        Leitor l = new Leitor();
        File f = new File(DIRETORIO_RAIZ);
        l.defineLeitura(f);
    }

    public List<DebitoDiretoAutorizadoInteface> defineLeitura(File diretorio) {
        File arquivos[];
        arquivos = diretorio.listFiles();

        for (File arquivo : arquivos) {
            if (arquivo.getName().toLowerCase().contains("vs")) {
                this.lerArquivo(arquivo);
            }
        }

        return registros;
    }

    public void lerArquivo(File file) {

        System.out.println("Lendo : " + file.getAbsolutePath());
        if (file.exists()) {
            try {
                InputStream is = new FileInputStream(file);
                InputStreamReader isr = new InputStreamReader(is, Charset.forName("ISO-8859-1"));
                BufferedReader br = new BufferedReader(isr);
                String l;
                while ((l = br.readLine()) != null) {
                    trataRegistro(l);
                }
            } catch (IOException ex) {
                System.err.println(ex);
                System.err.println("Erro ao tentar ler o arquivo");
            }
        } else {
            System.out.println("Arquivo n�o encontrado!!");
        }
    }

    public List<DebitoDiretoAutorizadoInteface> trataRegistro(String l) {

        String tipoRegistro = l.substring(7, 8);
        System.out.println("Linha :" + l);
        switch (tipoRegistro) {

            case "0": {
                HeaderArquivo headerArquivo = FFM.load(HeaderArquivo.class, l);
                System.out.println(headerArquivo.toString());
                registros.add(headerArquivo);
            }
            break;

            case "1": {
                RegistroHeaderLote rh = FFM.load(RegistroHeaderLote.class, l);
                System.out.println(rh.toString());
                registros.add(rh);
            }
            break;
            case "3": {
                RegistroDetalheSegmentoG rd = null;
                RegistroDetalheSegmentoH rh = null;
                if (l.substring(13, 14).equals("G")) {
                    rd = FFM.load(RegistroDetalheSegmentoG.class, l);
                    rd.setCodigoCompletoBoleto(rd.getCodigoBancoCamaraCompensacao().concat(Integer.toString(rd.getCodigoMoedaTitulo()).concat(rd.getDigitoDAC()).concat(rd.getFatorVencimento()).concat(rd.getValorImpressoCodigoBarras()).concat(rd.getCampoLivre())));
                    System.out.println(rd.toString());
                    System.out.println("CODIGO BOLETO = " + rd.getCodigoCompletoBoleto());
                    System.out.println("CODIGO LINHA DIGITAVEL = " + rd.getCodigoBancoCamaraCompensacao().
                            concat(Integer.toString(rd.getCodigoMoedaTitulo())).
                            concat(rd.getCodigoCompletoBoleto().substring(19, 24)).
                            concat("*").
                            concat(Integer.toString(rd.getTipoRegistro())).
                            concat(rd.getCodigoCompletoBoleto().substring(24, 34)).
                            concat("*").
                            concat(rd.getCodigoCompletoBoleto().substring(34, 44)).
                            concat("*").
                            concat(rd.getCodigoCompletoBoleto().substring(5, 9)).
                            concat(rd.getDigitoDAC()).
                            concat(rd.getCodigoCompletoBoleto().substring(9, 19)));
                    System.out.println(rd.getCodigoCompletoBoleto().substring(20, 24));
                    registros.add(rd);
                } else {
                    rh = FFM.load(RegistroDetalheSegmentoH.class, l);
                    System.out.println(rh.toString());
                    registros.add(rh);
                }
                Boleto b = new Boleto(rd, rh);
                boletos.add(b);
            }
            break;
            case "5": {
                RegistroTrailerLote rtl = FFM.load(RegistroTrailerLote.class, l);
                System.out.println(rtl.toString());
                registros.add(rtl);
            }
            break;
            case "9": {
                RegistroTrailerArquivo rta = FFM.load(RegistroTrailerArquivo.class, l);
                System.out.println(rta.toString());
                registros.add(rta);
            }
            break;

            default:
                System.err.println("Linha N�o lida : " + l);
        }
        return registros;
    }
}
