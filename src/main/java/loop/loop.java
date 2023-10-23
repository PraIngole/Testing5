package loop;

public class loop {
	public static void main(String[]args) {
		String str = "Poonam";
		String[] strArray = new String[5];
		strArray[0] = "Ujwal";
		strArray[1] = "Poonam";
		strArray[2] = "Mona";
		strArray[3] = "Dipak";
		strArray[4] = "Prakash";
		System.out.println(strArray[3]);
//	PHYSICAL ADDRESS AS BELOW
		System.out.println(strArray.toString());
//	above as a function
//		
		Array
		for(int i=0;i<5 ;i++) {
			System.out.println("TRADITIONAL FOR LOOP"+strArray[i]);
		}
		
		FOR EACH LOOP
		for(String tempVar : strArray)
		System.out.println(tempVar);
	}

	
		
		
	}
	

		
 
}
