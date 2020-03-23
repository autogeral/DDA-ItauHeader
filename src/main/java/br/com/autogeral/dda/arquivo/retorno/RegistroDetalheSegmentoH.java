package br.com.autogeral.dda.arquivo.retorno;

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.FixedFormatPattern;
import java.util.Date;

import com.ancientprogramming.fixedformat4j.annotation.Record;

@Record
public class RegistroDetalheSegmentoH implements DebitoDiretoAutorizadoInteface {

    private Integer codigoBanco;
    private Integer codigoLote;
    private Integer tipoRegistro;
    private Integer codigoSegmento;
    private String complementoBranco;
    private Integer codigoMovimento;
    private Integer codigoInscricaoAvalista;
    private Integer inscricaoNumero;
    private String sacadorAvalista;
    private Integer codigoSegundoDesconto;
    private Date dataSegundoDesconto;
    private Double valorSegundoDesconto;
    private Integer codigoTerceiroDesconto;
    private Date dataTerceiroDesconto;
    private Double valorTerceiroDesconto;
    private Integer codigoMulta;
    private Date dataMulta;
    private Double valorMulta;
    private Double valorAbatimento;
    private String instrucao1;
    private String instrucao2;

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

    @Field(offset = 9, length = 5)
    public Integer getCodigoSegmento() {
        return codigoSegmento;
    }

    public void setCodigoSegmento(Integer codigoSegmento) {
        this.codigoSegmento = codigoSegmento;
    }

    @Field(offset = 14, length = 1)
    public String getComplementoBranco() {
        return complementoBranco;
    }

    public void setComplementoBranco(String complementoBranco) {
        this.complementoBranco = complementoBranco;
    }

    @Field(offset = 15, length = 1)
    public Integer getCodigoMovimento() {
        return codigoMovimento;
    }

    public void setCodigoMovimento(Integer codigoMovimento) {
        this.codigoMovimento = codigoMovimento;
    }

    @Field(offset = 16, length = 2)
    public Integer getCodigoInscricaoAvalista() {
        return codigoInscricaoAvalista;
    }

    public void setCodigoInscricaoAvalista(Integer codigoInscricaoAvalista) {
        this.codigoInscricaoAvalista = codigoInscricaoAvalista;
    }

    @Field(offset = 18, length = 1)
    public Integer getInscricaoNumero() {
        return inscricaoNumero;
    }

    public void setInscricaoNumero(Integer inscricaoNumero) {
        this.inscricaoNumero = inscricaoNumero;
    }

    @Field(offset = 34, length = 40)
    public String getSacadorAvalista() {
        return sacadorAvalista;
    }

    public void setSacadorAvalista(String sacadorAvalista) {
        this.sacadorAvalista = sacadorAvalista;
    }

    @Field(offset = 74, length = 1)
    public Integer getCodigoSegundoDesconto() {
        return codigoSegundoDesconto;
    }

    public void setCodigoSegundoDesconto(Integer codigoSegundoDesconto) {
        this.codigoSegundoDesconto = codigoSegundoDesconto;
    }

    @Field(offset = 75, length = 8)
    @FixedFormatPattern("ddMMyyyy")
    public Date getDataSegundoDesconto() {
        return dataSegundoDesconto;
    }

    public void setDataSegundoDesconto(Date dataSegundoDesconto) {
        this.dataSegundoDesconto = dataSegundoDesconto;
    }

    @Field(offset = 83, length = 15)
    public Double getValorSegundoDesconto() {
        return valorSegundoDesconto;
    }

    public void setValorSegundoDesconto(Double valorSegundoDesconto) {
        this.valorSegundoDesconto = valorSegundoDesconto;
    }

    @Field(offset = 98, length = 1)
    public Integer getCodigoTerceiroDesconto() {
        return codigoTerceiroDesconto;
    }

    public void setCodigoTerceiroDesconto(Integer codigoTerceiroDesconto) {
        this.codigoTerceiroDesconto = codigoTerceiroDesconto;
    }

    @Field(offset = 99, length = 8)
    @FixedFormatPattern("ddMMyyyy")
    public Date getDataTerceiroDesconto() {
        return dataTerceiroDesconto;
    }

    public void setDataTerceiroDesconto(Date dataTerceiroDesconto) {
        this.dataTerceiroDesconto = dataTerceiroDesconto;
    }

    @Field(offset = 107, length = 15)
    public Double getValorTerceiroDesconto() {
        return valorTerceiroDesconto;
    }

    public void setValorTerceiroDesconto(Double valorTerceiroDesconto) {
        this.valorTerceiroDesconto = valorTerceiroDesconto;
    }

    @Field(offset = 122, length = 1)
    public Integer getCodigoMulta() {
        return codigoMulta;
    }

    public void setCodigoMulta(Integer codigoMulta) {
        this.codigoMulta = codigoMulta;
    }

    @Field(offset = 123, length = 8)
    @FixedFormatPattern("ddMMyyyy")
    public Date getDataMulta() {
        return dataMulta;
    }

    public void setDataMulta(Date dataMulta) {
        this.dataMulta = dataMulta;
    }

    @Field(offset = 131, length = 15)
    public Double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(Double valorMulta) {
        this.valorMulta = valorMulta;
    }

    @Field(offset = 146, length = 15)
    public Double getValorAbatimento() {
        return valorAbatimento;
    }

    public void setValorAbatimento(Double valorAbatimento) {
        this.valorAbatimento = valorAbatimento;
    }

    @Field(offset = 161, length = 40)
    public String getInstrucao1() {
        return instrucao1;
    }

    public void setInstrucao1(String instrucao1) {
        this.instrucao1 = instrucao1;
    }

    @Field(offset = 201, length = 40)
    public String getInstrucao2() {
        return instrucao2;
    }

    public void setInstrucao2(String instrucao2) {
        this.instrucao2 = instrucao2;
    }

    @Override
    public String toString() {
        return "RegistroDetalheSegmentoH{" + "codigoBanco=" + codigoBanco + ", codigoLote=" + codigoLote + ", tipoRegistro=" + tipoRegistro + ", codigoSegmento=" + codigoSegmento + ", complementoBranco=" + complementoBranco + ", codigoMovimento=" + codigoMovimento + ", codigoInscricaoAvalista=" + codigoInscricaoAvalista + ", inscricaoNumero=" + inscricaoNumero + ", sacadorAvalista=" + sacadorAvalista + ", codigoSegundoDesconto=" + codigoSegundoDesconto + ", dataSegundoDesconto=" + dataSegundoDesconto + ", valorSegundoDesconto=" + valorSegundoDesconto + ", codigoTerceiroDesconto=" + codigoTerceiroDesconto + ", dataTerceiroDesconto=" + dataTerceiroDesconto + ", valorTerceiroDesconto=" + valorTerceiroDesconto + ", codigoMulta=" + codigoMulta + ", dataMulta=" + dataMulta + ", valorMulta=" + valorMulta + ", valorAbatimento=" + valorAbatimento + ", instrucao1=" + instrucao1 + ", instrucao2=" + instrucao2 + '}';
    }
    
    

}
