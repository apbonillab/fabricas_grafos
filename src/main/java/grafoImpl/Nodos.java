package grafoImpl;

import java.util.ArrayList;
import java.util.List;

import dtos.Nodo;

public class Nodos {

	 static final List<Nodo> nodos = new ArrayList<Nodo>();
	 
	public List<Nodo> agregarNodo(String nombre) {
		Nodo nodo = new Nodo();
        nodo.setNombre(nombre);
        nodos.add(nodo);
        return nodos;
		
	}
	
	public Nodo buscarNodo(String nombre) 
    {
        for (Nodo nodo: nodos) {
            if (nodo.getNombre().equals(nombre)) {
                return nodo;
            }
        }
        return null;
    }
	
}
