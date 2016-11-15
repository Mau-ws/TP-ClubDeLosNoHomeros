package ar.edu.unlam.Progbasica2;

public class Tambor {
	
	
private Integer posicion = 1;


public void girar() {
	
	Integer cantDeNumerosDelTambor=10;
	
	this.posicion = (int)(Math.random()*cantDeNumerosDelTambor+1);
	
}

public Integer getPosicion(){
	return this.posicion;
	
}

}


