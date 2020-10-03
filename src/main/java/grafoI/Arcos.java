package grafoI;

import java.util.List;

import dtos.Arco;
import dtos.Nodo;

public interface Arcos {

	public List<Arco> agregarArco(Nodo nodoOrigen, Nodo nodoDestino);
	public List<Arco> agregarArcoConPeso(Nodo nodoOrigen, Nodo nodoDestino, int peso) ;

}
