package com.requenha.conversor_temperatura.dto;

public class ConversorRequisicao {
	private double temperatura;
	private int de;
	private int para;
	
	
	public ConversorRequisicao(double temperatura, int de, int para) {
        this.temperatura = temperatura;
        this.de = de;
        this.para = para;
	}


	public double getTemperatura() {
		return temperatura;
	}


	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}


	public int getDe() {
		return de;
	}


	public void setDe(int de) {
		this.de = de;
	}


	public int getPara() {
		return para;
	}


	public void setPara(int para) {
		this.para = para;
	}
	
	
}
