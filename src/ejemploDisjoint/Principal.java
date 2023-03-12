package ejemploDisjoint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Integer> lista1 = new ArrayList <Integer>();
		
		lista1.add(1);
		lista1.add(2);
		
		Set <Integer> lista2 = new HashSet <Integer>();
		
		lista2.add(1);
		lista2.add(2);
		
		System.out.println(Collections.disjoint(lista1, lista2));
		
		
		
	}

}
