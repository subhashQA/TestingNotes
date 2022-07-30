package javaexamples;

abstract class Abc
{
	abstract void m1();
	abstract void m2();
	void m3()
	{
		System.out.println("m3 defination");
	}
}
public class AbstractExample extends Abc{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Abc obj=new Abc(); We cant create object to abstract class

	}
	void m1()
	{
		System.out.println("Defination of m1");
	}
	void m2()
	{
		System.out.println("Defination of m1");
	}
}
