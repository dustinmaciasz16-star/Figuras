package com.krakendev.figuras;

public class Graficador {
	
	public void graficar(Figura figura) {
		System.out.println("Perimetro: " + figura.calcularPerimetro() + ", Area: " + figura.calcularArea() + ", graficado " + figura.getNombre() + " de color " + figura.getColor());
	}

}
