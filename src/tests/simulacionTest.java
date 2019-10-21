package src.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import src.main.numero;
import src.main.Matriz;
import src.main.calculadora;
import src.main.numero;
import src.main.ClasicoACuantico;
class simulacionTest {


	@Test
	public void ejercicio311() {
		ClasicoACuantico s = new ClasicoACuantico();
		Matriz m1 = new Matriz({{new numero(0,0) , new numero(0,0), new numero(0,0),new numero(0,0),new numero(0,0),new numero(0,0) },
								{new numero(1,0),new numero(0,0),new numero(0,0),new numero(0,0),new numero(0,0),new numero(0,0)},
								{new numero(0,0),new numero(1,0), new numero(0,0), new numero(0,0),new numero(0,0),new numero(1,0)},
								{new numero(0,0),new numero(0,0),new numero(0,0),new numero(1,0),new numero(0,0),new numero(0,0)},
								{new numero(0,0),new numero(0,0),new numero(1,0),new numero(0,0),new numero(0,0),new numero(0,0)},
								{new numero(1,0),new numero(0,0),new numero(0,0),new numero(0,0),new numero(1,0),new numero(0,0)}});
		
		
		MatrizComplejo m2 = new MatrizComplejo(6,1);
		m2.addMatriz(new Complejo(6,0),0,0);
		m2.addMatriz(new Complejo(2,0),1,0);
		m2.addMatriz(new Complejo(1,0),2,0);
		m2.addMatriz(new Complejo(5,0),3,0);
		m2.addMatriz(new Complejo(3,0),4,0);
		m2.addMatriz(new Complejo(10,0),5,0);
		
		MatrizComplejo mresp = new MatrizComplejo(6,1);
		mresp.addMatriz(new Complejo(0,0),0 ,0 );
		mresp.addMatriz(new Complejo(0,0),1 ,0 );
		mresp.addMatriz(new Complejo(12,0),2 ,0 );
		mresp.addMatriz(new Complejo(5,0),3 ,0 );
		mresp.addMatriz(new Complejo(1,0),4 ,0 );
		mresp.addMatriz(new Complejo(9,0),5 ,0 );
		
		assertEquals(mresp,s.ejercicio311(m1, m2, 1));
		
		MatrizComplejo mresp2 = new MatrizComplejo(6,1);
		mresp2.addMatriz(new Complejo(0,0),0 ,0 );
		mresp2.addMatriz(new Complejo(0,0),1 ,0 );
		mresp2.addMatriz(new Complejo(9,0),2 ,0 );
		mresp2.addMatriz(new Complejo(5,0),3 ,0 );
		mresp2.addMatriz(new Complejo(12,0),4 ,0 );
		mresp2.addMatriz(new Complejo(1,0),5 ,0 );
		
		assertEquals(mresp2,s.ejercicio311(m1, m2, 2));
		
		MatrizComplejo mresp3 = new MatrizComplejo(6,1);
		mresp3.addMatriz(new Complejo(0,0),0 ,0 );
		mresp3.addMatriz(new Complejo(0,0),1 ,0 );
		mresp3.addMatriz(new Complejo(1,0),2 ,0 );
		mresp3.addMatriz(new Complejo(5,0),3 ,0 );
		mresp3.addMatriz(new Complejo(9,0),4 ,0 );
		mresp3.addMatriz(new Complejo(12,0),5 ,0 );
		
		assertEquals(mresp3,s.ejercicio311(m1, m2, 3));
		
	}
	
	@Test
	public void ejercicio321() {
		ClasicoACuantico s = new ClasicoACuantico();
		Matriz m1 = new Matriz({{new numero(0,0) , new numero(0.5,0), new numero(0.5,0),new numero(0,0)},
			{new numero(0.5,0),new numero(0,0),new numero(0,0),new numero(0.5,0)},
			{new numero(0.5,0),new numero(1,0), new numero(0,0), new numero(0.5,0)},
			{new numero(0,0),new numero(0.5,0),new numero(0.5,0),new numero(1,0)}
			});
		

		
		MatrizComplejo m2 = new MatrizComplejo(4,1);
		m2.addMatriz(new Complejo(1,0),0,0);
		m2.addMatriz(new Complejo(0,0),1,0);
		m2.addMatriz(new Complejo(0,0),2,0);
		m2.addMatriz(new Complejo(0,0),3,0);

		MatrizComplejo mresp = new MatrizComplejo(4,1);
		mresp.addMatriz(new Complejo(0,0),0 ,0 );
		mresp.addMatriz(new Complejo(0.5,0),1 ,0 );
		mresp.addMatriz(new Complejo(0.5,0),2 ,0 );
		mresp.addMatriz(new Complejo(0,0),3 ,0 );
	
		assertEquals(mresp,s.ejercicio311(m1, m2, 1));
		
		MatrizComplejo mresp2 = new MatrizComplejo(4,1);
		mresp2.addMatriz(new Complejo(0.5,0),0 ,0 );
		mresp2.addMatriz(new Complejo(0,0),1 ,0 );
		mresp2.addMatriz(new Complejo(0,0),2 ,0 );
		mresp2.addMatriz(new Complejo(0.5,0),3 ,0 );
		
		assertEquals(mresp2,s.ejercicio311(m1, m2, 2));
	
	}
	
	@Test
	public void ejercicio322() {
		int r=2;
		int b=5;
		
		ClasicoACuantico s = new ClasicoACuantico();

		Matriz m1 = new Matriz({{new numero(1,0) , new numero(0,0), new numero(0,0),new numero(0,0),new numero(0,0),new numero(0,0),new numero(0,0)}});
	
	}
	
	@Test
	public void probabilidadParticulaPorPosicion() {
		ClasicoACuantico s = new ClasicoACuantico();
		Matriz m = new Matriz({{new numero(-3,-1) , new numero(0,-2), new numero(0,1),new numero(2,0)}});

		
		MatrizComplejo m1 = new MatrizComplejo(4,1);
		m1.addMatriz(new Complejo(0.5263157894736842,0), 0, 0);
		m1.addMatriz(new Complejo(0.21052631578947364,0), 1, 0);
		m1.addMatriz(new Complejo(0.05263157894736841,0), 2, 0);
		m1.addMatriz(new Complejo(0.21052631578947364,0), 3, 0);
		
		int p = 2;
		assertEquals(m1.getMatriz()[p][0].getEntera(),s.particulaPorPosicion(p, m),1);
		
	}
	
	@Test
	public void probabilidadTransitarKetAKet() {
		ClasicoACuantico s = new ClasicoACuantico();
		Matriz m = new Matriz({{new numero(Math.sqrt(2)/2,0) , new numero(0,Math.sqrt(2)/2)}});
		
		MatrizComplejo m1 = new MatrizComplejo(2,1);
		m1.addMatriz(new Complejo(0,Math.sqrt(2)/2),0 ,0);
		m1.addMatriz(new Complejo(-Math.sqrt(2)/2,0),1 ,0);
		
		Complejo resp = new Complejo(0,-1);
		resp.equals(s.probabilidadKet(m, m1));
	}
	
	@Test
	public void calculandoValorMedio() {
		ClasicoACuantico s = new ClasicoACuantico();
		
		Matriz m =  new Matriz({{new numero(Math.sqrt(2)/2,0) , new numero(0,Math.sqrt(2)/2)}});
		
		MatrizComplejo m1 = new MatrizComplejo(2,2);
		m1.addMatriz(new Complejo(1,0),0 ,0);
		m1.addMatriz(new Complejo(0,1),1 ,0);
		m1.addMatriz(new Complejo(0,-1),0 ,1);
		m1.addMatriz(new Complejo(2,0),1 ,1);
		
		numero resp = new numero(2.5000000000000004, 0);
		assertEquals(resp, s.valorMedio(m1, m));
	}

}
