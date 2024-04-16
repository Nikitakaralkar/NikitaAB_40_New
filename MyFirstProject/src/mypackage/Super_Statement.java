package mypackage;

class GrandParent_class
{
	public GrandParent_class() {
		System.out.println("3");
	}
}

class Parent_class extends GrandParent_class
{
	public Parent_class() {
		System.out.println("2");
	}
}

class Child_class extends Parent_class
{
	public Child_class() {
		System.out.println("1");
	}
}

public class Super_Statement extends Child_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Super_Statement s1= new Super_Statement();

		
	}

}
