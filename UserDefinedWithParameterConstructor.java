package Constructor;

public class UserDefinedWithParameterConstructor 
{
	int a;
	int b;
	int c;
	
	public UserDefinedWithParameterConstructor()  //user defined without parameter constructor
	{
		 a=20;
		 b=30;
		 c=40;
	}
	
	public UserDefinedWithParameterConstructor(int x)//user define with one parameter constructor
	{
		a=x;
		
	}
	public UserDefinedWithParameterConstructor(int x,int y)
	{
		a=x;
		b=y;
	}
	public UserDefinedWithParameterConstructor(int x,int y,int z)
	{
		a=x;
		b=y;
		c=z;
	}

	public static void main(String[] args) 
	{
		UserDefinedWithParameterConstructor udc=new UserDefinedWithParameterConstructor();
		udc.addition();//calling method with zero parameter constructor
		UserDefinedWithParameterConstructor udc1=new UserDefinedWithParameterConstructor(1000);
		udc1.addition();
		UserDefinedWithParameterConstructor udc3=new UserDefinedWithParameterConstructor(45, 50, 70);
		udc3.addition();
		UserDefinedWithParameterConstructor udc2=new UserDefinedWithParameterConstructor(500, 400);
		udc2.addition();
			
		}
	
	   public void addition()
	   {
		   int sum=a+b+c;
		   System.out.println("addition is "+sum);
	
	}
	
	
	

}
