package ar.edu.unlam.progbasica2;

import java.util.*;


public class BarHomero {
	
	
	public TreeSet<Clientes> listaDeClientes;
	
	private	int cantidadDeClientes=0;
	
    public BarHomero( )
    {
	 listaDeClientes=new TreeSet<Clientes>();
	}
    
	public void agregarClientes(Clientes cliente){
		
		cantidadDeClientes++;
		listaDeClientes.add(cliente);
	}
	
	
	public TreeSet<Clientes> getListaDeClientes() 
	{
		return listaDeClientes;
	}

	public void setListaDeClientes(TreeSet<Clientes> listaDeClientes)
	{
		this.listaDeClientes = listaDeClientes;
	}
	
	public int getCantidadDeClientes()
	{
		return cantidadDeClientes;
	}

public TreeSet<Clientes> comparandoLosClientesPorEdad()
{
	
	ComparaClientesPorSuEdad edad=new ComparaClientesPorSuEdad();
	TreeSet<Clientes> ordenar_cliente=new TreeSet<Clientes>(edad);

	ordenar_cliente.addAll(listaDeClientes);
	

	for (Clientes clientes : ordenar_cliente) {
		
		System.out.println(clientes.getNombre()+clientes.getEdad());
	}
  	return ordenar_cliente;
}

public boolean ComparandoClientesAdentroYAfuera(BarHomero bar,Clientes cliente)
{
	  
	boolean igual=false;
	Iterator<Clientes> ListaClientes=bar.listaDeClientes.iterator();
	
	while(ListaClientes.hasNext())
	{
  	 Clientes unCliente = (Clientes) ListaClientes.next();
  	  
  	 String nom=unCliente.getNombre();
  	 
  	 
  	 if(cliente.getNombre().equals(nom))
  	 {
  	    igual=true;
  	 }
  	 else
  	 { 
  		 igual=false;
  	 }
  	 
   }
	 return igual;     	
}	
}
