package grafoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import dtos.Nodo;
import grafoI.Busqueda;

public class BusquedaGrafoDFS implements Busqueda {

	

public List<Nodo> buscarRuta(String origen, String destino, String type, Nodo nodoOrigen, Nodo nodoDestino) {
		
        List<Nodo> nodosRuta = new ArrayList<Nodo>();
        
        // Origen o destino no encontrado
        if (nodoOrigen == null) {
            throw new RuntimeException("Error en la B�squeda: NodoOrigen no encontrado");
        }
        if (nodoDestino == null) {
            throw new RuntimeException("Error en la B�squeda: NodoOrigen no encontrado");
        }
        
        if (buscarRutaDFS(nodosRuta, nodoOrigen, nodoDestino)) {
            return nodosRuta;
        }  else {
            return null;
        }
	}
	
private boolean buscarRutaDFS(List<Nodo> nodosRuta, Nodo nodoOrigen, Nodo nodoDestino) {
        
        // agrega el origen
        nodosRuta.add(nodoOrigen);
        
        // origen y destino son el mismo ?
        if(nodoOrigen.getNombre().equals(nodoDestino.getNombre())){
            return true;
        }
        
        // si no son el mismo, revise las rutas usando una pila
        Stack<Nodo> pilaDeNodos = new Stack<Nodo>();
        ArrayList<Nodo> nodosVisitados = new ArrayList<Nodo>();
        pilaDeNodos.add(nodoOrigen);
        while(!pilaDeNodos.isEmpty()){
            Nodo actual = pilaDeNodos.pop();
            // ignore los nodos ya visitados
            if (nodosVisitados.contains(actual))
                continue;
            
            // es el nodo que estamos buscando ?
            if (actual.equals(nodoDestino)) {
                nodosRuta.addAll(pilaDeNodos);
                nodosRuta.add(nodoDestino);
                return true;
            }
            else {
                // siga buscando en las rutas no visitadas
                nodosVisitados.add(actual);
                for(Nodo nodo: actual.getNodosAdyacentes()) {
                    if (!pilaDeNodos.contains(nodo))
                        pilaDeNodos.add(nodo);
                }
            }
        }
        return false;
        
    }   

	public boolean existeRuta(String origen, String destino, String type, Nodo nodoOrigen, Nodo nodoDestino) {
		 if (buscarRuta(origen, destino, type, nodoDestino, nodoDestino) != null) {
	            return true;
	        }
	        return false;
	}

}
