/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author  Antoaneta Ivanova , I semester , NBU, Master Program Software Technlogies in Internet 
 */
public class DemoClass extends Employee{ //the class DemoClass extends Employee and I will use it to create an object and demonstrate how methods from the Employee class and the class Person that is Employee`s super class can be called here and to demonstrate how inheritance works
      
			
	DemoClass(String name, int age, boolean isMan){ //the class constructor with it`s parameters
		super(name, age, isMan, wrkHours); //I call the constructor of the super class Employee
	}
	public static void main(String[] args) //I need the main method in order to start the programm execution
	{
	DemoClass employee1= new DemoClass(name, age, isMan);{ //here I create an object from the class, that is of type DemoClass and has the name employee1
	employee1.calculateOvertime(20, 23);	//on the object employee1 I call the methods inherited from the class Employee and give them parameters to test if they work correctly
	employee1.showEmployee(3.75, "Alan", 23, true);
	employee1.showPersonInfo("Alan", 23, true);  //since the class Employee extends Person I can call the method showPersonInfo in this class because this class extends Emplyee
        
	
	
	 
	}	
	
	}
}
