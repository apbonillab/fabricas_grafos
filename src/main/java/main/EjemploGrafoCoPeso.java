package main;

import java.util.List;

import dtos.Nodo;
import grafoI.Grafos;
import grafoImpl.GrafoDirigidoPeso;
import grafoImpl.GrafoSimple;

public class EjemploGrafoCoPeso {

	private static Grafos grafosI;

	 
public static void main(String[] args) {
		
	
		try {
			
			grafosI = new GrafoDirigidoPeso();
			
			grafosI.agregarNodo("A");
			grafosI.agregarNodo("B");
			grafosI.agregarNodo("C");
			
			grafosI.agregarArcoConPeso("A", "B", 1);
			grafosI.agregarArcoConPeso("B", "C", 1);
			grafosI.agregarArcoConPeso("A", "C", 2);

			List<Nodo> camino = grafosI.buscarRuta("A", "C");
			
			if (camino == null) {
				System.out.println("Camino A -> C no encontrado");
			} else {
				System.out.println("Camino A -> C encontrado");
				for (Nodo nodo: camino) {
					System.out.println(nodo.getNombre());
				}				
			}
			System.out.println();
			
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
	}
}
