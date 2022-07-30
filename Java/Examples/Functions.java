package pack1;

public class Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functions obj = new Functions();// creation of object
		int sum=obj.add(90,70);//function calling
		System.out.println("Sum of two numbers is :" +sum);
		sum=obj.add(60,50);
		System.out.println("Sum of two numbers is :" +sum);
		sum=obj.add(80, 70);
		System.out.println("Sum of two numbers is :" +sum);
		obj.sub(60,90);
		obj.sub(70,60);

	}
	int add(int x,int y)
	{
		
		int sum=x+y;
		return(sum);
	}
	void sub(int x,int y)
	{
		int z=x-y;
		System.out.println("Substraction of two numbers is" +z);
	}
}
