package JavaFirstProject;

public class Arrays {

	public static void main(String[] args) {
		
		int[] x = {10, 25, 33, 41, 8, 7, 31};
		
		int sum = 0;
		double avg = 0;
		int l = x.length;
		 for(int i=0; i<l; i++) {
			 sum = sum + x[i];
		 }
		 System.out.println("Sum of X is " + sum);
		 //Type conversion
		 avg = (double)sum/(double)l;
		 System.out.println("Average of X is " + avg);
		 
		 //For each loop -- extended for loop
		 int sum2 = 0;
		 for(int i : x) {
			 sum2 = sum2 + i;
		 }
		 
		 System.out.println("Sum of X using FOREACH " + sum2);
		 
		 //Find min and max
		 
		 int min = x[0];
		 int max = x[0];
		 
		 for(int i : x) {
			 if(i < min) {
				 min = i;
			 }
		 }
		 System.out.println("Minimum number in the Array X is " + min);
		 
		 for(int i : x) {
			 if(i > max) {
				 max = i;
			 }
		 }
		 System.out.println("Maximum number in the Array X is " + max);
		 
	}

}
