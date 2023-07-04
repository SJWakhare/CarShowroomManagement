package in.cdac.domain;

//import java.util.Scanner;

public class Employee extends Showroom //implements Comparable<Employee>
{
	//Fields
	private String emp_name;
	private int emp_id;
    private int emp_age;
    private String emp_department;
    
    
    public Employee()
    {
	}
  
	public Employee(String emp_name, int emp_id, int emp_age, String emp_department)
	{
		this.emp_name = emp_name;
		this.emp_id = emp_id;
		this.emp_age = emp_age;
		this.emp_department = emp_department;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public int getEmp_age() {
		return emp_age;
	}

	public void setEmp_age(int emp_age) {
		this.emp_age = emp_age;
	}

	public String getEmp_department() {
		return emp_department;
	}

	public void setEmp_department(String emp_department) {
		this.emp_department = emp_department;
	}
	
	@Override
	public boolean equals(Object obj) {
		if( obj != null ) {
			Employee other = (Employee) obj; //Downcasting
			if( this.emp_id == other.emp_id )
				return true;
		}
		return false;
	}

	@Override
	public String toString() 
	{
		return String.format("%-20s%-10d%-10d%-15s", 
										this.emp_name, this.emp_id, this.emp_age, this.emp_department);
	}

}
