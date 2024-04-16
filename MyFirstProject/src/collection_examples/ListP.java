package collection_examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListP {

	public static void main(String[] args) {
			
			
			List al = new ArrayList(); // To know the behaviour of listt interface
			
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
			  
			
			

	
	}

}
