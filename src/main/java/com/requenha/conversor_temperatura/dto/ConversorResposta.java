package com.requenha.conversor_temperatura.dto;

public class ConversorResposta {
	private double temperatura;
	private String unidade;
	
	
	public ConversorResposta(double resposta, String unidade) {
		this.temperatura = temperatura;
		this.unidade = unidade;
	}


	public double getTemperatura() {
		return temperatura;
	}


	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}


	public String getUnidade() {
		return unidade;
	}


	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	
	

}
