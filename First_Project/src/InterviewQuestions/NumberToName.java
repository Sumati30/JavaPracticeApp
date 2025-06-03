package InterviewQuestions;

import java.util.Scanner;

public class NumberToName {
	
	public static void numToName() {
		int num = 16;//using %
		//convert num to string
		String s = Integer.toString(num);
		
		//By appending string
		String s1 = num + "";
		//System.out.println(s + s1);
		String numName = "";
		
		String[] strArray = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
	    String res = "";
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			int j = ch - '0';
			//System.out.println(j);
			
			res += strArray[j];
			
		} 
			
		System.out.println(res);
			
			
			
			
//			switch(ch){
//	    	   case '0': 
//	    		   numName += "Zero ";
//	    		   break;
//	    	   case '1': 
//	    		   numName += "One ";
//	    		   break; 
//	    	   case '2': 
//	    		   numName += "Two";
//	    		   break;
//	    	   case '3': 
//	    		   numName += "Three";
//	    		   break; 
//	    	   case '4': 
//	    		   numName += "Four";
//	    		   break;
//	    	   case '5': 
//	    		   numName += "Five";
//	    		   break; 
//	    	   case '6': 
//	    		   numName += "Six";
//	    		   break;
//	    	   case '7': 
//	    		   numName += "Seven";
//	    		   break; 
//	    	   case '8': 
//	    		   numName += "Eight";
//	    		   break;
//	    	   case '9': 
//	    		   numName += "Nine";
//	    		   break; 
//	    	   default:
//	    		   numName += "Invalid Input";
//	    		   break;
//	       }
//		}
		
		System.out.println(numName);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numToName();
       Scanner sc = new Scanner(System.in);
       System.out.println("Provide number : ");
       int num = sc.nextInt();
       
       String numName;
       
       switch(num){
    	   case 0: 
    		   numName = "Zero";
    		   break;
    	   case 1: 
    		   numName = "One";
    		   break; 
    	   case 2: 
    		   numName = "Two";
    		   break;
    	   case 3: 
    		   numName = "Three";
    		   break; 
    	   case 4: 
    		   numName = "Four";
    		   break;
    	   case 5: 
    		   numName = "Five";
    		   break; 
    	   case 6: 
    		   numName = "Six";
    		   break;
    	   case 7: 
    		   numName = "Seven";
    		   break; 
    	   case 8: 
    		   numName = "Eight";
    		   break;
    	   case 9: 
    		   numName = "Nine";
    		   break; 
    	   default:
    		   numName = "Invalid Input";
    		   break;
       }
       
       System.out.println("Number name is : " + numName);

	}

}
