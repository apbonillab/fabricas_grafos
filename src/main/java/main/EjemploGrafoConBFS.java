package main;

import java.util.List;

import dtos.Nodo;
import grafoI.Grafos;
import grafoImpl.GrafoConBFS;

public class EjemploGrafoConBFS {

	 private static Grafos grafosI;
	 
	public static void main(String[] args) {
		
		
		
		try {
			
			grafosI = new GrafoConBFS();
			
			grafosI.agregarNodo("A");
			grafosI.agregarNodo("B");
			grafosI.agregarNodo("C");
			grafosI.agregarNodo("D");
			grafosI.agregarNodo("E");
			
			grafosI.agregarArco("A", "B");
			grafosI.agregarArco("B", "C");
			grafosI.agregarArco("C", "D");
			grafosI.agregarArco("E", "D");
			grafosI.agregarArco("A", "C");
			
			List<Nodo> camino = grafosI.buscarRuta("A", "C");
			
			if (camino == null) {
				System.out.println("Camino A -> E no encontrado");
			} else {
				System.out.println("Camino A -> E encontrado");
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
