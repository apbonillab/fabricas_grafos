package grafoImpl;

import java.util.List;

import dtos.Nodo;
import grafoI.Arcos;
import grafoI.Grafos;

public class GrafoSimple implements Grafos {

	private static final String DFS = "DFS";
	 Nodos nodos = new Nodos();
	Arcos arcosI;
	ContextBusqueda busqueda = new ContextBusqueda();
	
	public void agregarNodo(String nombre)
	{
		nodos.agregarNodo(nombre);
	}
	
	public void agregarArco(String origen, String destino) {
		arcosI = new ArcoDoble();
		arcosI.agregarArco(nodos.buscarNodo(origen), nodos.buscarNodo(destino));
	}
	
	public boolean existeRuta(String origen, String destino) {
		if (buscarRuta(origen, destino) != null) {
			return true;
		}
		return false;
	}
	
	public List<Nodo> buscarRuta(String origen, String destino) {
		System.out.println("---> "+nodos);
		return busqueda.buscarRuta(origen, destino, DFS, nodos.buscarNodo(origen), nodos.buscarNodo(destino));
	}


	public void agregarArcoConPeso(String nodoOrigen, String nodoDestino, int peso) {
        throw new RuntimeException("Agregar arco con peso no soportado");
		
	}



}
