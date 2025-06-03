package JavaFirstProject;

import JavaFirstProject.inheritence.DefaultInterface;

public class DefaultClass implements DefaultInterface {

	public static void main(String[] args) {
		DefaultClass obj = new DefaultClass();
		// this is called from another package;
        obj.sub();
        obj.add(5.5, 7.5);
	}

	@Override
	public void add(double a , double b) {
		// TODO Auto-generated method stub
		System.out.println("addition of a and b is " + (a + b)); 
	}

}
