package tests;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

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

}
