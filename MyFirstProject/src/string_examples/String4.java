package string_examples;

import java.util.Date;

public class String4 {

	public static void main(String[] args) {

		
		Date d1= new Date();
		System.out.println(d1.getTime());//machine time
		
		Date d2= new Date(d1.getTime()); //human time
		System.out.println(d2);
		
		String currenttime =d2.toString();
		//String futuretime =d2.toString();
		
		Date d3= new Date(d1.getTime()+(1000*60*60*24*1));//human time
		System.out.println(d3);
		
		String month = currenttime.substring(4, 7);
		System.out.println(month);
		String date = currenttime.substring(8, 10);
		System.out.println(date);
		String year = currenttime.substring(currenttime.length()-4);
		System.out.println(year);
		
		
		System.out.println(month.concat(date).concat(year));
		System.out.println(month.concat("/").concat(date).concat("/").concat(year));
		
		
		
				

	}

}
