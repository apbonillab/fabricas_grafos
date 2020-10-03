package grafoImpl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import dtos.Nodo;
import grafoI.Busqueda;

public class BusquedaGrafoBFS implements Busqueda {

	public List<Nodo> buscarRuta(String origen, String destino, String type, Nodo nodoOrigen, Nodo nodoDestino) {
		
        List<Nodo> nodosRuta = new ArrayList<Nodo>();
        
        // Origen o destino no encontrado
        if (nodoOrigen == null) {
            throw new RuntimeException("Error en la B�squeda: NodoOrigen no encontrado");
        }
        if (nodoDestino == null) {
            throw new RuntimeException("Error en la B�squeda: NodoOrigen no encontrado");
        }
        
        if (buscarRutaBFS(nodosRuta, nodoOrigen, nodoDestino)) {
            return nodosRuta;
        }  else {
            return null;
        }
	}
	
private boolean buscarRutaBFS(List<Nodo> nodosRuta, Nodo nodoOrigen, Nodo nodoDestino) {
        
        // origen y destino son el mismo ?
        if(nodoOrigen.getNombre().equals(nodoDestino.getNombre())){
            System.err.println("Nodo destino encontrado en el mismo nodo origen");
            nodosRuta.add(nodoOrigen);
            return true;
        }
        
        // si no son el mismo, revise las rutas usando una cola
        Queue<Nodo> queue = new LinkedList<Nodo>();
        ArrayList<Nodo> nodosVisitados = new ArrayList<Nodo>();
        
        queue.add(nodoOrigen);
        nodosVisitados.add(nodoOrigen);
        while(!queue.isEmpty()){
            
            Nodo actual = queue.remove();
            if(actual.equals(nodoDestino)) {
                nodosRuta.add(actual);
                return true;
            }
            else{
                if(actual.getNodosAdyacentes().isEmpty())
                    return false;
                else {
                    for (Nodo nodo: actual.getNodosAdyacentes()) {
                        if (!nodosVisitados.contains(nodo))
                            queue.add(nodo);
                    }
                }
                    
            }
            if (!nodosRuta.contains(actual))
                nodosRuta.add(actual);
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
