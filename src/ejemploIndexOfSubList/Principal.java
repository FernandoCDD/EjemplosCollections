package ejemploIndexOfSubList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> fuente = new ArrayList <String>();
		
		fuente.add("A");
		fuente.add("B");
		fuente.add("C");	
		fuente.add("D");	
		fuente.add("E");	
		fuente.add("F");	
		fuente.add("G");
		System.out.println(fuente);
		List <String> buscador = new ArrayList <String>();
		
		buscador.add("C");
		buscador.add("D");
		buscador.add("E");
		buscador.add("F");		
		System.out.println(buscador);
		System.out.println(Collections.indexOfSubList(fuente, buscador));
		System.out.println(Collections.lastIndexOfSubList(fuente, buscador));
		
	}

}
