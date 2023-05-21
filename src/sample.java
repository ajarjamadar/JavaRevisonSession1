
public class sample {
	
	int a;
	
	sample()
	{
		a=10;
	}
	
	public void add()
	{
		int b=5;
		int c=a+b;
		System.out.println("addition of a+b = "+c);
	}

	public static void main(String[] args) {
	
		sample s1 = new sample();
		s1.add();
		

	}

}
