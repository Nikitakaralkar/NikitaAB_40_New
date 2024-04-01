package myassignments;

class One
{       static void m1() {
		System.out.println("Inside Class One");
	}
}
class Two extends One
{       static void m2() {
		System.out.println("Inside Class Two");
	}
}
class Three extends Two
{
	static void m3() {
		System.out.println("Inside Class Three");
	}
}
class Four extends Three
{
	static void m4() {
		System.out.println("Inside Class Four");
	}
}
public class Assignment14 extends Four{
    public static void main(String[] args) {
        m1();
		m2();
		m3();
		m4();
		System.out.println("Inside Class Five");
     }
}
