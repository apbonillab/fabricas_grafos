package grafoImpl;

import java.util.ArrayList;
import java.util.List;

import dtos.Arco;
import dtos.Nodo;
import grafoI.Arcos;

public class ArcoDoble implements Arcos {

	static final List<Arco> arcos = new ArrayList<Arco>();

	
	public List<Arco> agregarArco(Nodo nodoOrigen, Nodo nodoDestino) {
		{
			Arco arco = new Arco();
			arco.setOrigen(nodoOrigen);
			arco.setDestino(nodoDestino);
			arcos.add(arco);
			nodoOrigen.agregarArco(arco);
			
			arco = new Arco();
			arco.setOrigen(nodoDestino);
			arco.setDestino(nodoOrigen);
			arcos.add(arco);
			nodoDestino.agregarArco(arco);
			return arcos;
		}
	}
	
	public List<Arco> agregarArcoConPeso(Nodo nodoOrigen, Nodo nodoDestino, int peso) {
        throw new RuntimeException("Agregar arco con peso no soportado");

	}
}
