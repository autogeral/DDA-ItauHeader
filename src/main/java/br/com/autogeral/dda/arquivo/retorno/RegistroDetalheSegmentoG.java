package br.com.autogeral.dda.arquivo.retorno;

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.FixedFormatPattern;
import java.util.Date;

import com.ancientprogramming.fixedformat4j.annotation.Record;

@Record
public class RegistroDetalheSegmentoG implements DebitoDiretoAutorizadoInteface{

    private Integer codigoBanco;
    private String codigoLote;
    private Integer tipoRegistro;
    private String codigoSequencial;
    private String codigoSegmento;
    private String complementoBranco;
    private String codigoMovimento;
    private String codigoBancoCamaraCompensacao;
    private String codigoMoeda;
    private String digitoDAC;
    private String fatorVencimento;
    private String valorImpressoCodigoBarras;
    private String campoLivre;
    private String tipoInscricao;
    private String numeroInscricao;
    private String nomeCedente;
    private Date vencimentoTitulo;
    private Double valorTitulo;
    private Double moeda;
    private Integer codigoMoedaTitulo;
    private String numeroDocumento;
    private String agenciaCobradora;
    private Integer digitoDACtitulo;
    private String pracaCobradora;
    private Integer modalidadeCarteira;
    private String especieTitulo;
    private Date dataEmissaoTitulo;
    private Double jurosMora;
    private Integer codigoPrimeiroDesconto;
    private String dataPrimeiroDesconto;
    private Double valorPrimeiroDesconto;
    private Integer codigoProtesto;
    private Integer prazoProtesto;
    private Date dataLimite;
    private Integer codigoJurosMora;
    private String codigoCompletoBoleto;

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

    @Field(offset = 9, length = 5)
    public String getCodigoSequencial() {
        return codigoSequencial;
    }

    public void setCodigoSequencial(String codigoSequencial) {
        this.codigoSequencial = codigoSequencial;
    }

    @Field(offset = 14, length = 1)
    public String getCodigoSegmento() {
        return codigoSegmento;
    }

    public void setCodigoSegmento(String codigoSegmento) {
        this.codigoSegmento = codigoSegmento;
    }

    @Field(offset = 15, length = 1)
    public String getComplementoBranco() {
        return complementoBranco;
    }

    public void setComplementoBranco(String complementoBranco) {
        this.complementoBranco = complementoBranco;
    }

    @Field(offset = 16, length = 2)
    public String getCodigoMovimento() {
        return codigoMovimento;
    }

    public void setCodigoMovimento(String codigoMovimento) {
        this.codigoMovimento = codigoMovimento;
    }

    @Field(offset = 18, length = 3)
    public String getCodigoBancoCamaraCompensacao() {
        return codigoBancoCamaraCompensacao;
    }

    public void setCodigoBancoCamaraCompensacao(String codigoBancoCamaraCompensacao) {
        this.codigoBancoCamaraCompensacao = codigoBancoCamaraCompensacao;
    }

    @Field(offset = 21, length = 1)
    public String getCodigoMoeda() {
        return codigoMoeda;
    }

    public void setCodigoMoeda(String codigoMoeda) {
        this.codigoMoeda = codigoMoeda;
    }

    @Field(offset = 22, length = 1)
    public String getDigitoDAC() {
        return digitoDAC;
    }

    public void setDigitoDAC(String digitoDAC) {
        this.digitoDAC = digitoDAC;
    }

    @Field(offset = 23, length = 4)
    public String getFatorVencimento() {
        return fatorVencimento;
    }

    public void setFatorVencimento(String dataFatorVencimento) {
        this.fatorVencimento = dataFatorVencimento;
    }

    @Field(offset = 27, length = 10)
    public String getValorImpressoCodigoBarras() {
        return valorImpressoCodigoBarras;
    }

    public void setValorImpressoCodigoBarras(String valorImpressoCodigoBarras) {
        this.valorImpressoCodigoBarras = valorImpressoCodigoBarras;
    }

    @Field(offset = 37, length = 25)
    public String getCampoLivre() {
        return campoLivre;
    }

    public void setCampoLivre(String campoLivre) {
        this.campoLivre = campoLivre;
    }

    @Field(offset = 62, length = 1)
    public String getTipoInscricao() {
        return tipoInscricao;
    }

    public void setTipoInscricao(String tipoInscricao) {
        this.tipoInscricao = tipoInscricao;
    }

    @Field(offset = 63, length = 15)
    public String getNumeroInscricao() {
        return numeroInscricao;
    }

    public void setNumeroInscricao(String numeroInscricao) {
        this.numeroInscricao = numeroInscricao;
    }

    @Field(offset = 78, length = 30)
    public String getNomeCedente() {
        return nomeCedente;
    }

    public void setNomeCedente(String nomeCedente) {
        this.nomeCedente = nomeCedente;
    }

    @Field(offset = 108, length = 8)
    @FixedFormatPattern("ddMMyyyy")
    public Date getVencimentoTitulo() {
        return vencimentoTitulo;
    }

    public void setVencimentoTitulo(Date vencimentoTitulo) {
        this.vencimentoTitulo = vencimentoTitulo;
    }

    @Field(offset = 116, length = 15)
    public Double getValorTitulo() {
        return valorTitulo;
    }

    public void setValorTitulo(Double valorTitulo) {
        this.valorTitulo = valorTitulo;
    }

    @Field(offset = 131, length = 15)
    public Double getMoeda() {
        return moeda;
    }

    public void setMoeda(Double moeda) {
        this.moeda = moeda;
    }

    @Field(offset = 146, length = 2)
    public Integer getCodigoMoedaTitulo() {
        return codigoMoedaTitulo;
    }

    public void setCodigoMoedaTitulo(Integer codigoMoedaTitulo) {
        this.codigoMoedaTitulo = codigoMoedaTitulo;
    }

    @Field(offset = 148, length = 15)
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    @Field(offset = 163, length = 5)
    public String getAgenciaCobradora() {
        return agenciaCobradora;
    }

    public void setAgenciaCobradora(String agenciaCobradora) {
        this.agenciaCobradora = agenciaCobradora;
    }

    @Field(offset = 168, length = 1)
    public Integer getDigitoDACtitulo() {
        return digitoDACtitulo;
    }

    public void setDigitoDACtitulo(Integer digitoDACtitulo) {
        this.digitoDACtitulo = digitoDACtitulo;
    }

    @Field(offset = 169, length = 10)
    public String getPracaCobradora() {
        return pracaCobradora;
    }

    public void setPracaCobradora(String pracaCobradora) {
        this.pracaCobradora = pracaCobradora;
    }

    @Field(offset = 179, length = 1)
    public Integer getModalidadeCarteira() {
        return modalidadeCarteira;
    }

    public void setModalidadeCarteira(Integer modalidadeCarteira) {
        this.modalidadeCarteira = modalidadeCarteira;
    }

    @Field(offset = 180, length = 2)
    public String getEspecieTitulo() {
        return especieTitulo;
    }

    public void setEspecieTitulo(String especieTitulo) {
        this.especieTitulo = especieTitulo;
    }

    @Field(offset = 182, length = 8)
    @FixedFormatPattern("ddMMyyyy")
    public Date getDataEmissaoTitulo() {
        return dataEmissaoTitulo;
    }

    public void setDataEmissaoTitulo(Date dataEmissaoTitulo) {
        this.dataEmissaoTitulo = dataEmissaoTitulo;
    }

    @Field(offset = 190, length = 15)
    public Double getJurosMora() {
        return jurosMora;
    }

    public void setJurosMora(Double jurosMora) {
        this.jurosMora = jurosMora;
    }

    @Field(offset = 205, length = 1)
    public Integer getCodigoPrimeiroDesconto() {
        return codigoPrimeiroDesconto;
    }

    public void setCodigoPrimeiroDesconto(Integer codigoPrimeiroDesconto) {
        this.codigoPrimeiroDesconto = codigoPrimeiroDesconto;
    }

    @Field(offset = 206, length = 8)
    @FixedFormatPattern("ddMMyyyy")
    public String getDataPrimeiroDesconto() {
        return dataPrimeiroDesconto;
    }

    public void setDataPrimeiroDesconto(String dataPrimeiroDesconto) {
        this.dataPrimeiroDesconto = dataPrimeiroDesconto;
    }

    @Field(offset = 214, length = 15)
    public Double getValorPrimeiroDesconto() {
        return valorPrimeiroDesconto;
    }

    public void setValorPrimeiroDesconto(Double valorPrimeiroDesconto) {
        this.valorPrimeiroDesconto = valorPrimeiroDesconto;
    }

    @Field(offset = 229, length = 1)
    public Integer getCodigoProtesto() {
        return codigoProtesto;
    }

    public void setCodigoProtesto(Integer codigoProtesto) {
        this.codigoProtesto = codigoProtesto;
    }

    @Field(offset = 230, length = 2)
    public Integer getPrazoProtesto() {
        return prazoProtesto;
    }

    public void setPrazoProtesto(Integer prazoProtesto) {
        this.prazoProtesto = prazoProtesto;
    }

    @Field(offset = 232, length = 8)
    @FixedFormatPattern("ddMMyyyy")
    public Date getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(Date dataLimite) {
        this.dataLimite = dataLimite;
    }

    @Field(offset = 240, length = 1)
    public Integer getCodigoJurosMora() {
        return codigoJurosMora;
    }

    public void setCodigoJurosMora(Integer codigoJurosMora) {
        this.codigoJurosMora = codigoJurosMora;
    }

    public String getCodigoCompletoBoleto() {
        return codigoCompletoBoleto;
    }

    public void setCodigoCompletoBoleto(String codigoCompletoBoleto) {
        this.codigoCompletoBoleto = codigoCompletoBoleto;
    }
    
    

    @Override
    public String toString() {
        return "RegistroDetalheSegmentoG{" + "codigoBanco=" + codigoBanco + ", codigoLote=" + codigoLote + ", tipoRegistro=" + tipoRegistro + ", codigoSequencial=" + codigoSequencial + ", codigoSegmento=" + codigoSegmento + ", complementoBranco=" + complementoBranco + ", codigoMovimento=" + codigoMovimento + ", codigoBancoCamaraCompensacao=" + codigoBancoCamaraCompensacao + ", codigoMoeda=" + codigoMoeda + ", digitoDAC=" + digitoDAC + ", fatorVencimento=" + fatorVencimento + ", valorImpressoCodigoBarras=" + valorImpressoCodigoBarras + ", campoLivre=" + campoLivre + ", tipoInscricao=" + tipoInscricao + ", numeroInscricao=" + numeroInscricao + ", nomeCedente=" + nomeCedente + ", vencimentoTitulo=" + vencimentoTitulo + ", valorTitulo=" + valorTitulo + ", moeda=" + moeda + ", codigoMoedaTitulo=" + codigoMoedaTitulo + ", numeroDocumento=" + numeroDocumento + ", agenciaCobradora=" + agenciaCobradora + ", digitoDACtitulo=" + digitoDACtitulo + ", pracaCobradora=" + pracaCobradora + ", modalidadeCarteira=" + modalidadeCarteira + ", especieTitulo=" + especieTitulo + ", dataEmissaoTitulo=" + dataEmissaoTitulo + ", jurosMora=" + jurosMora + ", codigoPrimeiroDesconto=" + codigoPrimeiroDesconto + ", dataPrimeiroDesconto=" + dataPrimeiroDesconto + ", valorPrimeiroDesconto=" + valorPrimeiroDesconto + ", codigoProtesto=" + codigoProtesto + ", prazoProtesto=" + prazoProtesto + ", dataLimite=" + dataLimite + ", codigoJurosMora=" + codigoJurosMora + '}';
    }
    
    
}
