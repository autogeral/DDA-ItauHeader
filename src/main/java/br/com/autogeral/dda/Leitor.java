package br.com.autogeral.dda;

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
import java.util.List;

public class Leitor {

    
    public static void main(String[] args) {
        String caminho  = "C:\\Users\\Kaique\\Documents\\Trabalho\\VarreduraDoSacado\\";
       Leitor l = new Leitor();
       File f = new File(caminho);
       l.defineLeitura(f);
    }
    public FixedFormatManager FFM = new FixedFormatManagerImpl();

    public List<DebitoDiretoAutorizadoInteface> defineLeitura(File diretorio) {

        Leitor leitor = new Leitor();
        File arquivos[];
        arquivos = diretorio.listFiles();

        for (File arquivo : arquivos) {
            if (arquivo.getName().toLowerCase().contains("vs")) {
                leitor.lerArquivo(arquivo);
            }
        }

        return null;
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
            System.out.println("Arquivo não encontrado!!");
        }
    }

    public void trataRegistro(String l) {

        String tipoRegistro = l.substring(7,8);
        System.out.println("Linha :" + l);
        switch (tipoRegistro) {

            case "0": {
                HeaderArquivo headerArquivo = FFM.load(HeaderArquivo.class, l);
                System.out.println(headerArquivo.toString());
            }
            break;

            case "1": {
                RegistroHeaderLote rh = FFM.load(RegistroHeaderLote.class, l);
                System.out.println(rh.toString());
            }
            break;
            case "3": {
                if (l.substring(13,14).equals("G")) {
                    RegistroDetalheSegmentoG rd = FFM.load(RegistroDetalheSegmentoG.class, l);
                    System.out.println(rd.toString());
                } else {
                    RegistroDetalheSegmentoH rdh = FFM.load(RegistroDetalheSegmentoH.class, l);
                    System.out.println(rdh.toString());

                }
            }
            break;
            case "5": {
                RegistroTrailerLote rtl = FFM.load(RegistroTrailerLote.class, l);
                System.out.println(rtl.toString());
            }
            break;
            case "9": {
                RegistroTrailerArquivo rta = FFM.load(RegistroTrailerArquivo.class, l);
                System.out.println(rta.toString());

            }
            break;

            default:
                System.err.println("Linha Não lida : " + l);
        }

    }
}
