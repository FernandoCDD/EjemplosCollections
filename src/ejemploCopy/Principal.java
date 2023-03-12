package ejemploCopy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> lista = new ArrayList<Integer>();
		
		lista.add(0);
		lista.add(1);
		lista.add(2);
		lista.add(3);
		
		List<Integer> lista2 = new ArrayList<Integer>();
		
		lista2.add(6);
		lista2.add(7);
		lista2.add(8);
		
		System.out.println(lista);
		System.out.println(lista2);
		
		Collections.copy(lista, lista2);
		
		System.out.println(lista);
		
	}

}
