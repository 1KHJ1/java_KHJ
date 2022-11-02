package java_khjInstance;
public class sum{
		
	public void answer(int n) {
		int sum =0;
		for (int i = 0; i < n+1; i++) 
			{
			sum = sum + i;
		}System.out.println(sum);
	}

	public static void main(String[] arg) {

		sum total = new sum();
		total.answer(10);

	}
	
			
}