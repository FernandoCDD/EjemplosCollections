package ejemploEnumeration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <String> lista1 = new ArrayList <String>();
		
		lista1.add("Fernando");
		lista1.add("Fran");
		lista1.add("Sebastián");
		
		// COLECCIÓN SIN ENUMERACIÓN
		System.out.println(lista1);
		
		//COLECCIÓN CON ENUMERACIÓN
		Enumeration<String> e = Collections.enumeration(lista1);
	
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		
		}
		
	}

}
