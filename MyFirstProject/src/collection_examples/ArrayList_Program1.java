package collection_examples;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Program1 {

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		a1.add(987);
		a1.add(458);
		a1.add("Nikita");
		a1.add(true);
		a1.add(8.765);
		a1.add('P');
		a1.add(null);
		System.out.println(a1);
		//Collections.sort(a1);
		
		
		ArrayList a2= new ArrayList();
		a2.add(876);
		a2.add(811);
		a2.add(123);
		a2.add(1);
		a2.add(90);
		a2.add(-90);
		Collections.sort(a2);
		System.out.println(a2);
		

	}

}
