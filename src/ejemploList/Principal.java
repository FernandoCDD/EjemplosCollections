package ejemploList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <String> lista = new ArrayList <String> ();
		
		lista.add("Hola");
		lista.add("Que");
		lista.add("Tal");
		
		Enumeration<String> e = Collections.enumeration(lista);
		
		System.out.println(Collections.list(e));
		
	}

}
