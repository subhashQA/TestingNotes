package javaexamples;

class Throw
{  
   static void validate(int age)
   {  
   	if(age<18)  
	      throw new ArithmeticException("not valid");
       else  
 	     System.out.println("welcome to vote");  
   }  
   public static void main(String args[])
  {  
      validate(16);  
      System.out.println("rest of the code..."); 
      try {
		Thread.sleep(1000);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }  
}
