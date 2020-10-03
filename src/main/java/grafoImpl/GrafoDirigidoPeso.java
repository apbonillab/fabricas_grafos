package grafoImpl;

import java.util.List;

import dtos.Nodo;
import grafoI.Arcos;
import grafoI.Grafos;

public class GrafoDirigidoPeso implements Grafos{

	private static final String DFS = "DFS";
	private static final Nodos nodos = new Nodos();
	Arcos arcosI;
	ContextBusqueda busqueda = new ContextBusqueda();
	
	public void agregarNodo(String nombre)
	{
		nodos.agregarNodo(nombre);
	}
	
	public void agregarArco(String origen, String destino) {
		throw new RuntimeException("Agregar arco SIN peso no soportado");
		
	}
	
	public boolean existeRuta(String origen, String destino) {
		if (buscarRuta(origen, destino) != null) {
			return true;
		}
		return false;
	}
	
	public List<Nodo> buscarRuta(String origen, String destino) {
		return busqueda.buscarRuta(origen, destino, DFS, nodos.buscarNodo(origen), nodos.buscarNodo(destino));
	}

	public void agregarArcoConPeso(String origen, String destino, int peso ) {
		arcosI = new ArcoConPeso();
		arcosI.agregarArcoConPeso(nodos.buscarNodo(origen), nodos.buscarNodo(destino),peso);
	
		
	}


}
