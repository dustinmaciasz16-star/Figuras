package com.krakendev.test;

import com.krakendev.figuras.Cuadrado;
import com.krakendev.figuras.Figura;
import com.krakendev.figuras.Triangulo;

public class TestFiguras {

	public static void main(String[] args) {
		
		Figura cuadrado = new Cuadrado(8, "cuadrado", "amarillo");
		
		System.out.println(cuadrado);
		
		Figura triangulo = new Triangulo("triangulo", "gris");
		
		System.out.println(triangulo);
		

	}

}
