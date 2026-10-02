package com.krakendev.figuras;

public class TrianguloRectangulo extends Figura{

	private int catetoA;
	private int catetoB;
	private int hipotenusa;
	
	public TrianguloRectangulo(int catetoA, int catetoB, int hipotenusa, String nombre, String color) {
		super(nombre, color);
		this.catetoA = catetoA;
		this.catetoB = catetoB;
		this.hipotenusa = hipotenusa;
	}
	
	@Override
	public int calcularPerimetro(){
		return catetoA + catetoB + hipotenusa;
		
	}
	
	@Override
	public double calcularArea(){
		return (catetoA * catetoB) / 2.0;
	}

}
