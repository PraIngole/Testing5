package modifier;

public class AtmWithdrawl {
	 public static void main(String[] args) {
		System.out.println("ATM machine");
		AtmWithdrawl atmObj = new AtmWithdrawl();
		System.out.println(atmObj);
	    System.out.println(atmObj.verifyCardDetails(12345,233,"18/05/1992"));
	}
	 public boolean verifyCardDetails(int CardNo,int Cvv,String date)
	 {  
		 
		 System.out.println("A DB code where with CardNo all details will be fetch");
		 int dbCardNo= 12345;
		 int dbCvv= 233;
		 String dbdate= "18/05/1992";
	 
		 if(CardNo==dbCardNo && Cvv ==dbCvv && date.equals(dbdate)) {
			 System.out.println("Customer verified");
			 return true;
		 } else {
			 System.out.println("Invalid Card Details");
			 return false;
		 }
	 }
	 
}
