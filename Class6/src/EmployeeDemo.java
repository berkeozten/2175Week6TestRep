
public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Employee [] emps = new Employee[4];
		emps[0] = new Employee(1001,5000.0);
		*/
		Employee [] emps = {new Employee(1002,1007.0),new Employee(),new Employee(),new Employee()};
		
		for(Employee emp:emps) {
			System.out.println(emp);
			
			// This is a change :)
		}
	}

}
