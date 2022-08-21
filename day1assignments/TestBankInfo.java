package week3.day1assignments;


  class BankInfo{
	  public void saving() {
		 System.out.println("saving details"); 
	  }
	  public void fixed() {
		  System.out.println("fixed details");
		  
	  }
	  public void deposit() {
		  System.out.println("deposit details");
	  }
  
  }

 class AxisBank extends BankInfo{
	 //@override
	 public void deposit() {
		 super.deposit();
	 }
 }

public class TestBankInfo {
 public static void main(String[] args) {
	AxisBank obj = new AxisBank();
	obj.saving();
	obj.fixed();
	obj.deposit();
}
}
