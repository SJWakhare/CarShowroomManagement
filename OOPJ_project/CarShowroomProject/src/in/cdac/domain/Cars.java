package in.cdac.domain;

//import java.util.Scanner;

public class Cars extends Showroom 
{
	//Fields
	private int chassis_no;
	private String car_model;
	private float car_price;
	private String car_tranmission;
	
	public Cars() 
	{
	}
	
	public Cars(int chassis_no, String car_model, float car_price, String car_tranmission) 
	{
		this.chassis_no = chassis_no;
		this.car_model = car_model;
		this.car_price = car_price;
		this.car_tranmission = car_tranmission;
	}
	
	public int getChassis_no() {
		return chassis_no;
	}

	public void setChassis_no(int chassis_no) {
		this.chassis_no = chassis_no;
	}

	public String getCar_model() {
		return car_model;
	}

	public void setCar_model(String car_model) {
		this.car_model = car_model;
	}

	
	public float getCar_price() {
		return car_price;
	}

	public void setCar_price(float car_price) {
		this.car_price = car_price;
	}

	public String getCar_tranmission() {
		return car_tranmission;
	}

	public void setCar_tranmission(String car_tranmission) {
		this.car_tranmission = car_tranmission;
	}

	@Override
	public boolean equals(Object obj) 
	{	if( obj != null ) 
		{
		Cars other = (Cars) obj; //Downcasting
		if( this.chassis_no == other.chassis_no )
			return true;
	}
		return false ;
	}

	@Override
	public String toString() 
	{
		return String.format("%-10d%-20s%-10.2f%-15s", this.chassis_no, this.car_model, 
									    this.car_price, this.car_tranmission);
	}

	

	
}
