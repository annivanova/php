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
public class Person {  //I create a class Person and declare the following fields, the class holds information about the Person and has one method 
 static String name; 
 static int age;
 static boolean isMan;
     
     Person(String name, int age, boolean isMan){
         //the class has constructor with the following parameters
        
}

public void showPersonInfo(String name, int age, boolean isMan){ // I declare a method showPersonInfo , this method has three parameters and what it does is displaying details about the person
	

System.out.println("your name is: "+ name +"\n"+"Your age is:"+ age+ "\n"+"are you a person:"+isMan+"\n");

}

}
    

