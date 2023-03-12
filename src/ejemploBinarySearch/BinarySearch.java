package ejemploBinarySearch;

import java.util.List;

public class BinarySearch {

	private List <Integer> numeros;

	public BinarySearch(List<Integer> numeros) {
		super();
		this.numeros = numeros;
	}

	public List<Integer> getNumeros() {
		return numeros;
	}

	public void setNumeros(List<Integer> numeros) {
		this.numeros = numeros;
	}

	public String toString() {
		return "BinarySearch [numeros=" + numeros + "]";
	}
	
	public int search (int objetivo) {
		
		int primero = 0;
		int ultimo = numeros.size() -1 ;
		
		while (primero <= ultimo) {
			int medio = primero + (ultimo - primero) / 2;
			
			if (objetivo < medio) {
				ultimo = medio -1;
			}else if (objetivo > medio) {
				primero = medio +1;
			}else
				return medio;
		}
		
		return -1;
	}
	
}
