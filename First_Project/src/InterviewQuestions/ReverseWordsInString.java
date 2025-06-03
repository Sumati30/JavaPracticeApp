package InterviewQuestions;
import java.util.Arrays;

public class ReverseWordsInString {
	
    public static String reverseWords(String s)	{
    	String[] str = s.split(" ");
    	String res = "";
    	for(int i=0; i<str.length; i++) {
    		String rs = "";
    		for(int j=str[i].length() - 1; j>=0; j--) {
    			rs = rs + str[i].charAt(j);
    		}
    		if(i >= str.length - 1 ) { // to remove last extra space
    			res = res + rs ;
    		}else {
    			res =res + rs + " ";
    		}
    		//System.out.println(res);
    	}
    	System.out.println(Arrays.toString(str));
    	return res;
    	}

	public static void main(String[] args) {
		
		reverseWords("Hello World Good morning");
		System.out.println(reverseWords("Hello World Good morning"));
		
		// TODO Auto-generated method stub
//       String str = "Hello! Good Morning";
//       String[] str2 = str.split(" "); // need str2 to find the length
//         String str2 = Arrays.toString(str.split(" "); // This will not work
//         String str3 = Arrays.toString(str.split(" ")); //  str3.length() - returns 23       
//       String str3 = Arrays.toString(str2);
//       System.out.println(str3 + str3.length());//returns [Hello!, Good, Morning]23
      
       
//       String str = "Hello! Good Morning";
//       String[] str2 = str.split(" ");
//       //System.out.println( Arrays.toString(str2)+ str2.length + str2);
//       String str4 = "";
//       for(int i=str2.length-1; i >= 0 ; i--) {
//    	   str4 = str4 + str2[i] + " ";
//       }
//       System.out.println(str4);
       }
	}


