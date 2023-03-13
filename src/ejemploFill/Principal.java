package ejemploFill;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <String> lista1 = new ArrayList <String> ();
		
		lista1.add("Buenos");
		lista1.add("días");
		lista1.add("a todos");
		
		System.out.println(lista1);
		
		Collections.fill(lista1, "Buenas tardes");
		
		System.out.println(lista1);
	}

}
