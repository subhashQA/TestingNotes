package javaexamples;

public class Student {

	String name;
	int rolno;
	String group;
	static String collegeName;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main blcok");
		Student std1=new Student();
		std1.init("Ashok", 1, "Mpc");
		Student.assignCollegeName();
		std1.display();
		Student std2=new Student();
		std2.init("Anil", 2, "Bpc");
		std2.display();
	}
	static void assignCollegeName()
	{
		collegeName="Abc";
	}
	void init(String name,int rolno,String group)
	{
		this.name=name;
		this.rolno=rolno;
		this.group=group;
	}
	void display()
	{
			System.out.println("Name of the sutdent " +name);
			System.out.println("Student rolno " +rolno);
			System.out.println("Student group " +group);
			System.out.println("College Name " +collegeName);
	}
	static
	{
		System.out.println("Static block executed");
	}
}
