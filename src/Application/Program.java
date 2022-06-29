package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Enter the employee's data: ");
		
		System.out.print("Enter the employee's name: ");
		employee.name = sc.nextLine();
		
		System.out.print("Enter the employee's gross salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("Enter the tax: ");
		employee.tax = sc.nextDouble();
		
		
		System.out.println();
		System.out.print(employee.name + ", " + employee.netSalary());
		double newSalary = employee.netSalary();
		
		System.out.println();
		System.out.print("Wich the percentage to increase salary: ");
		double increase = sc.nextDouble();
		newSalary = employee.increaseSalary(newSalary, increase);
		
		System.out.println();
		System.out.print("Updat data: " + employee + ", " + newSalary );
		
		
		
	}

}
