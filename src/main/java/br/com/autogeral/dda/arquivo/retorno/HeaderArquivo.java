package br.com.autogeral.dda.arquivo.retorno;

import java.util.Date;

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.FixedFormatPattern;
import com.ancientprogramming.fixedformat4j.annotation.Record;

@Record
public class HeaderArquivo implements DebitoDiretoAutorizadoInteface{

    private Integer codigoBanco;
    private String codigoLote;
    private Integer tipoRegistro;
    private String brancosComplemento;
    private Integer codigoInscricao;
    private Long inscricaoNumero;
    private String convenio;
    private String agencia;
    private String digitoVerificadorAgencia;
    private String numeroContaCorrente;
    private String digitoVerificadorConta;
    private String digitoVerificadorAgenciaConta;
    private String nomeEmpresa;
    private String nomeBanco;
    private String brancosComplemento2;
    private Integer codigoArquivo;
    private Date dataGeracao;
    private String horaGeracao;
    private String numeroSequenciaArquivoRetorno;
    private String layoutArquivo;
    private String brancosComplemento3;

    @Field(offset = 1, length = 3)
    public Integer getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(Integer codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    @Field(offset = 4, length = 4)
    public String getCodigoLote() {
        return codigoLote;
    }

    public void setCodigoLote(String codigoLote) {
        this.codigoLote = codigoLote;
    }

    @Field(offset = 8, length = 1)
    public Integer getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(Integer tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    @Field(offset = 9, length = 9)
    public String getBrancosComplemento() {
        return brancosComplemento;
    }

    public void setBrancosComplemento(String brancosComplemento) {
        this.brancosComplemento = brancosComplemento;
    }

    @Field(offset = 18, length = 1)
    public Integer getCodigoInscricao() {
        return codigoInscricao;
    }

    public void setCodigoInscricao(Integer codigoInscricao) {
        this.codigoInscricao = codigoInscricao;
    }

    @Field(offset = 19, length = 14)
    public Long getInscricaoNumero() {
        return inscricaoNumero;
    }

    public void setInscricaoNumero(Long inscricaoNumero) {
        this.inscricaoNumero = inscricaoNumero;
    }

    @Field(offset = 33, length = 20)
    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    @Field(offset = 53, length = 5)
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    @Field(offset = 58, length = 1)
    public String getDigitoVerificadorAgencia() {
        return digitoVerificadorAgencia;
    }

    public void setDigitoVerificadorAgencia(String digitoVerificadorAgencia) {
        this.digitoVerificadorAgencia = digitoVerificadorAgencia;
    }

    @Field(offset = 59, length = 12)
    public String getNumeroContaCorrente() {
        return numeroContaCorrente;
    }

    public void setNumeroContaCorrente(String numeroContaCorrente) {
        this.numeroContaCorrente = numeroContaCorrente;
    }

    @Field(offset = 71, length = 1)
    public String getDigitoVerificadorConta() {
        return digitoVerificadorConta;
    }

    public void setDigitoVerificadorConta(String digitoVerificadorConta) {
        this.digitoVerificadorConta = digitoVerificadorConta;
    }

    @Field(offset = 72, length = 1)
    public String getDigitoVerificadorAgenciaConta() {
        return digitoVerificadorAgenciaConta;
    }

    public void setDigitoVerificadorAgenciaConta(String digitoVerificadorAgenciaConta) {
        this.digitoVerificadorAgenciaConta = digitoVerificadorAgenciaConta;
    }

    @Field(offset = 73, length = 30)
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    @Field(offset = 103, length = 30)
    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    @Field(offset = 133, length = 30)
    public String getBrancosComplemento2() {
        return brancosComplemento2;
    }

    public void setBrancosComplemento2(String brancosComplemento2) {
        this.brancosComplemento2 = brancosComplemento2;
    }

    @Field(offset = 143, length = 1)
    public Integer getCodigoArquivo() {
        return codigoArquivo;
    }

    public void setCodigoArquivo(Integer codigoArquivo) {
        this.codigoArquivo = codigoArquivo;
    }

    @Field(offset = 144, length = 8)
    @FixedFormatPattern("ddMMyyyy")
    public Date getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(Date dataGeracao) {
        this.dataGeracao = dataGeracao;
    }

    @Field(offset = 152, length = 6)
    public String getHoraGeracao() {
        return horaGeracao;
    }

    public void setHoraGeracao(String horaGeracao) {
        this.horaGeracao = horaGeracao;
    }

    @Field(offset = 158, length = 6)
    public String getNumeroSequenciaArquivoRetorno() {
        return numeroSequenciaArquivoRetorno;
    }

    public void setNumeroSequenciaArquivoRetorno(String numeroSequenciaArquivoRetorno) {
        this.numeroSequenciaArquivoRetorno = numeroSequenciaArquivoRetorno;
    }

    @Field(offset = 164, length = 3)
    public String getLayoutArquivo() {
        return layoutArquivo;
    }

    public void setLayoutArquivo(String layoutArquivo) {
        this.layoutArquivo = layoutArquivo;
    }

    @Field(offset = 167, length = 74)
    public String getBrancosComplemento3() {
        return brancosComplemento3;
    }

    public void setBrancosComplemento3(String brancosComplemento3) {
        this.brancosComplemento3 = brancosComplemento3;
    }

    @Override
    public String toString() {
        return "HeaderArquivo{" + "codigoBanco=" + codigoBanco + ", codigoLote=" + codigoLote + ", tipoRegistro=" + tipoRegistro + ", brancosComplemento=" + brancosComplemento + ", codigoInscricao=" + codigoInscricao + ", inscricaoNumero=" + inscricaoNumero + ", convenio=" + convenio + ", agencia=" + agencia + ", digitoVerificadorAgencia=" + digitoVerificadorAgencia + ", numeroContaCorrente=" + numeroContaCorrente + ", digitoVerificadorConta=" + digitoVerificadorConta + ", digitoVerificadorAgenciaConta=" + digitoVerificadorAgenciaConta + ", nomeEmpresa=" + nomeEmpresa + ", nomeBanco=" + nomeBanco + ", brancosComplemento2=" + brancosComplemento2 + ", codigoArquivo=" + codigoArquivo + ", dataGeracao=" + dataGeracao + ", horaGeracao=" + horaGeracao + ", numeroSequenciaArquivoRetorno=" + numeroSequenciaArquivoRetorno + ", layoutArquivo=" + layoutArquivo + ", brancosComplemento3=" + brancosComplemento3 + '}';
    }

}
