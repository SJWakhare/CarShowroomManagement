package in.cdac.main;

import in.cdac.domain.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;

import in.cdac.test.ListTest;
import in.cdac.utility.ShowroomIdComparator;

import java.util.Scanner;

// Car showroom management system:
//Triangle---> Product, seller, showroom

public class Program {
	private static Scanner sc = new Scanner(System.in);
	private static int count = 0;
	private static int index=0;

	private static Showroom[] getShowroom() {
		Showroom[] arr1 = new Showroom[5];
		arr1[0] = new Showroom(140, "Mahindra motors", "Pune", "Sameer",05,70);
		arr1[1] = new Showroom(120, "NEXA motors", "Mumbai", "Kaustubh",10,50);
		arr1[2] = new Showroom(103, "Sireesh motors", "Bangalore", "Sakshi",15,60);
		arr1[3] = new Showroom(109, "KIA motors", "Hyderabad", "Madhav",07,90);
		arr1[4] = new Showroom(102, "Toyota motors", "Delhi", "Megha",13,40);

		return arr1;
	}

	public static Employee[] getEmployee()
	{	try {
			Employee[] arr2 = new Employee[5];

			arr2[count] = new Employee();
			sc.nextLine();
			System.out.println("Enter name of employee");
			arr2[count].setEmp_name(sc.nextLine());

			System.out.println("Enter employee ID");
			arr2[count].setEmp_id(sc.nextInt());

			System.out.println("Enter age of employee");
			arr2[count].setEmp_age(sc.nextInt());
			sc.nextLine();

			System.out.println("Enter employee's department");
			arr2[count].setEmp_department(sc.nextLine());

			count++;
			return arr2;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static Cars[] getCars() 
	{	try {
				Cars[] arr3 = new Cars[3];
				
				arr3[index] = new Cars();
				sc.nextLine();

				System.out.println("Enter chassis No");
				arr3[index].setChassis_no(sc.nextInt());
				sc.nextLine();

				System.out.println("Enter car model ");
				arr3[index].setCar_model(sc.nextLine());

				System.out.println("Enter car price ");
				arr3[index].setCar_price(sc.nextFloat());
				sc.nextLine();

				System.out.println("Enter car transmission");
				arr3[index].setCar_tranmission(sc.nextLine());

				index++;
				return arr3;
			} catch (Exception e) {
				e.printStackTrace();
			}
		return null;
	}

	// for showooms
	private static void printShowRoom(Showroom[] arr1) {
		for (int i = 0; i < arr1.length; ++i) {
			if (arr1[i] != null)
				System.out.println(arr1[i]);
		}
	}

	private static void acceptRecord(int[] showroomId) {
		if (showroomId != null) {
			System.out.println("Enter showroom ID: ");
			showroomId[0] = sc.nextInt();
		}
	}

	private static void printRecord(Showroom showroom) {
		if (showroom != null)
			System.out.println(showroom.toString());
		else
			System.out.println("Showroom not found");
	}

	private static void printRecord(boolean removedStatus) {
		if (removedStatus)
			System.out.println("Showroom removed");
		else
			System.out.println("Showroom not found");
	}

	// for employees
	private static void printEmployees(Employee[] arr2) {
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] != null)
				System.out.println(arr2[i]);
		}
	}

	private static void acceptEmployee(int[] empId) {
		if (empId != null) {
			System.out.println("Enter employee ID: ");
			empId[0] = sc.nextInt();
		}
	}

	private static void printEmployee(Employee employee) {
		if (employee != null)
			System.out.println(employee.toString());
		else
			System.out.println("Employee not found");
	}

	private static void printEmployee(boolean removedStatus) {
		if (removedStatus)
			System.out.println("Employee removed");
		else
			System.out.println("Employee not found");
	}

	// for cars
	private static void printCars(Cars[] arr3) {
		if(arr3 != null) {
		for (int i = 0; i < arr3.length; ++i) {
			if (arr3[i] != null)
				System.out.println(arr3[i]);
		}
	}
	}

	private static void acceptCar(int[] chassisNo) {
		if (chassisNo != null) {
			System.out.println("Enter chassis number of car : ");
			chassisNo[0] = sc.nextInt();
		}
	}

	private static void printCar(Cars cars) {
		if (cars != null)
			System.out.println(cars.toString());
		else
			System.out.println("Car not found");
	}

	private static void printCar(boolean removedStatus) {
		if (removedStatus)
			System.out.println("Car removed");
		else
			System.out.println("Car not found");
	}

	public enum mainMenu {
		EXIT, ADD_SHOWROOMS, ADD_EMPLOYEES, ADD_CARS, FIND_SHOWROOMS, FIND_EMPLOYEES, 
		FIND_CARS, REMOVE_SHOWROOMS, REMOVE_EMPLOYEES, REMOVE_CARS, 
		PRINT_SHOWROOMS_SORTED, PRINT_ALLDATA;
	}

	static mainMenu menuList() throws InputMismatchException {
		System.out.println();
		System.out.println("********* WELCOME TO CAR SHOWROOM MANAGEMENT SYSTEM *********");
		System.out.println();
		System.out.println("0. EXIT ");
		System.out.println("1. ADD SHOWROOMS ");
		System.out.println("2. ADD EMPLOYEES ");
		System.out.println("3. ADD CARS ");
		System.out.println("4. FIND SHOWROOMS ");
		System.out.println("5. FIND EMPLOYEES ");
		System.out.println("6. FIND CARS ");
		System.out.println("7. REMOVE SHOWROOMS ");
		System.out.println("8. REMOVE EMPLOYEES ");
		System.out.println("9. REMOVE CARS ");
		System.out.println("10. PRINT SHOWROOMS [SORTED] ");
		System.out.println("11. PRINT ALL DATA ");

		System.out.println("********* ENTER YOUR CHOICE *********");
		System.out.println();
		return mainMenu.values()[sc.nextInt()];
	}

	public static void main(String[] args) {
		mainMenu choice;
		int[] showroomId = new int[1];
		int[] empId = new int[1];
		int[] chassisNo = new int[1];
		ListTest test = new ListTest(); // Instantiation
		test.setShowroomList(new ArrayList<>());
		test.setEmployeeList(new ArrayList<>());
		test.setCarsList(new ArrayList<>());

		while (true) {
			try {
				choice = Program.menuList();
				if (choice == mainMenu.EXIT)
					break;
				switch (choice) {
				case ADD_SHOWROOMS:
					Showroom[] arr1 = Program.getShowroom();
					test.addShowrooms(arr1);
					Program.printShowRoom(arr1);
					break;

				case ADD_EMPLOYEES:
					Employee[] arr2 = Program.getEmployee();
					test.addEmployees(arr2);
					Program.printEmployees(arr2);
					break;

				case ADD_CARS:
					
					Cars[] arr3 = Program.getCars();
					test.addCars(arr3);
					Program.printCars(arr3);
					break;

				case FIND_SHOWROOMS:
					Program.acceptRecord(showroomId);
					Showroom showroom = test.findShowroom(showroomId[0]);
					Program.printRecord(showroom);
					break;

				case FIND_EMPLOYEES:
					Program.acceptEmployee(empId);
					Employee employee = test.findEmployee(empId[0]);
					Program.printEmployee(employee);
					break;

				case FIND_CARS:
					Program.acceptCar(chassisNo);
					Cars cars = test.findCar(chassisNo[0]);
					Program.printCar(cars);
					break;

				case REMOVE_SHOWROOMS:
					Program.acceptRecord(showroomId);
					boolean removedStatus = test.removeShowroom(showroomId[0]);
					Program.printRecord(removedStatus);
					break;

				case REMOVE_EMPLOYEES:
					Program.acceptEmployee(empId);
					boolean removedEmployee = test.removeEmployee(empId[0]);
					Program.printEmployee(removedEmployee);
					break;

				case REMOVE_CARS:
					Program.acceptCar(chassisNo);
					boolean removeCars = test.removeCar(chassisNo[0]);
					Program.printCar(removeCars);
					break;

				case PRINT_SHOWROOMS_SORTED:
					Comparator<Showroom> comparator = null;
					comparator = new ShowroomIdComparator();
					test.printShowrooms(comparator);
					break;
				case PRINT_ALLDATA:
					test.printAll();
					break;
				default:
					break;
				}
			} catch (Exception e) {
				sc.nextLine();
				System.err.println("Invalid Input");

			}
		}
	}

}