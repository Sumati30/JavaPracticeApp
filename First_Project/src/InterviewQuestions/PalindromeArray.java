package InterviewQuestions;

public class PalindromeArray {
	
	
	//Arrays are Palindrome or not
	public static boolean palindromeArrays() {
		 int[] a = {1, 2, 3, 4};
	     int[] b = {4, 3, 2, 1};
	     
	     if(a.length == b.length) {
	    	 for(int i=0; i<a.length; i++) {
	    		 if(a[i] != b[a.length - 1 -i]) {
	    			 return false;
	    		 }
	    	 }
	     }else {
	    	 return false;
	     }
	     return true;
	}
	
	// Array Elements are palindrome
	public static boolean palindromeArrayElements() {
		 int[] a = {1, 2, 3, 4, 3, 2};
	     
	    	 for(int i=0; i<a.length; i++) {
	    		 if(a[i] != a[a.length - 1 - i]) {
	    			 return false;
	    		 }
	    	 }
	     
	     return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(palindromeArrays());
      if(palindromeArrayElements()){
    	  System.out.println("Array elements are palindrome");
      }else {
    	  System.out.println("Not palindrome");
      }
	}

}
