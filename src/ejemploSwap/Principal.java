package ejemploSwap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <String> lista = new ArrayList <String>();
		
		lista.add("Ángel");
		lista.add("Luismi");
		lista.add("Rafa");
		lista.add("Miguel");
		lista.add("Fernando");
		
		Collections.swap(lista, 0, 2);
		System.out.println(lista);
	}

}
