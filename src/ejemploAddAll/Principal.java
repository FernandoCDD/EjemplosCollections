package ejemploAddAll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Integer> lista = new ArrayList <Integer>();
		
		lista.add(0);
		lista.add(1);
		lista.add(2);
		lista.add(3);
		
		// Lista sin addAll
		System.out.println(lista);
		
		Collections.addAll(lista, 4, 5, 6);
		
		// Lista con addAll
		System.out.println(lista);
		
	
		
	}

}
