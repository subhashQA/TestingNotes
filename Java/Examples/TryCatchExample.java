package javaexamples;

public class TryCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int x=10;
			int dev=x/0;
			System.out.println("After devision");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot devide by zero");
			System.out.println("Exception thrown " +e);
		}
		System.out.print("After catch block");
	}

}
