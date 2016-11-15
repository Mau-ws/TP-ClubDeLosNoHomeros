package ar.edu.unlam.progbasica2;

import org.junit.Test;

import ar.edu.unlam.progbasica2.BarHomero;
import ar.edu.unlam.progbasica2.Clientes;


import static org.junit.Assert.*;
import java.util.TreeSet; 

public class TestBarHomero {

       @Test
       public void BarAbiertoSinClientes(){
    	   
    	   BarHomero barSinClientes=new BarHomero();
    	   
    	   
    	   assertEquals(0,barSinClientes.listaDeClientes.size(),0.01);
    	   
       }
       
     
     @Test
    public void  BarConClientesOrdenadosPorNombre(){
    	 
    	 BarHomero bar=new BarHomero();
 		
    	 bar.agregarClientes(new Clientes("Carolina",22));
 		
    	 bar.agregarClientes(new Clientes("Josefina ",30));
 		
    	 bar.agregarClientes(new Clientes("Walter",17));
 		
    	 bar.agregarClientes(new Clientes("Pedro ",19));
 		
    	 bar.agregarClientes(new Clientes("Karen Rivero",18));
 		
    	 bar.agregarClientes(new Clientes("Walter",40));
 		
    	 bar.agregarClientes(new Clientes("Roberto ",55));
 		
    	 bar.agregarClientes(new Clientes("Pedro ",36));
 		
 		
 		
 		System.out.println("Clientes ordenados alfabeticamente: \n");
 		
 		
 		
 		for(Clientes corre: bar.listaDeClientes  )
 		{
 			
 			System.out.println(" Nombre: "+corre.getNombre()+", edad: "+ corre.getEdad());
 		
 		}
 		
 			Integer ClientesDentroDelBar=6;
 		
 				assertEquals(ClientesDentroDelBar,bar.listaDeClientes.size(),0.01);
    	  }
     
     
     
    
     @Test
     public void BarConClientesOrdenadosPorEdad(){
   	
   	  BarHomero Bar=new BarHomero();
    	 
   	  Clientes cli1=new Clientes("Visenta Garcia ",30);
    	 
   	  Clientes cli2=new  Clientes("David Almada ",52);
    	 	
   	  Clientes cli3=new Clientes("Ariel Latorre ",23);		 
    	
   	  Clientes cli4=new Clientes("Nicol Soplan ",19);
    	
   	  Clientes cli5=new Clientes("Steve Rogers ",25);
    	
   	  Clientes cli6=new Clientes("Santiago Pereira ",60);
    	
   	  Clientes cli7=new Clientes("Camila Gregorio ",22);
    	
   	   Bar.agregarClientes(cli1);
   	   Bar.agregarClientes(cli2);    	 
  	   Bar.agregarClientes(cli3);
   	   Bar.agregarClientes(cli4);
   	   Bar.agregarClientes(cli5);
   	   Bar.agregarClientes(cli6);
       Bar.agregarClientes(cli7);
    	 
    	 TreeSet<Clientes> listaEsperada=new TreeSet<Clientes>();
    	 
	   listaEsperada.add(cli1);
	   listaEsperada.add(cli2);
	   listaEsperada.add(cli3);
	   listaEsperada.add(cli4);
	   listaEsperada.add(cli5);
	   listaEsperada.add(cli6);
	   listaEsperada.add(cli7);
   	
    	
    	System.out.println("\nClientes ordenados por edad:\n");
    	
    	assertEquals(listaEsperada,Bar.comparandoLosClientesPorEdad());

     }
      
      @Test 
      public void comparandoClientesAdentroYAfueraDelBar(){
    	  
    	  BarHomero Clientes=new BarHomero();
    	  
    	  Clientes.agregarClientes(new Clientes("walter",53));
    	  
    	  Clientes.agregarClientes(new Clientes("arjona ",31));
    	  
    	  Clientes.agregarClientes(new Clientes("florencia",60));
    	  
    	  Clientes.agregarClientes(new Clientes("estefania",48));
    	  
    	  Clientes.agregarClientes(new Clientes("Roberto Melconian",48));
    	  
    	 
    	  Clientes cliente=new Clientes("walter",31);
    	 

            //comparo el nombre de un cliente de afuera con uno dentro del bar 
    	  
   		  assertTrue( Clientes.ComparandoClientesAdentroYAfuera(Clientes, cliente)==true);               
    	  
   		 }	                
      }