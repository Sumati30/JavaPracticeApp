package InterviewQuestions;

public class ReverseString {

	public static void main(String[] args) {
	
		String s = "Sumati";
		
		String rs = "";
		
		for(int i=s.length()-1 ; i>=0; i--) {	
			rs = rs + s.charAt(i);
		}

		System.out.println(rs);
	}

}
