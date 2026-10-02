package com.krakendev.figuras;

public class Rectangulo extends Figura{
	
	private int base;
	private int altura;
	
	public Rectangulo(int base, int altura, String nombre, String color) {
		super(nombre, color);
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public int calcularPerimetro(){
		return 2 * base + 2 * altura;
	}

	
	@Override
	public double calcularArea(){
		return base * altura;
	}
}
