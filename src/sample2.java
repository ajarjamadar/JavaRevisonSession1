
public class sample2 {
	
	sample sample = new sample();
	sample2()
	{
		
		sample.a=20;
	}
	
	public void div()
	{ 
		int b=10;
		int c = sample.a/b;
		System.out.println(c);
	}
	

	public static void main(String[] args) {
		
		sample2 s2 = new sample2();
		s2.div();

	}

}
