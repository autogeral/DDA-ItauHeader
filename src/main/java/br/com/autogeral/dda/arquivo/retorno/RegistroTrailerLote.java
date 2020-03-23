/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.autogeral.dda.arquivo.retorno;

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 *
 * @author Kaique
 */
@Record
public class RegistroTrailerLote  implements DebitoDiretoAutorizadoInteface {

    private Integer codigoBanco;
    private String codigoLote;
    private Integer tipoRegistro;
    private String complementoBranco;
    private Integer quantidadeRegistro;
    private Double valorTitulos;
    private Double quantidadeMoeda;
    private String complementeBranco2;

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
    public String getComplementoBranco() {
        return complementoBranco;
    }

    public void setComplementoBranco(String complementoBranco) {
        this.complementoBranco = complementoBranco;
    }

    @Field(offset = 18, length = 6)
    public Integer getQuantidadeRegistro() {
        return quantidadeRegistro;
    }

    public void setQuantidadeRegistro(Integer quantidadeRegistro) {
        this.quantidadeRegistro = quantidadeRegistro;
    }

    @Field(offset = 24, length = 15)
    public Double getValorTitulos() {
        return valorTitulos;
    }

    public void setValorTitulos(Double valorTitulos) {
        this.valorTitulos = valorTitulos;
    }

    @Field(offset = 42, length = 15)
    public Double getQuantidadeMoeda() {
        return quantidadeMoeda;
    }

    public void setQuantidadeMoeda(Double quantidadeMoeda) {
        this.quantidadeMoeda = quantidadeMoeda;
    }

    @Field(offset = 60, length = 181)
    public String getComplementeBranco2() {
        return complementeBranco2;
    }

    public void setComplementeBranco2(String complementeBranco2) {
        this.complementeBranco2 = complementeBranco2;
    }

    @Override
    public String toString() {
        return "RegistroTrailerLote{" + "codigoBanco=" + codigoBanco + ", codigoLote=" + codigoLote + ", tipoRegistro=" + tipoRegistro + ", complementoBranco=" + complementoBranco + ", quantidadeRegistro=" + quantidadeRegistro + ", valorTitulos=" + valorTitulos + ", quantidadeMoeda=" + quantidadeMoeda + ", complementeBranco2=" + complementeBranco2 + '}';
    }

}
