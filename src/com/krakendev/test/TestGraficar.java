package com.krakendev.test;

import com.krakendev.figuras.Cuadrado;
import com.krakendev.figuras.Figura;
import com.krakendev.figuras.Graficador;
import com.krakendev.figuras.Hexagono;
import com.krakendev.figuras.Rectangulo;
import com.krakendev.figuras.Triangulo;
import com.krakendev.figuras.TrianguloRectangulo;

public class TestGraficar {

	public static void main(String[] args) {
		
		Graficador grafica = new Graficador();
		
		Figura cuadrado = new Cuadrado(4, "cuadrado", "amarillo");
		
		grafica.graficar(cuadrado);
		
		Figura triangulo = new Triangulo("triangulo", "gris");
		
		grafica.graficar(triangulo);
		
		Figura rectangulo = new Rectangulo(12, 9, "rectangulo", "rojo");
		
		grafica.graficar(rectangulo);
		
		Figura tr = new TrianguloRectangulo(10, 12, 15, "triangulo rectangulo", "azul");
		grafica.graficar(tr);
		
		Figura hexagono = new Hexagono(7, "hexagono", "verde");
		grafica.graficar(hexagono);

	}

}
