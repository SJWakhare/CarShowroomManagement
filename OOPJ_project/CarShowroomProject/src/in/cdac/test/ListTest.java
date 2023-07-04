package in.cdac.test;

import in.cdac.domain.*;
import java.util.Comparator;
import java.util.List;

public class ListTest
{
	private List<Showroom> showroomList;
	private List<Employee> employeeList;
	private List<Cars> carsList;
	
	public void setShowroomList(List<Showroom> showroomList)
	{
		this.showroomList = showroomList;
	}
	
	public void setEmployeeList(List<Employee> employeeList)
	{
		this.employeeList = employeeList;
	}
	
	public void setCarsList(List<Cars> carsList) 
	{
		this.carsList = carsList;
	}

	public void addShowrooms(Showroom[] arr1)
	{
		if(this.showroomList!= null)
		{	if(arr1!=null) 
			{	for(Showroom showroom : arr1)
				this.showroomList.add(showroom);
			}
		}
	}
	
	public void addEmployees(Employee[] arr2)
	{
		if(this.employeeList!= null)
		{	if(arr2!=null) 
			{	for(Employee employee : arr2)
				this.employeeList.add(employee);
			}
		}
	}
	
	public void addCars(Cars[] arr3)
	{
		if(this.carsList!= null)
		{	if(arr3!=null) 
			{	for(Cars cars : arr3)
				this.carsList.add(cars);
			}
		}
	}
	
	public Showroom findShowroom (int showroomId)
	{	if(this.showroomList != null)
		{	Showroom key = new Showroom();
			key.setShowroom_id(showroomId);
			if( this.showroomList.contains(key) )
				{	int index = this.showroomList.indexOf(key);
					Showroom value = this.showroomList.get(index);
					return value;
				}
		} return null;
	}
	
	public Employee findEmployee (int empId)
	{	if(this.employeeList != null)
		{	Employee key = new Employee();
			key.setEmp_id(empId);
			if( this.employeeList.contains(key) )
				{	int index = this.employeeList.indexOf(key);
					Employee value = this.employeeList.get(index);
					return value;
				}
		} return null;
	}
	
	public Cars findCar (int chassisNo)
	{	if(this.carsList != null)
		{	Cars key = new Cars();
			key.setChassis_no(chassisNo);
			if( this.carsList.contains(key) )
				{	int index = this.carsList.indexOf(key);
					Cars value = this.carsList.get(index);
					return value;
				}
		} return null;
	}
	
	
	public boolean removeShowroom(int showroomId)
	{	if(this.showroomList != null)
		{	Showroom key = new Showroom();
			key.setShowroom_id(showroomId);
			if( this.showroomList.contains(key) )
				{	this.showroomList.remove(key);
					return true;
				}
		}	return false;
	}
	
	public boolean removeEmployee(int empId)
	{	if(this.employeeList != null)
		{	Employee key = new Employee();
			key.setEmp_id(empId);
			if( this.employeeList.contains(key) )
				{	this.employeeList.remove(key);
					return true;
				}
		}	return false;
	}
	
	public boolean removeCar(int chassisNo)
	{	if(this.carsList != null)
		{	Cars key = new Cars();
			key.setChassis_no(chassisNo);
			if( this.carsList.contains(key) )
				{	this.carsList.remove(key);
					return true;
				}
		}	return false;
	}
	
	public void printShowrooms(Comparator<Showroom> comparator)
	{	if(this.showroomList !=null )
		{	this.showroomList.sort(comparator);
			this.showroomList.forEach(System.out::println);
		}
	}
	
	public void printAll() 
	{	
		System.out.println();
		System.out.println("Showrooms are : ");
		System.out.println();
		for( Showroom showroom     : this.showroomList)
		{	if(showroom != null)
				System.out.println(showroom);
		}
		
		System.out.println();
		System.out.println("Employees are : ");
		System.out.println();
		for( Employee emp     : this. employeeList)
		{	if(emp != null)
				System.out.println(emp);
		}
		
		System.out.println();
		System.out.println("Cars are : ");
		System.out.println();
		for( Cars car      : this.carsList)
		{	if(car != null)
				System.out.println(car);
		}
	}
}