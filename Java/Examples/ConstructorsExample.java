package javaexamples;

public class ConstructorsExample {

	String name;
	String group;
	int rolno;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorsExample std1=new ConstructorsExample("Ashok","Mpc",1);
		std1.display();
		ConstructorsExample std2=new ConstructorsExample("Abc","Mpc",2);
		std2.display();
		ConstructorsExample std3=new ConstructorsExample();

	}
	ConstructorsExample(String name,String group,int rolno)
	{
		this.name=name;
		this.group=group;
		this.rolno=rolno;
	}
	ConstructorsExample()
	{
		System.out.println("Default constructor");
	}
	void display()
	{
			System.out.println("Name of the sutdent " +name);
			System.out.println("Student rolno " +rolno);
			System.out.println("Student group " +group);
	}


}
