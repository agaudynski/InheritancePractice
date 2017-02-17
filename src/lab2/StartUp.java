/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Owner
 */
public class StartUp {
    
    
     public static void main(String[] args) {
       
        // Declaration of new objects
        
        GeneralCollegeCourse introToProgramming = new IntroToProgrammingCourse("Intro to Programming", "111-111-111");
        GeneralCollegeCourse introToJava = new IntroJavaCourse("Intro to Java", "222-222-222");
        GeneralCollegeCourse advancedJava = new AdvancedJavaCourse("Advanced Java", "333-333-333");
        
        
        // Set prerequisites
        introToJava.setPrerequisites(introToProgramming.getCourseName());
        advancedJava.setPrerequisites(introToJava.getCourseName());
        
        
        // Set credits for each class
        introToProgramming.setCredits(3.0);
        introToJava.setCredits(4.0);
        advancedJava.setCredits(5.0);
        
        
        // Put objects in an array
        GeneralCollegeCourse[] schoolClasses = {
            introToProgramming,
            introToJava,
            advancedJava
        };   
        
        // OutPut array items
        
        for (GeneralCollegeCourse c :  schoolClasses) {
            
            System.out.println("Class Information");
            System.out.println("_______________________");
            System.out.println("Class Name: " + c.getCapitalizedCourseName());
            System.out.println("Class Number " + c.getCourseNumber());
            System.out.println("Class Prerequisites: " + c.getPrerequisites());
            System.out.println("Credits: " + c.getCredits());
            System.out.println();
            
        }
        
    }

}


/*
This structure seems like it would be highly efficient, given that the creation of an 
interface ensures that every possible method is created for each object and that 
any variations requied for each object are taken into account. This structure woudl be 
more difficult to add to or maintain as any change would need to be evaluated on 
an object by object bases.
*/

