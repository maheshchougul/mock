package Constructor;

public class DefaultConstructor 
{
	// public DefaultConstructor()
			// {
			// // default constructor--> created by compiler
		//}

	String city="pune";// variable declaration manually
	// use of constructor --> to initiazite variable
	
	String name;// variable declration
	
	public DefaultConstructor()
	{
		name="gad";
	}
	

	public static void main(String[] args) 
	{
		
	   
		DefaultConstructor dc=new DefaultConstructor();//created object of class
		dc.sample();
		DefaultConstructor dc1=new DefaultConstructor();
		dc1.test();
		
	}

	
	public void sample()
	{
		System.out.println("this is default cons");
	}
	public void test()
	{
		System.out.println("this is sample");
	}
}

