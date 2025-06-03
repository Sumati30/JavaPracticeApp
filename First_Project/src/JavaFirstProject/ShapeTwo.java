package JavaFirstProject;

public class ShapeTwo extends ShapeOne{

	public void rectangle() {
		System.out.println("I am a shape with Four sides");
	}

	public void pentagon() {
		System.out.println("I am a shape with - Five sides");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ShapeTwo obj = new ShapeTwo();
        obj.pentagon();
        obj.triangle();
        obj.rectangle();
	}

}
