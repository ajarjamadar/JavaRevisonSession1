
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
	
	public static void mul()
	{
		int d=20;
		sample sample = new sample();
		int c = sample.a*d;
		System.out.println("multiplication of a*d = "+c);
	}

	public static void main(String[] args) {
	
		sample s1 = new sample();
		s1.add();
		s1.mul();
		

	}

}
