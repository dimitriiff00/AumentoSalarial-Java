package entities;

public class Employee {
	public String name;
	public Double grossSalary;
	public Double tax;
	
	
	public Double netSalary() {
		return grossSalary - tax;
	}
	public double increaseSalary(double salario, double percentage) {
		percentage = salario * percentage;
		return salario = salario + percentage;
		
	}
	public String toString() {
		return name; 
	}

}