package com.krakendev.figuras;

public class Cuadrado extends Figura {
	
	private int lado;

	public Cuadrado( int lado, String nombre, String color) {
		super(nombre, color);
		this.lado = lado;
	}
	
	@Override
	public int calcularPerimetro(){
		return 4 * lado;
	}
	
	@Override
	public double calcularArea(){
		return lado * lado;
	}
	
	
}
