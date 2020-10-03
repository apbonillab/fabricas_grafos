package grafoImpl;

import java.util.ArrayList;
import java.util.List;

import dtos.Arco;
import dtos.Nodo;
import grafoI.Arcos;

public class ArcoConPeso implements Arcos {

	public List<Arco> agregarArcoConPeso(Nodo nodoOrigen, Nodo nodoDestino, int peso) {
		List<Arco> arcos = new ArrayList<Arco>();
		Arco arco = new Arco();
		arco.setOrigen(nodoOrigen);
		arco.setDestino(nodoDestino);
		arco.setPeso(peso);
		arcos.add(arco);
		nodoOrigen.agregarArco(arco);
		return arcos;
		
	}

	public List<Arco> agregarArco(Nodo nodoOrigen, Nodo nodoDestino) {
	        throw new RuntimeException("Agregar arco sin peso no soportado");
	}
}
