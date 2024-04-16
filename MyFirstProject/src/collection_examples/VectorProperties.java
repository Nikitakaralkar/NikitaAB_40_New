package collection_examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class VectorProperties {

	public static void main(String[] args) {

		Vector v= new Vector();
		v.add(10);
		v.add("Nikita");
		v.add(15.5);
		
		System.out.println(v); // Follows indexing //Output [12, 15, 10]
		  v.add(15);   //Check Duplicate
		  v.add(15);   //Check Duplicate
		  System.out.println(v);    //  [12, 15, 10, 15, 15]
		  v.add("aa");    //Heterogeneous
		  System.out.println(v);     //12, 15, 10, 15, 15, aa]
		  v.add(null);  
		  v.add(null); 
		  System.out.println(v);  //[12, 15, 10, 15, 15, aa, null, null]
		  
		  ArrayList v2 = new ArrayList();
		  v2.add(12);   
		  v2.add(15);
		  v2.add(10);
		  Collections.sort(v2);    //Sorting [10, 12, 15]
		  System.out.println(v2);
		  

	}

}
