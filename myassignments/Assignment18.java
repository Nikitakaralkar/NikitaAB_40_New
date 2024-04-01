package myassignments;

import java.util.Date;

public class Assignment18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Date d1= new Date();
		System.out.println(d1.getTime());//machine time
		
		Date d2= new Date(d1.getTime()); //human time
		System.out.println(d2);
		
		String currenttime =d2.toString();
		//String futuretime =d2.toString();
		
		Date d3= new Date(d1.getTime()+(1000*60*60*24*10));//human time
		System.out.println(d3);

	}

}
