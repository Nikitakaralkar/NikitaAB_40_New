package string_examples;

public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="I am Nikita";
		String s="";
		System.out.println(name.substring(5));
		System.out.println(name.substring(3, 8));
		
		//contains()
		
		boolean answer = name.contains("zx");
		System.out.println(answer);
		
		boolean answer1 = name.contains("Ni");
		System.out.println(answer1);
		
		//concat
		
		String concat1= name.concat("Karalkar");
		System.out.println(concat1);
		
		
	}

}
