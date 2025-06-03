package JavaFirstProject;

import java.util.Scanner;
import java.util.Arrays;

public class CheckIntInString {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//	       System.out.println("Provide name : ");
//	       String name = sc.next();
	      String name = "Su56mat8i K7h4ed";
	       char[] ch = name.toCharArray();
	       
	       //System.out.println(name + name.length());
	       String newName = "";
	      for(char c:name.toCharArray()) {

	    	  if(Character.isLetter(c)){
	    		  newName = newName + c;
	    	  }else if(Character.isDigit(c)){
	    		  newName = newName + "";
	    	  }else {
	    		  newName = newName + c;
	    	  }
	      }
	      
	      System.out.println("User new name is : " + newName);
	}

}
