package grafoImpl;

import java.util.ArrayList;
import java.util.List;

import dtos.Arco;
import dtos.Nodo;
import grafoI.Arcos;

public class ArcoSimple implements Arcos {

	private static final List<Arco> arcos = new ArrayList<Arco>();

	 
	 public List<Arco> agregarArco(Nodo nodoOrigen, Nodo nodoDestino) {
		 if (nodoOrigen == null) {
	            throw new RuntimeException("Error en la B�squeda: NodoOrigen no encontrado");
	        }
	        if (nodoDestino == null) {
	            throw new RuntimeException("Error en la B�squeda: NodoOrigen no encontrado");
	        }
	        return agregarArcoSimple(nodoOrigen, nodoDestino);
			
		}

	

	public List<Arco> agregarArcoSimple(Nodo nodoOrigen, Nodo nodoDestino) {
		
		Arco arco = new Arco();
		arco.setOrigen(nodoOrigen);
		arco.setDestino(nodoDestino);
		arcos.add(arco);
		nodoOrigen.agregarArco(arco);
		return arcos;
	}

	public List<Arco> agregarArcoConPeso(Nodo nodoOrigen, Nodo nodoDestino, int peso) {
        throw new RuntimeException("Agregar arco con peso no soportado");

	}

}
