package JavaFirstProject;

public class EncapsuleOne {
	
	private static String name = "Shyam";
	private int age = 10;
	private double salary;
	public String domain = "Full-stack";
	public String shiftTime = "Morning";
	
	
	public static String getName() {
		return name;
	}

	public static void setName(String n) {
		name = n;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getShiftTime() {
		return shiftTime;
	}

	public void setShiftTime(String shiftTime) {
		this.shiftTime = shiftTime;
	}

	private void empDetails(double salary) {
		System.out.println("Employee salary is " + salary);
	}
	
	private void calculateSalary(double salary) {
		System.out.println("Employee salary before tax -  " + salary);
		
		this.salary = salary - (salary * 0.08) ;
		
		System.out.println("Employee salary after Tax deduction - " + this.salary);
	}
	private static void empName(String name) {
		System.out.println("Employee name is " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Static field , method can be called without creating an object of the class
         setName("Sumati");
         empName(getName());
         //System.out.println();
         
         EncapsuleOne en = new EncapsuleOne();
         
         en.setAge(30);
         en.setDomain("java");
         en.setSalary(2000);
         
         en.empDetails(en.getSalary());
         
         en.calculateSalary(2000);
         
	}

}
