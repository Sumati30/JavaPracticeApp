package JavaFirstProject;

public class SwitchCase2 {

	public static String signal = "green";
	public static String greenSignal = "green3";

	public void currentSignal() {
		if (signal == "green") {

			if (greenSignal == "green1" || greenSignal == "green2" || greenSignal == "green3") {				
				System.out.println("Turn Left!");
				if (greenSignal == "green1" || greenSignal == "green2") {				
					System.out.println("Go Straight!");
					if (greenSignal == "green1") {						
						System.out.println("Turn Right!");
					} 
				} 
			} 

		} 
	}

	public static void main(String[] args) {

		// green1 - right left and straight
		// green2 - left and straight
		// green3 - only left
		SwitchCase2 obj = new SwitchCase2();

		switch (signal) {
		case "red":
			System.out.println("Please STOP");
			break;
		case "green":
			switch (greenSignal) {
			case "green1":
			case "green2":
			case "green3":
				obj.currentSignal();
				break;
			default:
				System.out.println("Invalid input");
				break;
			}
			break;
		case "yellow":
			System.out.println("Get Ready to STOP");
			break;
		default:
			System.out.println("Please provide valid input");
			break;
		}

	}

}
