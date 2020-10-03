package main;

import java.util.List;

import dtos.Nodo;
import grafoI.Busqueda;
import grafoI.Grafos;
import grafoImpl.GrafoDirigidoPeso;
import grafoImpl.GrafoSimple;
import grafoImpl.Nodos;
import grafoImpl.ContextBusqueda;

public class EjemploGrafo {

	 private static Grafos grafosI;
	 
	public static void main(String[] args) {
		
		
		 
		try {
			
			grafosI = new GrafoSimple();
			
			grafosI.agregarNodo("A");
			grafosI.agregarNodo("B");
			grafosI.agregarNodo("C");
			
			grafosI.agregarArco("A", "B");
			grafosI.agregarArco("B", "C");
			grafosI.agregarArco("A", "C");

			List<Nodo> camino = grafosI.buscarRuta("A", "C");

			if (camino == null) {
				System.out.println("Camino A -> C no encontrado");
			} else {
				System.out.println("Camino A -> C encontrado");
				for (Nodo nodo: camino) {
					System.out.println(nodo.getNombre());
				}				
			}
			
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
}
