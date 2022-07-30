package javaexamples;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{  
		   int data=25/9;  
		   System.out.println(data);  
		}  
	catch(ArithmeticException e)
	{
		System.out.println("Catch block code");
		System.out.println(e);
	}  
	finally
	{
		System.out.println("finally block is always executed");
	}  
	System.out.println("rest of the code...");  
	} 

	}