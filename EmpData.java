/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *@author Antoaneta Ivanova , I semester , NBU, Master Program Software Technlogies in Internet 
 */

public class EmpData extends Person {  //the class holds information about employees, has one method showEmpInfo and another one that inherits form the class Person showPersonInfo

static String performanceEvaluate; // declare fields of the class
static String name;
static int age;
static boolean isMan;



	 public EmpData(int age, String name,boolean isMan, String performanceEvaluate) { //the class constructor 
		 super(name,age, isMan);  //the constructor of the superclass
		  	
	}

	public void showEmpInfo(String name, int age, boolean isMan, String performanceEvaluate){  //this method I create in this class and it displays information about Employee;
		 System.out.println("your name is: "+ name +"\n"+"Your age is:"+ age+ "\n"+"are you a person:"+isMan+"\n"+"your performance is:"+performanceEvaluate+"\n");

	 }

	 public static void main(String[] args) { //I need the main method to start the programm;
		EmpData empOne=new EmpData(age, name, isMan, performanceEvaluate); //here I create an object of type EmpData and name empOne;
		empOne.showPersonInfo("Iva", 23, true); //I call the methods on the object and give them parameters to test if they work 
		empOne.showEmpInfo("Iva", 23,true, "good");  //the EmpData class extends Person so we can call here the method showPersonInfo from the class Person through the object we created here
	}
	}


