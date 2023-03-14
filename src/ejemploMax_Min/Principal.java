package ejemploMax_Min;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Integer> lista = new ArrayList <Integer>();
		
		lista.add(0);
		lista.add(1);
		lista.add(2);
	
		System.out.println(Collections.min(lista));
		
		List <String> lista2 = new ArrayList <String>();
		
		lista2.add("#");
		lista2.add("!");
		lista2.add("%");
	
		System.out.println(Collections.max(lista2));
			
	}
	
}
