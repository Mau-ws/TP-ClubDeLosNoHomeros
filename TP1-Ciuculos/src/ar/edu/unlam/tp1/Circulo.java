package ar.edu.unlam.tp1;

public class Circulo {
	
	
	private double radio;
	
	
	
	public void setRario(Double radio)
	{
		this.radio=radio;
	}
	
	public double getRadio()
	{
		return this.radio;
		
	}

	public double perimetro()
	{
		return 2*Math.PI*this.radio;
	}
}
