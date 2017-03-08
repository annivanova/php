/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * @author Antoaneta Ivanova , I semester , NBU, Master Program Software Technlogies in Internet 
 */
package person;

public class Employee extends Person {  // I create class Employee ,it holds information about overtime hours of the employee and their calculation and displaying that information, ит extends Person and as so it inherits its methods 
 static double daySalary;
 static int salaryOvertime;
 static int wrkHours;
  

	public Employee(String name, int age, boolean isMan,int wrkHours ) { //the class constructor
		super(name, age, isMan); //the constructur of the super class
	}
	public double calculateOvertime(double daySalary, int age) { //a method that calculates the salary of an Employee when he works overtime hours and checks if the Employee is not under 18 and working over hours
		int wrkHours = 8;                                     
		double salaryph = daySalary / wrkHours;
		System.out.println(salaryph);
		double salaryOvertime = salaryph * 1.5;
		System.out.println(salaryOvertime);
		if (age < 18) {
			System.out.println("You are not allowed to work overtime, you are under 18");
		} else {
			System.out.println(salaryOvertime);

		}
		return salaryOvertime;
	}

	    public void showEmployee(double salaryOvertime, String name, int age, //the method displays information about the Employee
			boolean isMan) {
		System.out.println("your name is: " + name + "\n" + "Your age is:"
				+ age + "\n" + "are you a person:" + isMan + "\n"
				+ "your salaryovertime is:" + salaryOvertime +"\n");
	}
 
}