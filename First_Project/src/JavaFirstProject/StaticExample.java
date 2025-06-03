package JavaFirstProject;

public class StaticExample {
	
	static int a = 0;
//	static {
//		a++;
//	}
	
	int b = 0;
//	{
//		b++;
//	}
	
	StaticExample(){
		a++;
		b++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //System.out.println(a);
       
       StaticExample s1 = new StaticExample();
       System.out.println("A value "  + a);
       System.out.println("B value " +s1.b);
       StaticExample s2 = new StaticExample();
       System.out.println("A value "  +a);
       System.out.println("B value "+s2.b);
       StaticExample s3 = new StaticExample();
       System.out.println("A value "  +a);
       System.out.println("B value "+s3.b);
	}

}
