package ejemploNewSetFromMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map <String, Boolean> lista1 = new HashMap<String, Boolean>();
		Set<String> lista2 = Collections.newSetFromMap(lista1);
		
		lista2.add("Sevilla");
		lista2.add("Betis");
		lista2.add("Colspe");
		
		System.out.println(lista1);
		System.out.println(lista2);
		
	}

}
