package tests;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

import main.Matriz;
import main.calculadora;
import main.numero;
class NumComplejoTest {

	@Test
	public void puedeSumarComplejos() {
		numero x = new numero(4, -3);
		numero y = new numero (5, 5);
		numero answ = calculadora.suma(x,y);
		assertEquals(9, answ.real,2.0);
		assertEquals(2, answ.imagi, 2.0);
		
		x = new numero(-23, 0);
		y = new numero (50, 5);
		answ = calculadora.suma(x,y);
		assertEquals(27, answ.real,2.0);
		assertEquals(5, answ.imagi, 2.0);
		
		
		x = new numero(23, 0);
		y = new numero (50, 5);
		answ = calculadora.suma(x,y);
		assertEquals(73, answ.real,2.0);
		assertEquals(5, answ.imagi, 2.0);
	}
	
	@Test
	public void puedeRestarComplejos() {
		numero x = new numero(15, 5);
		numero y = new numero (5, 5);
		numero answ = calculadora.resta(x,y);
		assertEquals(10, answ.real,2.0);
		assertEquals(0, answ.imagi, 2.0);
		
		x = new numero(-23, 0);
		y = new numero (50, 5);
		answ = calculadora.resta(x,y);
		assertEquals(-73, answ.real,2.0);
		assertEquals(-5, answ.imagi, 2.0);
	}
	
	
	@Test
	public void puedeMultiplicarComplejos() {
		numero x = new numero(2,-5);
		numero y = new numero(3,4);
		numero answ = calculadora.producto(x,y);
		x = new numero(0, 1);
		y = new numero (0,1);
		answ = calculadora.producto(x,y);
		assertEquals(-1, answ.real,2.0);
		assertEquals(0, answ.imagi, 2.0);
		
		
		x = new numero(2,-5);
		y = new numero(3,4);
		answ = calculadora.producto(x,y);
		assertEquals(26,answ.real,2.0);
		assertEquals(-7,answ.imagi,2.0);
		
		
	}
	
	@Test
	public void puedeDividirComplejos() {

		numero x = new numero(3,2);
		numero y = new numero(-1,2);
		numero answ = calculadora.division(x,y);
		assertEquals(0.2,answ.real,2.0);
		assertEquals(-1.6,answ.imagi,2.0);
		
	}
	
	
	@Test
	public void modulo() {

		numero x = new numero(37, -63);
		double answ = calculadora.modulo(x);
		assertEquals(73.06161783043132,answ,2.0);
		
		x = new numero(-3, 4);
		answ = calculadora.modulo(x);
		assertEquals(5,answ,2.0);
		
		
	}
	
	
	
	
	
	@Test
	public void Conjugado() {
		numero x = new numero(4,-3);
		numero y = calculadora.conjugado(x);
		assertEquals(3,y.imagi,2.0);
		assertEquals(4,y.real,2.0);
		
	}
	
	
	@Test
	public void PruebaFase() {
		numero x = new numero(4,-3);
		double y = calculadora.fase(x);
		assertEquals(-36.87,y,2.0);
	}
	
	
	@Test
	public void sumaVector() {
		ArrayList<numero> aux = new ArrayList<numero>();
		
		ArrayList<ArrayList<numero>> rta = new ArrayList<ArrayList<numero>>();
		aux.add(new numero(3,-3));
		aux.add(new numero(4,2));
		rta.add(aux);
		
		Matriz def = new Matriz(rta);
		aux = new ArrayList<numero>();
		
		ArrayList<ArrayList<numero>> a1 = new ArrayList<ArrayList<numero>>();
		aux = new ArrayList<numero>();
		aux.add(new numero(1,-1));
		aux.add(new numero(3,1));
		a1.add(aux);
		Matriz a = new Matriz(a1);
		
		ArrayList<ArrayList<numero>> b1 = new ArrayList<ArrayList<numero>>();
		aux = new ArrayList<numero>();
		aux.add(new numero(2,-2));
		aux.add(new numero(1,1));
		b1.add(aux);
		Matriz b = new Matriz(b1);
		Matriz answ = calculadora.sumaMatrices(a, b);
		
		assertEquals(def.getFila(0).get(0).real, answ.getFila(0).get(0).real,2.0);
		assertEquals(def.getFila(0).get(0).imagi, answ.getFila(0).get(0).imagi,2.0);
		
		assertEquals(def.getFila(0).get(1).real, answ.getFila(0).get(1).real,2.0);
		assertEquals(def.getFila(0).get(1).imagi, answ.getFila(0).get(1).imagi,2.0);
		
	}
	
	
	
	@Test
	public void multiplicaMatriz() {
		ArrayList<numero> aux = new ArrayList<numero>();
		
		ArrayList<ArrayList<numero>> rta = new ArrayList<ArrayList<numero>>();
		aux.add(new numero(4,0));
		aux.add(new numero(5,0));
		rta.add(aux);
		
		aux = new ArrayList<numero>();
		aux.add(new numero(5,0));
		aux.add(new numero(4,0));
		rta.add(aux);
		
		
		Matriz def = new Matriz(rta);
		aux = new ArrayList<numero>();
		
		ArrayList<ArrayList<numero>> a1 = new ArrayList<ArrayList<numero>>();
		aux = new ArrayList<numero>();
		aux.add(new numero(1,0));
		aux.add(new numero(2,0));
		a1.add(aux);
		
		aux = new ArrayList<numero>();
		aux.add(new numero(2,0));
		aux.add(new numero(1,0));
		a1.add(aux);

		
		Matriz a = new Matriz(a1);
		
		ArrayList<ArrayList<numero>> b1 = new ArrayList<ArrayList<numero>>();
		aux = new ArrayList<numero>();
		aux.add(new numero(2,0));
		aux.add(new numero(1,0));
		b1.add(aux);
		
		aux = new ArrayList<numero>();
		aux.add(new numero(1,0));
		aux.add(new numero(2,0));
		b1.add(aux);
		
		Matriz b = new Matriz(b1);
		
		Matriz answ = calculadora.multiplicacionMatrices(a, b);
		
		assertEquals(def.getFila(0).get(0).real, answ.getFila(0).get(0).real,2.0);
		assertEquals(def.getFila(0).get(0).imagi, answ.getFila(0).get(0).imagi,2.0);
		
		assertEquals(def.getFila(0).get(1).real, answ.getFila(0).get(1).real,2.0);
		assertEquals(def.getFila(0).get(1).imagi, answ.getFila(0).get(1).imagi,2.0);
		
		assertEquals(def.getFila(1).get(1).real, answ.getFila(1).get(1).real,2.0);
		assertEquals(def.getFila(1).get(1).imagi, answ.getFila(1).get(1).imagi,2.0);
		
		assertEquals(def.getFila(1).get(0).real, answ.getFila(1).get(0).real,2.0);
		assertEquals(def.getFila(1).get(0).imagi, answ.getFila(1).get(0).imagi,2.0);
		
	}
	
	
	@Test
	public void hallaTranspuesta() {
		ArrayList<numero> aux = new ArrayList<numero>();
		
		ArrayList<ArrayList<numero>> rta = new ArrayList<ArrayList<numero>>();
		aux.add(new numero(1,0));
		aux.add(new numero(3,0));
		rta.add(aux);
		
		aux = new ArrayList<numero>();
		aux.add(new numero(2,0));
		aux.add(new numero(4,0));
		rta.add(aux);
		
		
		Matriz def = new Matriz(rta);
		aux = new ArrayList<numero>();
		
		ArrayList<ArrayList<numero>> a1 = new ArrayList<ArrayList<numero>>();
		aux = new ArrayList<numero>();
		aux.add(new numero(1,0));
		aux.add(new numero(2,0));
		a1.add(aux);
		
		aux = new ArrayList<numero>();
		aux.add(new numero(3,0));
		aux.add(new numero(4,0));
		a1.add(aux);

		
		Matriz a = new Matriz(a1);
		

		Matriz answ = calculadora.transpuesta(a);
		
		assertEquals(def.getFila(0).get(0).real, answ.getFila(0).get(0).real,2.0);
		assertEquals(def.getFila(0).get(0).imagi, answ.getFila(0).get(0).imagi,2.0);
		
		assertEquals(def.getFila(0).get(1).real, answ.getFila(0).get(1).real,2.0);
		assertEquals(def.getFila(0).get(1).imagi, answ.getFila(0).get(1).imagi,2.0);
		
		assertEquals(def.getFila(1).get(1).real, answ.getFila(1).get(1).real,2.0);
		assertEquals(def.getFila(1).get(1).imagi, answ.getFila(1).get(1).imagi,2.0);
		
		assertEquals(def.getFila(1).get(0).real, answ.getFila(1).get(0).real,2.0);
		assertEquals(def.getFila(1).get(0).imagi, answ.getFila(1).get(0).imagi,2.0);
		
	}
	
	
	
	@Test
	public void sacaConjugadoDeMatriz() {
		ArrayList<numero> aux = new ArrayList<numero>();
		
		ArrayList<ArrayList<numero>> rta = new ArrayList<ArrayList<numero>>();
		aux.add(new numero(1,0));
		aux.add(new numero(2,1));
		rta.add(aux);
		
		aux = new ArrayList<numero>();
		aux.add(new numero(3,0));
		aux.add(new numero(4,0));
		rta.add(aux);
		
		
		Matriz def = new Matriz(rta);
		aux = new ArrayList<numero>();
		
		ArrayList<ArrayList<numero>> a1 = new ArrayList<ArrayList<numero>>();
		aux = new ArrayList<numero>();
		aux.add(new numero(1,0));
		aux.add(new numero(2,-1));
		a1.add(aux);
		
		aux = new ArrayList<numero>();
		aux.add(new numero(3,0));
		aux.add(new numero(4,0));
		a1.add(aux);

		
		Matriz a = new Matriz(a1);
		

		Matriz answ = calculadora.matrizConjugada(a);
		

		assertEquals(def.getFila(0).get(0).real, answ.getFila(0).get(0).real,2.0);
		assertEquals(def.getFila(0).get(0).imagi, answ.getFila(0).get(0).imagi,2.0);
		
		assertEquals(def.getFila(0).get(1).real, answ.getFila(0).get(1).real,2.0);
		assertEquals(def.getFila(0).get(1).imagi, answ.getFila(0).get(1).imagi,2.0);
		
		assertEquals(def.getFila(1).get(1).real, answ.getFila(1).get(1).real,2.0);
		assertEquals(def.getFila(1).get(1).imagi, answ.getFila(1).get(1).imagi,2.0);
		
		assertEquals(def.getFila(1).get(0).real, answ.getFila(1).get(0).real,2.0);
		assertEquals(def.getFila(1).get(0).imagi, answ.getFila(1).get(0).imagi,2.0);
		
	}
	
	
	@Test
	public void sacaAdjuntaDeMatriz() {
		ArrayList<numero> aux = new ArrayList<numero>();
		
		ArrayList<ArrayList<numero>> rta = new ArrayList<ArrayList<numero>>();
		aux.add(new numero(1,0));
		aux.add(new numero(3,0));
		rta.add(aux);
		
		aux = new ArrayList<numero>();
		aux.add(new numero(2,1));
		aux.add(new numero(4,0));
		rta.add(aux);
		
		
		Matriz def = new Matriz(rta);
		aux = new ArrayList<numero>();
		
		ArrayList<ArrayList<numero>> a1 = new ArrayList<ArrayList<numero>>();
		aux = new ArrayList<numero>();
		aux.add(new numero(1,0));
		aux.add(new numero(2,-1));
		a1.add(aux);
		
		aux = new ArrayList<numero>();
		aux.add(new numero(3,0));
		aux.add(new numero(4,0));
		a1.add(aux);

		
		Matriz a = new Matriz(a1);
		

		Matriz answ = calculadora.matrizConjugada(a);
		

		assertEquals(def.getFila(0).get(0).real, answ.getFila(0).get(0).real,2.0);
		assertEquals(def.getFila(0).get(0).imagi, answ.getFila(0).get(0).imagi,2.0);
		
		assertEquals(def.getFila(0).get(1).real, answ.getFila(0).get(1).real,2.0);
		assertEquals(def.getFila(0).get(1).imagi, answ.getFila(0).get(1).imagi,2.0);
		
		assertEquals(def.getFila(1).get(1).real, answ.getFila(1).get(1).real,2.0);
		assertEquals(def.getFila(1).get(1).imagi, answ.getFila(1).get(1).imagi,2.0);
		
		assertEquals(def.getFila(1).get(0).real, answ.getFila(1).get(0).real,2.0);
		assertEquals(def.getFila(1).get(0).imagi, answ.getFila(1).get(0).imagi,2.0);
		
	}
	
	
	@Test
	public void productoTensor() {
		ArrayList<numero> aux = new ArrayList<numero>();
		
		ArrayList<ArrayList<numero>> rta = new ArrayList<ArrayList<numero>>();
		aux.add(new numero(12,0));
		aux.add(new numero(8,0));
		aux.add(new numero(-6,0));
		aux.add(new numero(18,0));
		aux.add(new numero(12,0));
		aux.add(new numero(-9,0));
		rta.add(aux);
		
		
		Matriz def = new Matriz(rta);
		aux = new ArrayList<numero>();
		
		ArrayList<ArrayList<numero>> a1 = new ArrayList<ArrayList<numero>>();
		aux = new ArrayList<numero>();
		aux.add(new numero(2,0));
		aux.add(new numero(3,0));
		a1.add(aux);
		Matriz a = new Matriz(a1);
		
		
		ArrayList<ArrayList<numero>> b1 = new ArrayList<ArrayList<numero>>();
		aux = new ArrayList<numero>();
		aux.add(new numero(6,0));
		aux.add(new numero(4,0));
		aux.add(new numero(-3,0));
		b1.add(aux);

		
		Matriz b = new Matriz(b1);
		

		Matriz answ = calculadora.productoTensor(a,b);
		

		assertEquals(def.getFila(0).get(0).real, answ.getFila(0).get(0).real,2.0);
		assertEquals(def.getFila(0).get(0).imagi, answ.getFila(0).get(0).imagi,2.0);

		assertEquals(def.getFila(0).get(1).real, answ.getFila(0).get(1).real,2.0);
		assertEquals(def.getFila(0).get(1).imagi, answ.getFila(0).get(1).imagi,2.0);
		
		assertEquals(def.getFila(0).get(2).real, answ.getFila(0).get(2).real,2.0);
		assertEquals(def.getFila(0).get(2).imagi, answ.getFila(0).get(2).imagi,2.0);
		
		assertEquals(def.getFila(0).get(3).real, answ.getFila(0).get(3).real,2.0);
		assertEquals(def.getFila(0).get(3).imagi, answ.getFila(0).get(3).imagi,2.0);
		
		assertEquals(def.getFila(0).get(4).real, answ.getFila(0).get(4).real,2.0);
		assertEquals(def.getFila(0).get(4).imagi, answ.getFila(0).get(4).imagi,2.0);
		
		assertEquals(def.getFila(0).get(5).real, answ.getFila(0).get(5).real,2.0);
		assertEquals(def.getFila(0).get(5).imagi, answ.getFila(0).get(5).imagi,2.0);
		
	}

}
