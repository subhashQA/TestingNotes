package javaexamples;

class Login {


	void verifyLogin()
	{
		System.out.println("Login code");
	}

}
class AddBeneficiary extends Login
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddBeneficiary obj=new AddBeneficiary();
		obj.verifyLogin();
		obj.verifyAddBeneficiary();

	}
	
	void verifyAddBeneficiary()
	{
		System.out.println("Add beneficiary code");
	}
}
