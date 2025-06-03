package JavaFirstProject;

public class ConsChaining {

	ConsChaining(){
		this("Hello", 'H');
		System.out.println("Default Constructor");
	}
	
    ConsChaining(int a){
		//this();
		System.out.println("Constructor with integer Parameter");
	}
    
    ConsChaining(double b){
		this(5);
		System.out.println("Constructor with Double Parameter");
	}
    
    ConsChaining(String s, char c){
		this(7.5);
		
		System.out.println("Constructor with two Parameter");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ConsChaining c = new ConsChaining();
	}

}
