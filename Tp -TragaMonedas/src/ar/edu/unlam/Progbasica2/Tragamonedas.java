package ar.edu.unlam.Progbasica2;



public class Tragamonedas {
	
	
	public Tambor tambor1;
	public Tambor tambor2;
	public Tambor tambor3;
	


	
	public Tragamonedas() {
		
		tambor1 = new Tambor();
		tambor2 = new Tambor();
		tambor3 = new Tambor();
		
	}
	/*  activa el Tragamonedas haciendo girar
	* sus 3 Tambores.
	*/
	public void activar() {
		
		tambor1.girar();
		tambor2.girar();
		tambor3.girar();
	}
	
	
	/* indica si el Tragamonedas entrega un premio
	* a partir de la posición de sus 3 Tambores.
	*/
	public Boolean entregaPremio() {
		
		if (tambor1.getPosicion()==tambor2.getPosicion() && tambor1.getPosicion()==tambor3.getPosicion())
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	
	}



  