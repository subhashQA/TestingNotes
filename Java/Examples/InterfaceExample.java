package javaexamples;

interface interace1
{
	void m1();
	void m2();
	int x=90;
}
public class InterfaceExample implements interace1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExample obj=new InterfaceExample();
		obj.m1();
		obj.m2();
		obj.m3();
		System.out.println("Value of x" +x);
	}
	public void m1()
	{
		System.out.println("Defination of m1");
	}
	public void m2()
	{
		System.out.println("Defination of m2");
	}
	void m3()
	{
		System.out.println("Defination of m3");
	}
}
