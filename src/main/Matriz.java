package main;

import java.util.ArrayList;

public class Matriz {
	public ArrayList<ArrayList<numero>> m;
	public int fil, col;
	
	public Matriz(ArrayList<ArrayList<numero>> m) {
		this.m= m;
		int i =0;
		int j = 0;
		for (ArrayList<numero> fila : m ) {
			j=0;
			for(numero n: fila) {
				j++;
			}
			i++;
		}
		this.fil=i;
		this.col=j;

	}
	
	public ArrayList<numero> getFila(int n) {
		return this.m.get(n);
	}
	
	public ArrayList<numero> getColumna(int n){
		ArrayList<numero> col = new ArrayList<numero>();
		for(int i = 0; i < this.fil; i++ ) {

			col.add(m.get(i).get(n));
		}
		return col;
	}
	
	public void agregueFila(ArrayList<numero> fila) {
		m.add(fila);
	}
	
	public numero demeNumero(int fil, int col) {
		return m.get(fil).get(col);
	}
	
	public numero updatePos(int i , ArrayList<numero> value) {
		m.get(i) = value;
	}
	
	
	
	

}
