package javaexamples;

class Login1
{
	void verifyLogin()
	{
		System.out.println("Login code");
	}
	
}
class AddBeneficiary1 extends Login1
{
	void verifyAddBeneficiary()
	{
		System.out.println("Add beneficiary code");
	}
}
public class TransferFunds extends AddBeneficiary1
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TransferFunds obj=new TransferFunds();
		obj.verifyLogin();
		obj.verifyAddBeneficiary();
		obj.verifyTransferFunds();
		
	}
	void verifyTransferFunds()
	{
		System.out.println("Transfer funds code");
	}
}
