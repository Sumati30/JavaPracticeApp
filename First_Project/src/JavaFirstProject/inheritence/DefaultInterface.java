package JavaFirstProject.inheritence;

public interface DefaultInterface {
/**From Java 8 onwards we can write default void methods, before it was only public abstract by default**/
	
	default void sub(){
		System.out.println("I am from another package");
	}
	
	void add(double a, double b);
}
