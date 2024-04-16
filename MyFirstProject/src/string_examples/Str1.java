package string_examples;

public class Str1 {

	public static void main(String[] args) {
		
		String s= "I am Nikita12";
		
		String replace= s.replace('a', ' ');
		System.out.println(replace);
		
		String replace1= s.replace('a', 'n');
		System.out.println(replace1);
		
		String replace3= s.replaceAll("[A-Z]", " ");
		System.out.println(replace3);
		
		String replace4= s.replaceAll("[a-z]", " ");
		System.out.println(replace4);
		
		String name= "NikitA";
		String replace5= name.replaceAll("[A-Z]", "Manish");
		System.out.println(replace5);
		
		System.out.println(s.isEmpty());
		
		System.out.println(s.lastIndexOf('a'));
		
		System.out.println(s.equalsIgnoreCase("I am nikita12"));
		
		System.out.println(s.repeat(2));
		
		String s1="Nikita";
		char ch[] = s1.toCharArray();
		System.out.println(ch);
		
		
	}

}
