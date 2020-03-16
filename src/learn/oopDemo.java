package oopsPractice;

class Employee
{
	String firstName;
	String secondName;
	int salary;
	public Employee(String firstName,String secondName,int salary) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.salary = salary;
	}
	public void showEmployee() {
		System.out.println(firstName + " "+secondName+" "+salary);
	}
}

public class oopDemo {
	public static void main(String[] args) {
		Employee obj = new Employee("Myke","Myke",10000 );
		obj.showEmployee();
	}
}
