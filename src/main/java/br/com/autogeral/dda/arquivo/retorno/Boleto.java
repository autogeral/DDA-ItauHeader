package br.com.autogeral.dda.arquivo.retorno;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * 05/06/2020 16:51:42
 *
 * @author kaique.mota
 */
public class Boleto {

    private RegistroDetalheSegmentoG segmentoG;
    private RegistroDetalheSegmentoH segmentoH;

    public Boleto(RegistroDetalheSegmentoG segmentoG, RegistroDetalheSegmentoH segmentoH) {
        this.segmentoG = segmentoG;
        this.segmentoH = segmentoH;
    }

    public RegistroDetalheSegmentoG getSegmentoG() {
        return segmentoG;
    }

    public void setSegmentoG(RegistroDetalheSegmentoG segmentoG) {
        this.segmentoG = segmentoG;
    }

    public RegistroDetalheSegmentoH getSegmentoH() {
        return segmentoH;
    }

    public void setSegmentoH(RegistroDetalheSegmentoH segmentoH) {
        this.segmentoH = segmentoH;
    }

}
