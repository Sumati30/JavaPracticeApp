package InterviewQuestions;



public class PalidromeString {
	
	/*** Best way***/
	
	static boolean palindrome(){
    	String s= "racecar";
    	int n=s.length();
	for(int i=0; i < n/2; i++){
	    if(s.charAt(i) != s.charAt(n-1-i)){
	        return false;
	    }
	}
	
	return true;
   }
	
	/*****/
	
	public static boolean checkPalindrome(String s) {
		int n = s.length() - 1;
		
		for(int i=0; i<=n/2; i++) {
			if(s.charAt(i) != s.charAt(n-i)) {
				return false;
			}
		}
		return true;
	}
	
	// Using two pointer approach
	//Take string "aba" 
	// we have to go until half of the string while iterating, need to check 
	// 0 - 3-i-1 - when i=0 => 0 to 2
	// string => "adbbda
	// go until middle - 
	
	

	public static void main(String[] args) {
		String ps = "racecar"; //
		//checkPalindrome(ps);
		if(checkPalindrome(ps)) {
			System.out.println("Given String is a Palindrom - " + ps);
		}else {
			System.out.println("Given String is not a Palindrom - " + ps);
		}
		
		char[] c = ps.toCharArray();
		int l = c.length;
		String s = "";
		for(int i=0; i<l ; i++) {
			s = s + c[l-1-i];
		}
		
		
		if(ps.equalsIgnoreCase(s)) {
			System.out.println("Given String is a Palindrom - " + s);
		}else {
			System.out.println("Given String is not a palindrome - " + s);
		}
//		System.out.println(c);
//		System.out.println(c.length);
//		System.out.println(c[0]);
		
		
	}

}
