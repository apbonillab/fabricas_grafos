package dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Arco {

	private Nodo origen;
	private Nodo destino;
	private int peso;
}
