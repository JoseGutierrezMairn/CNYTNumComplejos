package main;

public class calculadora {
	
	
	public static numero suma (numero x, numero y) {
		
		double imaginaria = x.imagi + y.imagi;
		
		double real = x.real + y.real;
		return new numero(real, imaginaria);
		
	}
	
	public static numero producto(numero x, numero y) {
		double first = ((x.real * y.real) - (x.imagi * y.imagi));
		double second = ((x.real * y.imagi) + (x.imagi * y.real));
		return new numero(first, second);
		
	}
	
	public static numero resta(numero x, numero y) {
		double real = x.real - y.real;
		double imaginaria = x.imagi - y.imagi;
		return new numero(real, imaginaria);
		
	}
	
	
	public static numero division(numero x, numero y) {
		double w = ((y.real * y.real) + (y.imagi*y.imagi));
		numero answ;
		if(w!=0.0) {
			double first = ((x.real * y.real) + (x.imagi * y.imagi))/w;
			double second = ((x.imagi * y.real) - (x.real * y.imagi))/w;
			answ = new numero(first, second);
		}else {
			answ=null;
		}
		return answ;
	}
	
	public static double  modulo(numero x) {
		return x.modulo();
	}
	
	public static numero conjugado(numero x) {
		return x.conjugado();
	}
	
	public static double fase(numero x) {
		return x.fase();
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
