package JavaFirstProject;

public class NestedIf {

	public static void main(String[] args) {
		int age = 60;
		
		if( age > 0) {
			if(age > 0 && age <= 30) {
				System.out.println("Young Age");
			}else if(age > 30 && age <= 59){
				System.out.println("Middle Age");
			}else {
				System.out.println("Senior Citizen");
			}
		}else {
			System.out.println("invalid input");
		}

	}

}
