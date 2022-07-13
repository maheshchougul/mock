package Constructor;

public class UserDefinesConstructor 
{
	int a;  // 1. variable declaration
	int b;  //1. variable declaration
	
	public UserDefinesConstructor()
	{
		// user defined constructor
		//The constructor is called when an object of a class is created.
		System.out.println("hi UserDefinedConstructor is running");
		//initialize data member/variable
		a=850;
		b=750;
	}
	
	public static void main(String[] args) 
	{
		UserDefinesConstructor udf=new UserDefinesConstructor();// object of class is created
		udf.sum();
		udf.sub();

	}

	public void sum()
	{
		int sum=a+b;//value of a and b will be received form constructor
		System.out.println("Sum is   "+sum);
	}
	
	public void sub()
	{
		int sub= a-b;//value of a and b will be received form constructor
		System.out.println("Sub is   "+sub);
	}
}
