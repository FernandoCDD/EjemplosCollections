package ejemploSingleton;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set <Integer> lista = new HashSet <Integer>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		Collections.singleton(lista);
		System.out.println(lista);
	}

}
