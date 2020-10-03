package grafoI;
import java.util.List;

import dtos.Nodo;

public interface Busqueda {
	
	List<Nodo> buscarRuta(String origen, String destino, String type, Nodo nodoOrigen, Nodo nodoDestino);
	boolean existeRuta(String origen, String destino, String type, Nodo nodoOrigen, Nodo nodoDestino);
	
}
