package InterviewQuestions;
import java.util.*;
import java.util.Arrays;


public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="java";//this is stored in String constant pool;
		String s2="java";//this is stored in String constant pool;
		String scase="JaVa";//this is stored in String constant pool;
		
		String s3=new String("java");//stored in heap (new object)
		String s4=new String("java");//stored in heap (new object)
		
		System.out.println(s1==s2);//true
		System.out.println(s2==s3);//false
		System.out.println(s4==s3);//false
		
		System.out.println(s1.equals(s4));//equals() is used to compare two objects and its values only
		System.out.println(s3.equals(s4));//equals() is used to compare two objects and its values only
		System.out.println(s2.equalsIgnoreCase(scase));//ignore this case
		
		String s5="  jjava programming  ";
		System.out.println(s5.length());
		System.out.println(s5.trim());//white spaces from first leading and the last ending
		System.out.println(s5.replace("java", "python"));
		System.out.println(s5.indexOf("j"));//returns index first occurrence of the char in a string
		System.out.println(s5.lastIndexOf("j"));//returns index of last occurring char 
		System.out.println(s5.isEmpty());
		System.out.println(s5.toUpperCase());
		System.out.println(s5.toLowerCase());
		System.out.println(s5.stripTrailing()+"/");
		
		String s8="a b c d g h hello bye";
		String[] s9=s8.split(" ");
		System.out.println(Arrays.toString(s9));
		
		String st1="1abc";
		System.out.println(st1.charAt(1));
		
		char[] ch1=st1.toCharArray();
		System.out.println(Arrays.toString(ch1));
		
		System.out.println(Character.isDigit(st1.charAt(0)));
		System.out.println(Character.isDigit(st1.charAt(1)));
		System.out.println(Character.isUpperCase(st1.charAt(1)));
		System.out.println(Character.isLowerCase(st1.charAt(1)));
		System.out.println(Character.isAlphabetic(st1.charAt(1)));
		System.out.println(Character.isLetter(st1.charAt(1)));
		System.out.println(Character.isLetterOrDigit(st1.charAt(0)));
		
		
		String str2="Ganga International School";
		String res=str2.substring(0,7);//0 to n-1
		System.out.println(res);
		Character.toTitleCase(0);
		System.out.println(Arrays.toString(str2.toCharArray()));
		
		String s="";
		for(char ch:str2.toCharArray()) {
			
			if(Character.isAlphabetic(ch) && Character.isUpperCase(ch)) {
				
				s=s+Character.toLowerCase(ch);
			}
			else if(Character.isAlphabetic(ch) && Character.isLowerCase(ch)){
				s=s+Character.toUpperCase(ch);
			}
			else {
				s=s+ch;//space
			}
			
		}
		
		System.out.println(s);
		
	}
	
	//q1
	//frequency of characters in a string using both hashmap and compulsary arrays
	//reverse each and every word in a string and the out put should be a string itself
	//check whether a string is palindrome
	//convert number to word example 1,2,3,answer should be what one two three
	//vice versa
	//check if a string is rotation of another - is s1 is sumati - and s2 is itamus
//	public static void main(String[] args) {
//        String s1 = "waterbottle";
//        String s2 = "erbottlewat";
//        System.out.println(isRotation(s1, s2)); // Output: true
//    }
	
	
//	public class StringRotation {
//	    public static boolean isRotation(String s1, String s2) {
//	        if (s1.length() != s2.length()) return false;
//	        String concatenated = s1 + s1;
//	        return concatenated.contains(s2);
//	    }
//
//	    public static void main(String[] args) {
//	        String s1 = "waterbottlewaterbottle";
//	        String s2 = "erbottlewat";
//	        System.out.println(isRotation(s1, s2)); // Output: true
//	    }
//	}
	//check if the string contains digit if yes remove it and arrange words properly hello my n0am3e is poorn4a 

	}


