package operator;

public class operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 99;
		int b = 75;
		System.out.println("addition of both"+a+b);
//		System.out.println("Substraction of a and b is"+a-b);
		System.out.println("Multiplication is:"+a*b);
		System.out.println(a-b);
		System.out.println(a%b);
		System.out.println(a/b);
		System.out.println("Division is"+a/b);
		System.out.println("Modolo division is:"+a%b);
		
//		String s1 = "Tell ";
//		String s2 = "Me ";
//		String s3 = "Something ";
//		String s4 = "About "
//		String s5 = "Yourself";
//		
//		String s6 = s1+s2+s3+s4+s5;
//		System.out.println(s6);
//		
//		UNARY OPERATOR:
		
		int n = 25;

		System.out.println(n++);
		System.out.println(n);
		System.out.println(++n);
		System.out.println(n--);
		System.out.println(n);
		System.out.println(--n);
		
//		3. Comparision Operator
		
	 System.out.println(!true);
	 System.out.println(!false);
	 
	 int num1 = 13;
	 int num2 = 14;
	 System.out.println("Akshay is:"+num1+num2);
	 System.out.println("Akshay is:"+(num1+num2)+" years old");

     int balancefs = 27000;
	 int balancefdb = 25000;
	 System.out.println(balancefs > balancefdb);
	 System.out.println(balancefs == balancefdb);
	 System.out.println(balancefs >= balancefdb);
	 System.out.println(balancefs < balancefdb);
	 System.out.println(balancefs <= balancefdb);
	 System.out.println(balancefs != balancefdb);
	 System.out.println(balancefs);
	 balancefs = balancefdb;
	 System.out.println(balancefs);
	 
//		logical operators and,or
		 System.out.println(balancefs > balancefdb && balancefs >= balancefdb );
		 System.out.println(balancefs > balancefdb && balancefs >= balancefdb);
		 System.out.println(balancefs != balancefdb || balancefs >= balancefdb);
		 System.out.println(balancefs > balancefdb || balancefs != balancefdb );
	
	   
	} 
	

}
 