
import br.com.autogeral.dda.arquivo.retorno.HeaderArquivo;
import br.com.autogeral.dda.arquivo.retorno.RegistroDetalheSegmentoG;
import br.com.autogeral.dda.arquivo.retorno.RegistroDetalheSegmentoH;
import br.com.autogeral.dda.arquivo.retorno.RegistroHeaderLote;
import br.com.autogeral.dda.arquivo.retorno.RegistroTrailerArquivo;
import br.com.autogeral.dda.arquivo.retorno.RegistroTrailerLote;
import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kaique
 */

public class TesteLeitor {
    
    public static FixedFormatManager FFM = new FixedFormatManagerImpl();
    
    public static void main(String[] args) {

        String t1 = "34100000         205437537000137                    00000 000000000000  AUTO GERAL AUTOPECAS LTDA.    BANCO ITAU S.A.                         202032020073339000006084                                                                          ";

        HeaderArquivo headerArquivo = FFM.load(HeaderArquivo.class, t1);
        System.out.println(headerArquivo.toString());

        String t2 = "34100011I0300022 2005437537000137                    00000 000000000000  AUTO GERAL AUTOPECAS LTDA.                                                                                                                                             ";
        RegistroHeaderLote rh = FFM.load(RegistroHeaderLote.class, t2);
        System.out.println(rh.toString());

        String t3 = "3410001300001G 02237958175000409968023740920000501819024100002059275792000150GENERAL MOTORS DO BRASIL LTDA 24022020000000004099680000000000000000092000050181     000000          10220022020000000000004100 00000000000000000000000000240420201";
        RegistroDetalheSegmentoG rd = FFM.load(RegistroDetalheSegmentoG.class, t3);
        System.out.println(rd.toString());

        String t4 = "3410001300014H 022011081096000186TUPER DISTR DE ESCAPAMENTOS S            00000000000000000000000 00000000000000000000000301010001000000000000000000000000000000                                                                                ";
        RegistroDetalheSegmentoH rdh = FFM.load(RegistroDetalheSegmentoH.class, t4);
        System.out.println(rdh.toString());

        String t5 = "34100015         000272000000000037520435000000000000000000                                                                                                                                                                                     ";
        RegistroTrailerLote rt = FFM.load(RegistroTrailerLote.class, t5);
        System.out.println(rt.toString());

        String t6 = "34199999         000001000274                                                                                                                                                                                                                   ";
        RegistroTrailerArquivo rta = FFM.load(RegistroTrailerArquivo.class, t6);
        System.out.println(rta.toString());

    }
}
