package JavaFirstProject;

public class LoopExample {

	public static void main(String[] args) {
		
		int noSMS = 100;
		int sentSMS = 0;
	
		for(int i = 1; i <= noSMS; i++ ) {
			sentSMS = noSMS - i;
			System.out.println(i +" SMS Sent, " + "Remaining SMS are - " + sentSMS);
		}

		// Try same with While - HW
		
		while(noSMS > 1) {
			//System.out.println(i +" SMS Sent, " + "Remaining SMS are - " + sentSMS);
			
		}
	}

}
