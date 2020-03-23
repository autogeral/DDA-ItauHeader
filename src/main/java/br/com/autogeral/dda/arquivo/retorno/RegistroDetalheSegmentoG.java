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
    private Integer codigoMovimento;
    private Integer codigoBancoCamaraCompensacao;
    private String codigoMoeda;
    private Integer digitoDAC;
    private String fatorVencimento;
    private Double valorImpressoCodigoBarras;
    private String campoLivre;
    private Integer tipoInscricao;
    private Long numeroInscricao;
    private String nomeCedente;
    private Date vencimentoTitulo;
    private Double valorTitulo;
    private Double moeda;
    private Integer codigoMoedaTitulo;
    private String numeroDocumento;
    private Integer agenciaCobradora;
    private Integer digitoDACtitulo;
    private Integer pracaCobradora;
    private Integer modalidadeCarteira;
    private Integer especieTitulo;
    private Date dataEmissaoTitulo;
    private Double jurosMora;
    private Integer codigoPrimeiroDesconto;
    private Date dataPrimeiroDesconto;
    private Double valorPrimeiroDesconto;
    private Integer codigoProtesto;
    private Integer prazoProtesto;
    private Date dataLimite;
    private Integer codigoJurosMora;

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
    public Integer getCodigoMovimento() {
        return codigoMovimento;
    }

    public void setCodigoMovimento(Integer codigoMovimento) {
        this.codigoMovimento = codigoMovimento;
    }

    @Field(offset = 18, length = 3)
    public Integer getCodigoBancoCamaraCompensacao() {
        return codigoBancoCamaraCompensacao;
    }

    public void setCodigoBancoCamaraCompensacao(Integer codigoBancoCamaraCompensacao) {
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
    public Integer getDigitoDAC() {
        return digitoDAC;
    }

    public void setDigitoDAC(Integer digitoDAC) {
        this.digitoDAC = digitoDAC;
    }

    @Field(offset = 23, length = 4)
    public String getFatorVencimento() {
        return fatorVencimento;
    }

    public void setFatorVencimento(String dataFatorVencimento) {
        this.fatorVencimento = dataFatorVencimento;
    }

    @Field(offset = 27, length = 8)
    public Double getValorImpressoCodigoBarras() {
        return valorImpressoCodigoBarras;
    }

    public void setValorImpressoCodigoBarras(Double valorImpressoCodigoBarras) {
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
    public Integer getTipoInscricao() {
        return tipoInscricao;
    }

    public void setTipoInscricao(Integer tipoInscricao) {
        this.tipoInscricao = tipoInscricao;
    }

    @Field(offset = 63, length = 15)
    public Long getNumeroInscricao() {
        return numeroInscricao;
    }

    public void setNumeroInscricao(Long numeroInscricao) {
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

    @Field(offset = 131, length = 14)
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
    public Integer getAgenciaCobradora() {
        return agenciaCobradora;
    }

    public void setAgenciaCobradora(Integer agenciaCobradora) {
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
    public Integer getPracaCobradora() {
        return pracaCobradora;
    }

    public void setPracaCobradora(Integer pracaCobradora) {
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
    public Integer getEspecieTitulo() {
        return especieTitulo;
    }

    public void setEspecieTitulo(Integer especieTitulo) {
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
    public Date getDataPrimeiroDesconto() {
        return dataPrimeiroDesconto;
    }

    public void setDataPrimeiroDesconto(Date dataPrimeiroDesconto) {
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

    @Override
    public String toString() {
        return "RegistroDetalheSegmentoG{" + "codigoBanco=" + codigoBanco + ", codigoLote=" + codigoLote + ", tipoRegistro=" + tipoRegistro + ", codigoSequencial=" + codigoSequencial + ", codigoSegmento=" + codigoSegmento + ", complementoBranco=" + complementoBranco + ", codigoMovimento=" + codigoMovimento + ", codigoBancoCamaraCompensacao=" + codigoBancoCamaraCompensacao + ", codigoMoeda=" + codigoMoeda + ", digitoDAC=" + digitoDAC + ", fatorVencimento=" + fatorVencimento + ", valorImpressoCodigoBarras=" + valorImpressoCodigoBarras + ", campoLivre=" + campoLivre + ", tipoInscricao=" + tipoInscricao + ", numeroInscricao=" + numeroInscricao + ", nomeCedente=" + nomeCedente + ", vencimentoTitulo=" + vencimentoTitulo + ", valorTitulo=" + valorTitulo + ", moeda=" + moeda + ", codigoMoedaTitulo=" + codigoMoedaTitulo + ", numeroDocumento=" + numeroDocumento + ", agenciaCobradora=" + agenciaCobradora + ", digitoDACtitulo=" + digitoDACtitulo + ", pracaCobradora=" + pracaCobradora + ", modalidadeCarteira=" + modalidadeCarteira + ", especieTitulo=" + especieTitulo + ", dataEmissaoTitulo=" + dataEmissaoTitulo + ", jurosMora=" + jurosMora + ", codigoPrimeiroDesconto=" + codigoPrimeiroDesconto + ", dataPrimeiroDesconto=" + dataPrimeiroDesconto + ", valorPrimeiroDesconto=" + valorPrimeiroDesconto + ", codigoProtesto=" + codigoProtesto + ", prazoProtesto=" + prazoProtesto + ", dataLimite=" + dataLimite + ", codigoJurosMora=" + codigoJurosMora + '}';
    }

}
