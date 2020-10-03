 package grafoI;

import java.util.List;

import dtos.Nodo;

public interface Grafos {

	public void agregarNodo(String nombre);
	public void agregarArco(String origen, String destino) throws Exception;
	public void agregarArcoConPeso(String nodoOrigen, String nodoDestino, int peso);
	public List<Nodo> buscarRuta(String origen, String destino);
	public boolean existeRuta(String origen, String destino);
	
}
