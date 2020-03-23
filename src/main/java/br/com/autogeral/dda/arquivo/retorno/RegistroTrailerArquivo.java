/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.autogeral.dda.arquivo.retorno;

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 * 23/03/2020 13:13:32
 *
 * @author kaique.mota
 */
@Record
public class RegistroTrailerArquivo implements DebitoDiretoAutorizadoInteface {

    private Integer codigoBanco;
    private Integer codigoLote;
    private Integer tipoRegistro;
    private String complementoBranco;
    private Integer totalLotes;
    private Integer totalRegistros;
    private Double quantidadeTotalMoeda;
    private String complementoBranco2;

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

    @Field(offset = 9, length = 9)
    public String getComplementoBranco() {
        return complementoBranco;
    }

    public void setComplementoBranco(String complementoBranco) {
        this.complementoBranco = complementoBranco;
    }

    @Field(offset = 18, length = 6)
    public Integer getTotalLotes() {
        return totalLotes;
    }

    public void setTotalLotes(Integer totalLotes) {
        this.totalLotes = totalLotes;
    }

    @Field(offset = 24, length = 18)
    public Integer getTotalRegistros() {
        return totalRegistros;
    }

    public void setTotalRegistros(Integer totalRegistros) {
        this.totalRegistros = totalRegistros;
    }

    @Field(offset = 42, length = 18)

    public Double getQuantidadeTotalMoeda() {
        return quantidadeTotalMoeda;
    }

    public void setQuantidadeTotalMoeda(Double quantidadeTotalMoeda) {
        this.quantidadeTotalMoeda = quantidadeTotalMoeda;
    }

    @Field(offset = 60, length = 181)
    public String getComplementoBranco2() {
        return complementoBranco2;
    }

    public void setComplementoBranco2(String complementoBranco2) {
        this.complementoBranco2 = complementoBranco2;
    }

    @Override
    public String toString() {
        return "RegistroTrailerArquivo{" + "codigoBanco=" + codigoBanco + ", codigoLote=" + codigoLote + ", tipoRegistro=" + tipoRegistro + ", complementoBranco=" + complementoBranco + ", totalLotes=" + totalLotes + ", totalRegistros=" + totalRegistros + ", quantidadeTotalMoeda=" + quantidadeTotalMoeda + ", complementoBranco2=" + complementoBranco2 + '}';
    }

}
