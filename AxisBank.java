package week3.day1;

public class AxisBank extends BankInfo  {
	
	@Override
	public void deposit () {
		System.out.println("My deposit amount in Axis Bank");
	}
	
	public static void main(String[] args) {
		AxisBank axisBankObj = new AxisBank();
		axisBankObj.deposit();
	}
	
	/*When creating object for AxisBank and accessing the deposit() method, the override method in the AxisBank is called.
	 * the deposit() method from super class(Bank info) is not called. why?
	 * 
	 */

}
