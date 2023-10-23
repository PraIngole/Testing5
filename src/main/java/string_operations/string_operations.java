package string_operations;

public class string_operations {
	public static void main(String[] args) {
		String s = "Joe Biden is the president of United States Of America in the North";
		String s0 = "Joe Biden is the president of United states";
		String s1 = "Joe Biden is the president of United states";
		String s2 = "Joe Biden is the President of United states";
		
//		Common Operations
		System.out.println("lenght of String ->"+s.length());
		System.out.println("Index of d-->"+ s.indexOf('d'));
		System.out.println("Index of d after 23 position-->"+s.indexOf('d',23));
		System.out.println("Second Index of d -->"+ s.indexOf('d',s.indexOf('d')+1));
		
	
		System.out.println("Index of the -->"+ s.indexOf("the"));
		System.out.println("Index of the after 22th position--> " + s.indexOf("the",22));
		System.out.println("Second Index of the --> "+ s.indexOf("the",s.indexOf("the")+1));
		
		System.out.println("find the char at particular index-->"+s.charAt(6));
//		comparision
		System.out.println(s0.equals(s2));
		System.out.println(s0.equals(s1));
		System.out.println(s0.equalsIgnoreCase(s2));
		
//		SUBSTRING
        String s3 ="            Joe Biden is the president of United    States Of America in the North          ";
        System.out.println(s3.substring(10));
        System.out.println(s3.substring(17,30));
        System.out.println(s3.substring(s3.indexOf("is"),s.indexOf("States")));
        
//        TRIM
        
        String s4 = "              Joe    Biden is the president of United States         ";
        System.out.println(s4);
        System.out.println(s4.trim());
        
//        REPLACE
        String s5 = "Joe Biden is the president of America";
        System.out.println(s5.replace(" ", "_"));
        System.out.println(s5.replace("the", "not"));
        
//        SPLIT
        String s6 = "Joe_Biden_is the_ president_ of_ the_ United_ States_ Of_ America_ in_ the_ North";
        String[] str = s6.split("of");
        for(String si : str){
        	System.out.println(si);
        }
	 }

}
