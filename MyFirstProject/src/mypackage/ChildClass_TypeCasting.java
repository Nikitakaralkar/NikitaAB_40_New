package mypackage;
class Grandparent
{
	void add()
	{
		
	}
}

class ParentClass12 extends Grandparent
{
	void sub()
	{
		
	}
}


public class ChildClass_TypeCasting extends ParentClass12 {
	
	void mul()
	{
		
	}

	public static void main(String[] args) {
		
		        ParentClass12 p1=         new ChildClass_TypeCasting(); //upcating
		        p1.add();
		        p1.sub();
		        
		        
		        ChildClass_TypeCasting c1 = (ChildClass_TypeCasting)   p1;
                
	}

}
