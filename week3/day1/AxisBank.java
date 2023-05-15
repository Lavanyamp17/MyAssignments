package week3.day1;

public class AxisBank extends BankInfo {

	public void deposit()
	{
		System.out.println("Override: Deposit --> AxisBank");
	}
	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.saving();
		ab.fixed();
		ab.deposit();
		
		BankInfo bi = new BankInfo();
		bi.deposit();
				

	}

}
