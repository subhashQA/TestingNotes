package javaexamples;

class Class1
{
	void method1() throws ArithmeticException
	{
		System.out.println("method one code which may throw run time exception");
	}
}
public class ThrowsExample extends Class1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsExample obj=new ThrowsExample();
		try
		{
			obj.method1();
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch code");
		}
		System.out.println("Rest of the code");
	}

}
