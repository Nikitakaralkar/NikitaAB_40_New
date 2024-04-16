package collection_examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Vector;

public class PriorityQueueProperties {

	public static void main(String[] args) {


		PriorityQueue pq= new PriorityQueue();
		pq.add(10);
		pq.add(4);
		pq.add(15);
		
		System.out.println(pq); // Do not follow indexing //Output [12, 15, 10]
		pq.add(15);   //Check Duplicate
		pq.add(15);   //Check Duplicate
		  System.out.println(pq);    //  [12, 15, 10, 15, 15]
		  pq.add(2);    //Not Heterogeneous
		  System.out.println(pq);     //12, 15, 10, 15, 15, aa]
		 // pq.add(null); // Do not accept null value 
		  //pq.add(null); 
		  System.out.println(pq);  //[12, 15, 10, 15, 15, aa, null, null]
		  
		  ArrayList pq2 = new ArrayList();
		  pq2.add(12);   
		  pq2.add(15);
		  pq2.add(10);
		  pq2.add(4);
		  Collections.sort(pq2);    //Sorting [10, 12, 15]
		  System.out.println(pq2);
		  
	}

}
