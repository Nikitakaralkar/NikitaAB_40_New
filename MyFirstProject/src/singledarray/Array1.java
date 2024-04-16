package singledarray;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers[]= new int[5];
		numbers[0]=74;
		numbers[1]=52;
		numbers[2]=63;
		numbers[3]=52;
		numbers[4]=20;
		
		int sum=0;
		for(int i=0;i<numbers.length;i++) {
			
			sum= sum+ numbers[i];
		}
		
		System.out.println(sum);
		
		double avg=sum/numbers.length;
		System.out.println(avg);
		

	}

}
