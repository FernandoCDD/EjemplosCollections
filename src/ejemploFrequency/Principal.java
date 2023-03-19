package ejemploFrequency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Integer> lista1 = new ArrayList <Integer>();
		
		Collections.addAll(lista1, 1,1,2,2,2,3,4,5,6,6,6,6,7,8,8,9);		
		
		System.out.println("¿Cuántas veces se repite el 2?");
		System.out.println("Se repite: "+Collections.frequency(lista1, 2)+" veces.");
		
	}

}
