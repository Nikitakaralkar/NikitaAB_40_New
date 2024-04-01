package myassignments;

import java.util.Scanner;

public class Assignment22 {

	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number:");
    int n= sc.nextInt();
    
    if(n%3==0 && n%5==0)
    {
    	System.out.println("Frog and Cat");
    } 
    
    else if(n%3==0)
    {
    	System.out.println("Frog");
    }
    
    else if(n%5==0)
    {
    	System.out.println("Cat");
    }
    
    sc.close();
    
	}

}
