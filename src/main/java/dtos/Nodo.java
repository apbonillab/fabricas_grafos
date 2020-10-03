package dtos;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Nodo {
	
	private String nombre;
	private List<Arco>	arcos = new ArrayList<Arco>();

	
	public void agregarArco(Arco arco) {
		arcos.add(arco);
	}

	public List<Nodo> getNodosAdyacentes() {
		List<Nodo> nodos = new ArrayList<Nodo>();
		
		// por cada arco donde el nodo es origen
		for (Arco arco : arcos) {
			// si el arco no es reflexivo
			if (arco.getDestino() != this)
				// agrega el nodo destino a la lista 
				// de nodos adyacentes
				nodos.add(arco.getDestino());
		}
		
		// retorna la lista de nodos adyacentes
		return nodos;
	}
	
}
