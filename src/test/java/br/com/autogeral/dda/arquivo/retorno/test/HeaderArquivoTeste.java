/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.autogeral.dda.arquivo.retorno.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.junit.Test;

import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;

import br.com.autogeral.dda.arquivo.retorno.HeaderArquivo;

/**
 *
 * @author Kaique
 */
public class HeaderArquivoTeste {

	public static FixedFormatManager FFM = new FixedFormatManagerImpl();

	 Integer codigoBanco = 341;
	 String codigoLote = "0000";
	 Integer tipoRegistro = 0;
	 String brancosComplemento="";
	 Integer codigoInscricao = 2;
	 Long inscricaoNumero =  05437537000137L  ;
	 String convenio = "                    ";
	 String agencia = "00000";
	 String digitoVerificadorAgencia = " ";
	 String numeroContaCorrente ="000000000000";
	 String digitoVerificadorConta = " ";
	 String digitoVerificadorAgenciaConta = "  ";
	 String nomeEmpresa = "AUTO GERAL AUTOPECAS LTDA.   ";
	 String nomeBanco = "BANCO ITAU S.A.               ";
	 String brancosComplemento2 = "         2";
	 Integer codigoArquivo = 2;
	 Date dataGeracao = java.sql.Date.valueOf(LocalDate.parse("02032020", DateTimeFormatter.ofPattern("ddMMyyyy")));
	 String horaGeracao = "073339";
	 String numeroSequenciaArquivoRetorno = "000006";
	 String layoutArquivo = "084";
	 String brancosComplemento3;


	@Test
	public void test() {
		String t1 = "34100000         205437537000137                    00000 000000000000  AUTO GERAL AUTOPECAS LTDA.    BANCO ITAU S.A.                         202032020073339000006084                                                                          ";
		HeaderArquivo headerArquivo = FFM.load(HeaderArquivo.class, t1);
		System.out.println(headerArquivo.toString());

	}

}