package JavaFirstProject;

public class Emp {
	
	int empId;
	String empName;
	String empRole;
	double salary;
	
	//Constructors - as soon as objects of this class is created values will be injected
	
	Emp(int id, String name, String role, double sal){
		this.empId = id;
		this.empName = name;
		this.empRole = role;
		this.salary = sal;
		System.out.println("Employee Id : " + this.empId);
		System.out.println("Employee Name : " +  this.empName );
		System.out.println("Employee Role : " + this.empRole );
		System.out.println("Employee Salary : " + this.salary );

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Emp emp = new Emp(5, "Sumati", "Developer", 5500.00 );
       //Emp e2 = new Emp();
	}

}
