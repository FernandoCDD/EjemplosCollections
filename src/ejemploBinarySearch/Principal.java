package ejemploBinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numeros = new ArrayList <Integer>();
		
		numeros.add(0);
		numeros.add(1);
		numeros.add(2); 
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		numeros.add(7);
		numeros.add(8);
		numeros.add(9);
	
		System.out.println(Collections.binarySearch(numeros, 7));
		
			
	}

}
