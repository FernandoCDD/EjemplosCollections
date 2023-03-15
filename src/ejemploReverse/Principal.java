package ejemploReverse;

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
		lista.add(3);

		System.out.println("Lista sin reverso: "+lista);
		Collections.reverse(lista);
		System.out.println("Lista con reverso: "+lista);
		
	}

}
