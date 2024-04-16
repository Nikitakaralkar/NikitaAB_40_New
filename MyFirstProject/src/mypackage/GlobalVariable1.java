package mypackage;

public class GlobalVariable1 {
	
	static int a=100; //Global variable
	
	 static int a1;
	String s;
	char c;
	static byte b;
	static short s1;
	static long l;
	static float f;
	static double d;
	static boolean bb;
	
	

	public static void main(String[] args) {
	  
	  //System.out.println("Global-"+a);
      int a=90; //Local variable
      //System.out.println("Local-"+a);
      GlobalVariable1 g = new GlobalVariable1();
      
      System.out.println(a1);
      System.out.println(g.s);
      System.out.println(g.c);
      System.out.println(b);
      System.out.println(s1);
      System.out.println(l);
      System.out.println(f);
      System.out.println(d);
      System.out.println(bb);
  
	}

}
