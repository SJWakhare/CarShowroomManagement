package in.cdac.domain;

//import java.util.Scanner;

public class Showroom implements Comparable<Showroom> //Showroom super class of Employee and Cars
{
	//Fields
	private int showroom_id;	//Unique for all showrooms
	protected String showroom_name; //protected cause need this field in its sub class in other package
	private String showroom_location;
	private String showroom_manager;
	private int number_of_employees ;
	protected int car_stock=0;
	
	public Showroom()
	{
	}
	
	public Showroom(int showroom_id, String showroom_name, String showroom_location, 
							   String showroom_manager, int number_of_employees, int car_stock) 
	{
		this.showroom_id = showroom_id;
		this.showroom_name = showroom_name;
		this.showroom_location = showroom_location;
		this.showroom_manager = showroom_manager;
		this.number_of_employees = number_of_employees;
		this.car_stock = car_stock;
	}
	
	public int getShowroom_id() {
		return showroom_id;
	}

	public void setShowroom_id(int showroom_id) {
		this.showroom_id = showroom_id;
	}

	public String getShowroom_name() {
		return showroom_name;
	}

	public void setShowroom_name(String showroom_name) {
		this.showroom_name = showroom_name;
	}

	public String getShowroom_location() {
		return showroom_location;
	}

	public void setShowroom_location(String showroom_location) {
		this.showroom_location = showroom_location;
	}

	public String getShowroom_manager() {
		return showroom_manager;
	}

	public void setShowroom_manager(String showroom_manager) {
		this.showroom_manager = showroom_manager;
	}

	public int getNumber_of_employees() {
		return number_of_employees;
	}

	public void setNumber_of_employees(int number_of_employees) {
		this.number_of_employees = number_of_employees;
	}

	public int getCar_stock() {
		return car_stock;
	}

	public void setCar_stock(int car_stock) {
		this.car_stock = car_stock;
	}

	
	@Override
	public boolean equals(Object obj) 
	{	if(obj != null )
		{	Showroom other = (Showroom) obj; //Downcasting
			if(this.showroom_id == other.showroom_id)
				return true;
		}
		return false;
	}
	
	@Override
	public int compareTo(Showroom other) 
	{
		return this.showroom_id - other.showroom_id;
	}

	@Override
	public String toString() 
	{
		//"%-10d%-30s%-30s%-30s%-15d%-15d"
		return String.format("%-10d%-30s%-30s%-20s%-10d%-10d",this.showroom_id, this.showroom_name, 
											this.showroom_location, this.showroom_manager, this.number_of_employees,
											this.car_stock);
	}
}
   
	
	

