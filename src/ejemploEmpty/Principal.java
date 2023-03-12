package ejemploEmpty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Integer> lista1 = new ArrayList<Integer>();
		
		lista1.add(1);
		lista1.add(null);
		lista1.add(3);
		
		Collections.enumeration(lista1);
		
		
	}

}
