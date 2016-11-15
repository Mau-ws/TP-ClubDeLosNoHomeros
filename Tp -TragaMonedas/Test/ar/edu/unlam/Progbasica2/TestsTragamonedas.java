package ar.edu.unlam.Progbasica2;
import static org.junit.Assert.*;
import  org.junit.Assert;

import org.junit.*;


import junit.framework.AssertionFailedError;



public class TestsTragamonedas {

	
	@Test
	public void PosicionDeTamboresEntre1y10() {
		
		Tragamonedas tragamonedas=new Tragamonedas();
		tragamonedas.activar();
		Integer t1= tragamonedas.tambor1.getPosicion();
		Integer t2= tragamonedas.tambor2.getPosicion();
		Integer t3= tragamonedas.tambor3.getPosicion();
		
		assertTrue(t1 >= 1 && t1 <= 10);
		assertTrue(t2 >= 1 && t2 <= 10);
		assertTrue(t3 >= 1 && t3 <= 10);
		
	}
	
	
	@Test
	public void TamboresEnPosicion1()
	{
		Tragamonedas tragamonedas = new Tragamonedas();
		Integer posicionDeTambor1 = tragamonedas.tambor1.getPosicion();
		Integer posicionDeTambor2 = tragamonedas.tambor2.getPosicion();
		Integer posicionDeTambor3 = tragamonedas.tambor3.getPosicion();
		assertTrue(posicionDeTambor1==1 && posicionDeTambor2==1 && posicionDeTambor3==1);
	}


	@Test
	public void FuncionamientoTragamonedas()
	{
		Tragamonedas tragamonedas = new Tragamonedas();
		tragamonedas.activar();
	
		Boolean ValorEsperado=true;
		
		if (tragamonedas.entregaPremio().equals(ValorEsperado))
		{
			System.out.println("¡Ganaste!");
		
		}
		else
		{
			System.out.println("Perdiste,vuelve a internar!");
			
		}
					
	}
	
}
