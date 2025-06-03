package JavaFirstProject;

public class IfElseLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marks = 10;
		if(marks>0 && marks<35) {
			System.out.println("Marks = " + marks + " And the Result is Fail");
		}else if(marks>=35 && marks<60){
			System.out.println("Marks = " + marks + " And the Result is Second Class");
		}else if(marks>=60 && marks<80){
			System.out.println("Marks = " + marks + " And the Result is First Class");
		}else if(marks>=80 && marks<100){
			System.out.println("Marks = " + marks + " And the Result is Distinction");
		}else {
			System.out.println("Invalid input");
		}
	}

}
