package grafoImpl;

import java.util.List;

import dtos.Nodo;
import grafoI.Busqueda;

public class ContextBusqueda  {
	
	 Busqueda busquedaI;
	 Nodos nodos = new Nodos();
	 
	 public List<Nodo> buscarRuta(String origen, String destino, String type, Nodo nodoOrigen, Nodo nodoDestino) {
			if("DFS".equalsIgnoreCase(type)) 
				busquedaI = new BusquedaGrafoDFS();
			else
				busquedaI = new BusquedaGrafoBFS();
			return busquedaI.buscarRuta(origen, destino, type,nodos.buscarNodo(origen), nodos.buscarNodo(destino));
		}

		public boolean existeRuta(String origen, String destino, String type, Nodo nodoOrigen, Nodo nodoDestino) {
			if("DFS".equalsIgnoreCase(type)) 
				busquedaI = new BusquedaGrafoDFS();
			else
				busquedaI = new BusquedaGrafoBFS();
			return busquedaI.existeRuta(origen, destino, type,  nodos.buscarNodo(origen), nodos.buscarNodo(destino));
		}
		

	
	
	
	
	
    
	
	

	

	

	

}
