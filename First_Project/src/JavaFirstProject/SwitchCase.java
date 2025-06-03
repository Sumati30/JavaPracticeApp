package JavaFirstProject;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       char grade = 'A';
       
       switch(grade){
       case 'A' : System.out.println("First Class");
       break;
       case 'B' : System.out.println("Second Class");
       break;
       case 'C' : System.out.println("Pass Class");
       break;
       case 'D' : System.out.println("Failed");
       break;
       default : System.out.println("Please provide proper grade!");
       break;
       }
       
      
      String signal = "green1";
      String greenSignal = "green1";
       
//       switch(signal){
//       case "red" : 
//    	   System.out.println("Please STOP");
//           break;
//       case "green": 
//    	   switch(greenSignal) {
//    	   case "green1" :
//    		   System.out.println("All 3 Turns - Right, Left and Straight!");
//               break;
//    	   case "green2" :
//    		   System.out.println("Right and Left Turns Only!");
//               break;
//    	   case "green3" :
//    		   System.out.println("Right Turn Only!");
//               break;
//    	   default : 
//        	   System.out.println("Invalid input");
//               break;
//    	   }
//    	   System.out.println("Right Turn Only!");
//           break;
//       case "yellow" : 
//    	   System.out.println("Get Ready to STOP");
//           break;
//       default : 
//    	   System.out.println("Please provide valid input");
//           break;
//       }
       
       switch(signal){
       case "red" : 
    	   System.out.println("Please STOP");
           break;
       case "green3": 
    	   System.out.println("Take Right!");
       case "green2": 
    	   System.out.println("Take Left!");
       case "green1": 
    	   System.out.println("Go Straight!");
           break;
       case "yellow" : 
    	   System.out.println("Get Ready to STOP");
           break;
       default : 
    	   System.out.println("Please provide valid input");
           break;
       }
       
      
	}

	
}
