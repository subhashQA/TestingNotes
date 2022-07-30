package javaexamples;
interface interface1
{
	void m1();
}
interface interface2 extends interface1
{
	void m2();
}
interface interface3 extends interface2
{
	void m3();
}
public class MultipleInterfaces implements interface1,interface2,interface3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultipleInterfaces obj=new MultipleInterfaces();
		obj.m1();
		obj.m2();
		obj.m3();
	}
	public void m1()
	{
		System.out.println("Defination of m1");
	}
	public void m2()
	{
		System.out.println("Defination of m2");
	}
	public void m3()
	{
		System.out.println("Defination of m3");
	}

}
