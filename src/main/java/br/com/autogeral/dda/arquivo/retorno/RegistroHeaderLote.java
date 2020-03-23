package br.com.autogeral.dda.arquivo.retorno;

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

@Record
public class RegistroHeaderLote implements DebitoDiretoAutorizadoInteface {

    private Integer codigoBanco;
    private Integer codigoLote;
    private Integer tipoRegistro;
    private String operacao;
    private Integer codigoServico;
    private String complementoZero;
    private Integer layoutLote;
    private String complementoZero2;
    private Integer tipoInscricao;
    private Long numeroInscricao;
    private String codigoConvenio;
    private Integer agencia;
    private String digitoAgencia;
    private Integer numeroContaCorrente;
    private String digitoContaCorrente;
    private String digitoVerificadorAgenciaContaCorrente;
    private String nomeEmpresa;
    private String complementoZero3;

    @Field(offset = 1, length = 3)
    public Integer getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(Integer codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    @Field(offset = 4, length = 4)
    public Integer getCodigoLote() {
        return codigoLote;
    }

    public void setCodigoLote(Integer codigoLote) {
        this.codigoLote = codigoLote;
    }

    @Field(offset = 8, length = 1)
    public Integer getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(Integer tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    @Field(offset = 9, length = 1)
    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    @Field(offset = 10, length = 2)
    public Integer getCodigoServico() {
        return codigoServico;
    }

    public void setCodigoServico(Integer codigoServico) {
        this.codigoServico = codigoServico;
    }

    @Field(offset = 12, length = 2)
    public String getComplementoZero() {
        return complementoZero;
    }

    public void setComplementoZero(String complementoZero) {
        this.complementoZero = complementoZero;
    }

    @Field(offset = 14, length = 3)
    public Integer getLayoutLote() {
        return layoutLote;
    }

    public void setLayoutLote(Integer layoutLote) {
        this.layoutLote = layoutLote;
    }

    @Field(offset = 17, length = 1)
    public String getComplementoZero2() {
        return complementoZero2;
    }

    public void setComplementoZero2(String complementoZero2) {
        this.complementoZero2 = complementoZero2;
    }

    @Field(offset = 18, length = 1)
    public Integer getTipoInscricao() {
        return tipoInscricao;
    }

    public void setTipoInscricao(Integer tipoInscricao) {
        this.tipoInscricao = tipoInscricao;
    }

    @Field(offset = 19, length = 15)
    public Long getNumeroInscricao() {
        return numeroInscricao;
    }

    public void setNumeroInscricao(Long numeroInscricao) {
        this.numeroInscricao = numeroInscricao;
    }

    @Field(offset = 34, length = 20)
    public String getCodigoConvenio() {
        return codigoConvenio;
    }

    public void setCodigoConvenio(String codigoConvenio) {
        this.codigoConvenio = codigoConvenio;
    }

    @Field(offset = 54, length = 5)
    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    @Field(offset = 59, length = 1)
    public String getDigitoAgencia() {
        return digitoAgencia;
    }

    public void setDigitoAgencia(String digitoAgencia) {
        this.digitoAgencia = digitoAgencia;
    }

    @Field(offset = 60, length = 12)
    public Integer getNumeroContaCorrente() {
        return numeroContaCorrente;
    }

    public void setNumeroContaCorrente(Integer numeroContaCorrente) {
        this.numeroContaCorrente = numeroContaCorrente;
    }

    @Field(offset = 72, length = 1)
    public String getDigitoContaCorrente() {
        return digitoContaCorrente;
    }

    public void setDigitoContaCorrente(String digitoContaCorrente) {
        this.digitoContaCorrente = digitoContaCorrente;
    }

    @Field(offset = 73, length = 1)
    public String getDigitoVerificadorAgenciaContaCorrente() {
        return digitoVerificadorAgenciaContaCorrente;
    }

    public void setDigitoVerificadorAgenciaContaCorrente(String digitoVerificadorAgenciaContaCorrente) {
        this.digitoVerificadorAgenciaContaCorrente = digitoVerificadorAgenciaContaCorrente;
    }

    @Field(offset = 74, length = 30)
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    @Field(offset = 104, length = 137)
    public String getComplementoZero3() {
        return complementoZero3;
    }

    public void setComplementoZero3(String complementoZero3) {
        this.complementoZero3 = complementoZero3;
    }

    @Override
    public String toString() {
        return "RegistroHeaderLote{" + "codigoBanco=" + codigoBanco + ", codigoLote=" + codigoLote + ", tipoRegistro=" + tipoRegistro + ", operacao=" + operacao + ", codigoServico=" + codigoServico + ", complementoZero=" + complementoZero + ", layoutLote=" + layoutLote + ", complementoZero2=" + complementoZero2 + ", tipoInscricao=" + tipoInscricao + ", numeroInscricao=" + numeroInscricao + ", codigoConvenio=" + codigoConvenio + ", agencia=" + agencia + ", digitoAgencia=" + digitoAgencia + ", numeroContaCorrente=" + numeroContaCorrente + ", digitoContaCorrente=" + digitoContaCorrente + ", digitoVerificadorAgenciaContaCorrente=" + digitoVerificadorAgenciaContaCorrente + ", nomeEmpresa=" + nomeEmpresa + ", complementoZero3=" + complementoZero3 + '}';
    }

}
