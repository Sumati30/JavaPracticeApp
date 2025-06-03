package InterviewQuestions;

public class FrequencyOfAChar {

//	public static void main(String[] args) {
//		String str2="Ganga International School - Yelahanka, Bengaluru";
//		char frequencyOfLetter = 'A';
//		int count = 0;
//		char[] ch1=str2.toCharArray();
//		for(int i=0; i<ch1.length; i++){	
//			if(ch1[i] == frequencyOfLetter) {
//				count = count + 1;
//			}
//	     }
//		
//		System.out.println("Frequency of the letter " + frequencyOfLetter + " is : " + count);
//	}

	public static void frequncyOfLetter(String name) {
		int[] arr = new int[256];
		int a = 'c'; // Ascii value
		System.out.println(a);
		for(int i=0; i<name.length() ; i++) {
			arr[name.charAt(i)]++;
			
		}
		for(int i=0; i<256; i++) {
			if(arr[i] > 0) {
				System.out.println( (char)i +" - " + arr[i]);
			}
		}
	}
	public static void main(String[] args) {
		String str2="Hello Good morning";
		char frequencyOfLetter = 'L';
		int count = 0;
		frequncyOfLetter(str2);
		
//		for(int i=0; i<str2.length(); i++){	
//			if(Character.toString(str2.charAt(i)).equalsIgnoreCase(Character.toString(frequencyOfLetter))) {
//				count = count + 1;
//			}
//	     }
		
	
		//System.out.println("Frequency of the letter " + frequencyOfLetter + " is : " + count);
		
		
	}
}
