package main;

import java.util.ArrayList;

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

	public static Matriz sumaMatrices(Matriz a, Matriz b) {

		Matriz answ = new Matriz(new ArrayList<ArrayList<numero>>());
		
		if(a.fil == b.fil && a.col==b.col) {
			for(int i=0; i < a.fil; i++) {
				
				ArrayList<numero> fila = new ArrayList<numero>();
				int j = 0;
				for(numero na : a.getFila(i)) {
					
					numero suma = suma(na, b.getFila(i).get(j));

					fila.add(suma);
					j++;
					
				}
				answ.agregueFila(fila);
			}
		}

		return answ;
	}
	
	public static Matriz restaMatrices(Matriz a, Matriz b) {

		Matriz answ = new Matriz(new ArrayList<ArrayList<numero>>());
		
		if(a.fil == b.fil && a.col==b.col) {
			for(int i=0; i < a.fil; i++) {
				
				ArrayList<numero> fila = new ArrayList<numero>();
				int j = 0;
				for(numero na : a.getFila(i)) {
					
					numero suma = resta(na, b.getFila(i).get(j));

					fila.add(suma);
					j++;
					
				}
				answ.agregueFila(fila);
			}
		}

		return answ;
	}
	
	
	public static Matriz multiplicacionMatrices(Matriz a, Matriz b) {
		Matriz answ = new Matriz(new ArrayList<ArrayList<numero>>());
		if(a.col == b.fil) {
			
			for(int fila = 0; fila<a.fil; fila++) {
				ArrayList<numero> x = new ArrayList<numero>();
				
				for(int col = 0; col < b.fil; col++) {
					numero suma = new numero(0,0);
					ArrayList<numero> colB = b.getColumna(col);
					for (numero num: a.getFila(fila)) {
						int j=0;
						suma= suma(suma, producto(num,colB.get(j)));
						j++;
					}
					x.add(suma);
				}
				answ.agregueFila(x);
			}
		}

		return answ;
		
	}
	
	
	public static Matriz transpuesta(Matriz a) {
		Matriz answ = new Matriz(new ArrayList<ArrayList<numero>>());
		for(int col = 0; col < a.col; col++) {
			answ.agregueFila(a.getColumna(col));
		}		
		return answ;
	}
	
	
	public static Matriz matrizConjugada(Matriz a) {
		Matriz answ = a;
		for(int i=0; i < answ.fil; i++) {
			for(numero n : answ.getFila(i)) {
				numero x = conjugado(n);
				n= x;
			}
		}
		
		return answ;
	}
	
	
	public static Matriz matrizAdjunta(Matriz a) {
		return matrizConjugada(transpuesta(a));
	}
	
	public static double laNorma(Matriz a) {
		double answ = 0.0;
		for(int f = 0; f < a.fil; f++) {
			for(int c = 0; c < a.col; c++) {
				answ += Math.pow(a.demeNumero(f, c).modulo(), answ);
			}
		}
		return answ;
	}
	
	public static double distanciaEntreMatrices(Matriz a, Matriz b) {
		double answ = laNorma(restaMatrices(a,b));
		return Math.sqrt(answ);
	}
	
	
	
	public static Matriz identidad(Matriz a) {
		Matriz answ = new Matriz(new ArrayList<ArrayList<numero>>());
		int uno=0;
		for(int i=0; i < a.fil; i++) {
			ArrayList<numero> fila = new ArrayList<numero>();
			for(int j = 0 ; j < a.col; j++) {
				if(j==uno) {
					fila.add(new numero(1,0));
				}else {
					fila.add(new numero(0,0));
				}
			}
			uno++;
		}
		return answ;
	}
	
	
	public static boolean unitaria(Matriz a) {
		boolean answ = false;
		if (multiplicacionMatrices(a, matrizAdjunta(a)) == identidad(a) ) {
			answ= true;
		}
		return answ;
	}
	
	
	public static boolean hermitiana(Matriz a) {
		boolean answ= false;
		if(a == matrizAdjunta(a)) {
			answ= true;
		}
		return answ;
	}
	
	
	public static Matriz productoTensor(Matriz a, Matriz b) {
		 Matriz answ = new Matriz(new ArrayList<ArrayList<numero>>());
		 ArrayList<numero> temp = new ArrayList<numero>();
		 for(int i = 0; i < a.fil; i++) {
			 for(numero num : a.getFila(i)) {
				 int j = 0;
				 while (j < b.col) {
					 temp.add(producto(num, b.getFila(0).get(j)));
					 j++;
				 }
			 }
		 }
		 answ.agregueFila(temp);
		 
		 return answ;
	}
}
	
	
	
	
	
	
	
	
	
	
	

