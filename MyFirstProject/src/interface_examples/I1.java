package interface_examples;

interface One
{
	void add();
	void sub();
}



public class I1 implements One{
	
	public void add()
	{
		System.out.println("Add");
	}

	public static void main(String[] args) {

     I1 i = new I1();
     i.add();

	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}

}
