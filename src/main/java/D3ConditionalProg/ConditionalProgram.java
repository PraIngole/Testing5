package D3ConditionalProg;

public class ConditionalProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balanceAmount = 300000;
		int withdrawlAmount = 200000;
//		YOU CAN WRITE ONLY ONE IF STATEMENT
//		if
//	        (balanceAmount > withdrawlAmount) {
//		
//			balanceAmount = balanceAmount - withdrawlAmount;
//			System.out.println("BALANCE AFTER DEDUCTION IS:"+balanceAmount);
//		}
////			YOU CAN WRITE MULTIPLE IF STATEMENT
//			if(balanceAmount < withdrawlAmount) {
//				
//			System.out.println("INSUFFICIENT BALANCE!!!!!");
//		     
//			}
//			if(balanceAmount == withdrawlAmount) {
//			
//			balanceAmount = 0;	
//			System.out.println("Balance After Deduction"+balanceAmount);
//			
//			}
//			
////			IF WITH AND ELSE
//			if(balanceAmount >= withdrawlAmount) {
//			balanceAmount = balanceAmount - withdrawlAmount;
//			System.out.println("Balance After Deduction"+balanceAmount);
//			}
//			else {
//				System.out.println("Insufficient Balance");
//			     }
//		
////			IF ELSE IF
//			
//			if(balanceAmount > withdrawlAmount) {
//				balanceAmount = balanceAmount - withdrawlAmount;
//				System.out.println("Balance after deduction"+balanceAmount);
//				
//			}
//			else if (balanceAmount < withdrawlAmount) {
//				
//				System.out.println("INSUFFICIENT BALANCE");
//			}
//			else if(balanceAmount == withdrawlAmount) {
//				balanceAmount = 0;
//				System.out.println("Balance after deduction:"+balanceAmount);
//			}
//			NESTED IF ELSE
			if(balanceAmount >= withdrawlAmount) {
				if(balanceAmount == withdrawlAmount) {
					balanceAmount = 0;
				}else {
					balanceAmount = balanceAmount - withdrawlAmount;
				}
				System.out.println("Balance after deduction:"+balanceAmount);
			} else {
			    System.out.println("Insufficient Balance");
			}
//			/	SEQUENCING
			if
		   (balanceAmount > withdrawlAmount) {

			balanceAmount = balanceAmount - withdrawlAmount;
			System.out.println("BALANCE AFTER DEDUCTION IS:"+balanceAmount);
		}
//			YOU CAN WRITE MULTIPLE IF STATEMENT
			if(balanceAmount < withdrawlAmount) {
				
			System.out.println("INSUFFICIENT BALANCE!!!!!");
		    
			}
			if(balanceAmount == withdrawlAmount) {
			
			balanceAmount = 0;	
			System.out.println("Balance After Deduction"+balanceAmount);
			
			}
	}
	
	

	

}
