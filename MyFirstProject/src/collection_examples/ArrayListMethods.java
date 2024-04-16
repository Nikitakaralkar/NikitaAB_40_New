package collection_examples;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList a1= new ArrayList();
		a1.add(100);
		a1.add(200);
		System.out.println(a1);
		
		ArrayList a2= new ArrayList();
		a2.add("aa");
		a2.add("bb");
		System.out.println(a2);
		
		a1.addAll(a2);
		System.out.println(a1);
		
		//a1.clear();
		//System.out.println(a1);
		
		System.out.println(a1.contains(100));
		System.out.println(a1.containsAll(a2));
		
		System.out.println(a1.isEmpty());
		
		//a1.remove(0);  //taking index not integer value
		a1.remove("aa");  //working for string
		System.out.println(a1);
		
		
		
		a1.removeAll(a2);
		System.out.println(a1);
		
		System.out.println(a1.size());
		
		System.out.println(a1.get(0));
		
		a1.set(1, 300);
		System.out.println(a1);
		System.out.println(a2);
		
		//System.out.println(a1.indexOf(100)); ????????????
		
		

	}

}
