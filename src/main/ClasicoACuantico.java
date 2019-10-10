package main;
import java.util.ArrayList;
import main.Matriz;
import main.calculadora;
import main.numero;

public class ClasicoACuantico {
	public Matriz ejercicio311(Matriz matriz1, Matriz matriz2, int clicks) {
		Matriz matriz3 = null;
		Matriz valor = matriz1;
		
		for(int i =1; i < clicks; i++) {
			valor = calculadora.productoTensor(matriz1, valor);
		}
		matriz3 = calculadora.productoTensor(valor, matriz2);
		return matriz3;
	}
	
	/**
	 * 
	 */
	public Matriz ejercicio321(int valor, int change) {
		
		int resultado = 1 + valor + change;
		Matriz answ = new Matriz(new ArrayList<ArrayList<numero>>());
		ArrayList<numero> fil = new ArrayList<numero>;
		for(int i = 0; i <resultado; i++) {
			for(int j = 0; j <resultado; j++) {
				fil.add(new numero(0,0));
			}
			answ.agregueFila(fil);
			fil = new ArrayList<numero>;
		}
		
		float res = (float) 1 / valor;
		numero probabilidad = new numero(res, 0);
		for(int k = 1; k < valor; k++) {
			fil= answ.getFila(k);
			fil.get(0) = probabilidad;
			answ.updatePos(k, fil);
		}
		
		float num1 = (float) Math.ceil((float)change/valor);
		float num2 = (float) 1/num1;
		numero prob = new numero(num2, 0);
		for(int number1 = valor+1; number1 < resultado; number1++) {
			fil= answ.getFila(number1);
			for(int number2 = 1; number2 < valor; number2++) {
				fil.get(number2) = prob;
				answ.updatePos(number1, fil);
				if((change % valor) == 1) {
					
				}else if((change % valor) == 1) {
					
				}
			}
		}
		numero num3 = new numero(1, 0);
		for(int number3 = valor +1; number3 < resultado; number3++) {
			fil= answ.getFila(number3);
			for(int number4 = valor+1; number4 < valor; number4++) {
				if(number3==0) {
					fil.get(number3) = number4;
					answ.updatePos(number3, fil);
				}
			}
		}
		return answ;
	}
	
	/**
	 * 
	 */
	public double particulaPorPosicion(int valor, Matriz matriz) {
		double probabilidad = Math.pow(matriz.getFila(valor).get(0).modulo());
		return probabilidad;
	}
	
	/**
	 * 
	 *
	 */
	public Matriz probabilidadKet(Matriz matriz1, Matriz matriz2) {
		return calculadora.productoTensor(matriz1, matriz2);
	}
	
	/**
	 * 
	 */
	public Matriz bra(Matriz matriz) {
		return calculadora.matrizAdjunta(matriz);
	}
	
	/**
	 * 
	 */
	public numero valorMedio(Matriz matriz1, Matriz matriz2) {
		if(calculadora.hermitiana(matriz1).equals(false)) {
			return null;
		}
		calculadora.matrizAdjunta(matriz1);
		Matriz matriz = calculadora.productoTensor(matriz1, matriz2);
		matriz = this.bra(matriz);
		return new numero(0,0);
	}
	
	/**
	 * 
	 */
	public numero varianza(Matriz matriz1, Matriz matriz2) {
		
		if(calculadora.hermitiana(matriz1).equals(false)) {
			
		}
		calculadora.matrizAdjunta(matriz1);
		Matriz matriz3 = this.unitaria(this.valorMedio(matriz1, matriz2),matriz1.getFila(), matriz2.getColumna());
		Matriz matriz4 = calculadora.restaMatrices(matriz1, matriz3);
		Matriz matriz5 = calculadora.productoTensor(matriz4, matriz4);
		Matriz matriz6 = calculadora.productoTensor(calculadora.matrizAdjunta(matriz2), matriz5);
		numero varianza =calculadora.productoTensor(matriz6, calculadora.matrizAdjunta(matriz2));
		return varianza;
	}
	
	/**
	 * 
	 */
	public Matriz unitaria(numero complejo, int valor, int numero) {
		Matriz matriz = new Matriz(new ArrayList<ArrayList<numero>>());
		for(int fila = 0; fila < valor; fila++) {
			for(int columna = 0; columna < numero; columna++) {
				if(fila == columna) {
					matriz.getMatriz()[fila][columna] = complejo;
				}else {
					matriz.getMatriz()[fila][columna] = new Complejo(0,0);
				}
			}
		}
		return matriz;
	}
	

}
