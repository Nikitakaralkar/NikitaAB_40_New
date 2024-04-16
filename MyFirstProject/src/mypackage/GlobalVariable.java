package mypackage;

public class GlobalVariable {

	
	int a=100; // you have to access it in same fashion how you access the non static method
	static double pi=3.14;
	 
	public static void main(String[] args) {
		
            System.out.println(pi);
      GlobalVariable g1= new GlobalVariable();
            g1.a=200;
            System.out.println(g1.a);
  
	}

}
