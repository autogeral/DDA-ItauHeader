package br.com.autogeral.dda.arquivo.retorno.test;

import br.com.autogeral.dda.arquivo.retorno.RegistroDetalheSegmentoG;

import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import org.junit.Assert;

import org.junit.Test;

public class RegistroDetalheSementoGTest {

    Integer codigoBanco = 341;
    String codigoLote = "0001";
    Integer tipoRegistro = 3;
    String codigoSequencial = "00055";
    String codigoSegmento = "G";
    String complementoBranco = "";
    String codigoMovimento = "01";
    String codigoBancoCamaraCompensacao = "237";
    String codigoMoeda = "9";
    String digitoDAC = "6";
    String fatorVencimento = "8196";
    String valorImpressoCodigoBarra = "0000040000";
    String campoLivre = "6549090069000000300062700";
    String tipoInscricao = "2";
    String numeroInscricao = "033358107000165";
    String nomeCedente = "DEBORA SETTANI PINTO GONCALVES";
    Date vencimentoTitulo;
    //Double valorTitulo = "000000000040000";
    Double moeda = 0.0;
    String codigoMoedaTitulo = "09";
    String numeroDocumento = "27";
    String agenciaCobradora = "00000";
    Integer digitoDACtitulo = 0;
    String pracaCobradora = "";
    Integer modalidadeCarteira = 1;
    String especieTitulo = "02";
    Date dataEmissaoTitulo = java.sql.Date.valueOf(LocalDate.parse("09032020", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Double jurosMora = 0.0;
    Integer codigoPrimeiroDesconto = 0;
    // Date dataPrimeiroDesconto = java.sql.Date.valueOf(LocalDate.parse("00000000", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Double valorPrimeiroDesconto = 0.0;
    Integer codigoProtesto = 0;
    Integer prazoProtesto = 0;
    Date dataLimite = java.sql.Date.valueOf(LocalDate.parse("15052020", DateTimeFormatter.ofPattern("ddMMyyyy")));
    Integer codigoJurosMora = 5;
    public static FixedFormatManager FFM = new FixedFormatManagerImpl();

    @Test
    public void test() {
        String t = "3410001300055G 01237968196000004000065490900690000003000627002033358107000165DEBORA SETTANI PINTO GONCALVES160320200000000000400000000000000000000927             000000          10209032020000000000000000 00000000000000000000000000150520205";
        RegistroDetalheSegmentoG rd = FFM.load(RegistroDetalheSegmentoG.class, t);
        System.out.println(rd.toString());

        Assert.assertEquals(rd.getCodigoBanco(), codigoBanco);
        Assert.assertEquals(rd.getCodigoLote(), codigoLote);
        Assert.assertEquals(rd.getTipoRegistro(), tipoRegistro);
        Assert.assertEquals(rd.getCodigoSequencial(), codigoSequencial);
        Assert.assertEquals(rd.getCodigoSegmento(), codigoSegmento);
        Assert.assertEquals(rd.getComplementoBranco(), complementoBranco);
        Assert.assertEquals(rd.getCodigoMovimento(), codigoMovimento);
        Assert.assertEquals(rd.getCodigoBancoCamaraCompensacao(), codigoBancoCamaraCompensacao);
        Assert.assertEquals(rd.getCodigoMoeda(), codigoMoeda);
        Assert.assertEquals(rd.getDigitoDAC(), digitoDAC);
        Assert.assertEquals(rd.getFatorVencimento(), fatorVencimento);
        Assert.assertEquals(rd.getValorImpressoCodigoBarras(), valorImpressoCodigoBarra);
        Assert.assertEquals(rd.getCampoLivre(), campoLivre);
        Assert.assertEquals(rd.getTipoInscricao(), tipoInscricao);
        Assert.assertEquals(rd.getNumeroInscricao(), numeroInscricao);
        Assert.assertEquals(rd.getNomeCedente(), nomeCedente);
        Assert.assertEquals(rd.getCodigoMoedaTitulo(), codigoMoedaTitulo);
        Assert.assertEquals(rd.getAgenciaCobradora(), agenciaCobradora);
        Assert.assertEquals(rd.getDigitoDAC(), digitoDAC);
        Assert.assertEquals(rd.getPracaCobradora(), pracaCobradora);
        Assert.assertEquals(rd.getModalidadeCarteira(), modalidadeCarteira);
        Assert.assertEquals(rd.getEspecieTitulo(), especieTitulo);
        Assert.assertEquals(rd.getDataEmissaoTitulo(), dataEmissaoTitulo);
        Assert.assertEquals(rd.getJurosMora(), jurosMora);
        Assert.assertEquals(rd.getCodigoPrimeiroDesconto(), codigoPrimeiroDesconto);
        Assert.assertEquals(rd.getValorPrimeiroDesconto(), valorPrimeiroDesconto);
        Assert.assertEquals(rd.getCodigoProtesto(), codigoProtesto);
        Assert.assertEquals(rd.getPrazoProtesto(), prazoProtesto);
        Assert.assertEquals(rd.getDataLimite(), dataLimite);
        Assert.assertEquals(rd.getCodigoJurosMora(), codigoJurosMora);

        String codigoBoleto = rd.getCodigoBancoCamaraCompensacao().concat(Integer.toString(rd.getCodigoMoedaTitulo()).concat(rd.getDigitoDAC()).concat(rd.getFatorVencimento()).concat(rd.getValorImpressoCodigoBarras()).concat(rd.getCampoLivre()));
        System.out.println("CODIGO BOLETO = " + codigoBoleto);
    }
}
