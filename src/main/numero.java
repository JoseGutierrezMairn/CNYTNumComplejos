package main;

public class numero {
	
	public double real;
	public double imagi;
	
	public numero (double real, double imagi) {
		this.real= real;
		this.imagi= imagi;
	}
	public double fase() {
		double answ = Math.atan((this.imagi)/(this.real));
		answ = (((answ)*(180))/(Math.PI));
		return answ;
	}
	
	public double modulo () {
		double a = this.real * this.real;
		double b = this.imagi * this.imagi;
		return Math.sqrt(a+b);
	}
	
	public numero conjugado(){
		return new numero(this.real, -this.imagi);
		
	}
	
	
}
