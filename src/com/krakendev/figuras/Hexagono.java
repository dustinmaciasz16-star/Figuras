package com.krakendev.figuras;

public class Hexagono extends Figura {
	
	private int lado;

	public Hexagono(int lado, String nombre, String color) {
		super(nombre, color);
		this.lado = lado;
	}

	@Override
	public int calcularPerimetro() {
		return lado * 6;
	}

	@Override
	public double calcularArea() {
		return (3 * Math.sqrt(3) / 2) * lado * lado;
	}
	
	

}
