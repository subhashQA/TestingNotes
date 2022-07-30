package javaexamples;

class Animals
{
	void animal()
	{
		System.out.println("Animals can walk and run");
	}
}
public class MethodOverRiding extends Animals{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverRiding obj=new MethodOverRiding();
		obj.animal();

	}
	
	void animal()
	{
		super.animal();
		System.out.println("Dog can walk and shout");
	}

}
