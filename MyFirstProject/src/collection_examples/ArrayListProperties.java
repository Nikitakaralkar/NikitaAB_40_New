package collection_examples;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProperties {

	public static void main(String[] args) {

  ArrayList al = new ArrayList();
  al.add(12);   //Dynamic because we can add elements without giving size..growable
  al.add(15);
  al.add(10);
  System.out.println(al); // Follows indexing //Output [12, 15, 10]
  al.add(15);   //Check Duplicate
  al.add(15);   //Check Duplicate
  System.out.println(al);    //  [12, 15, 10, 15, 15]
  al.add("aa");    //Heterogeneous
  System.out.println(al);     //12, 15, 10, 15, 15, aa]
  al.add(null);  
  al.add(null); 
  System.out.println(al);  //[12, 15, 10, 15, 15, aa, null, null]
  
  ArrayList a2 = new ArrayList();
  System.out.println(al);
  a2.add(12);   
  a2.add(15);
  a2.add(10);
  Collections.sort(a2);    //Sorting [10, 12, 15]

  System.out.println(a2);
  
  

	}

}
