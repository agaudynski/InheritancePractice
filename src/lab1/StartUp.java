/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Owner
 */
public class StartUp {
    
    // Start Up Class
    public static void main(String[] args) {
       
        // Declaration of new objects
        
        StandardSchoolCourse introToProgramming = new IntroToProgrammingCourse("Intro to Programming", "111-111-111", "no prerequisites");
        StandardSchoolCourse introToJava = new IntroJavaCourse("Intro to Java", "222-222-222", "Intro to Programming");
        StandardSchoolCourse advancedJava = new AdvancedJavaCourse("Advanced Java", "333-333-333", "Intro to Programing and Intro to Java");
        
        // Set credits for each class
        introToProgramming.setCredits(3.0);
        introToJava.setCredits(4.0);
        advancedJava.setCredits(5.0);
        
        
        // Put objects in an array
        StandardSchoolCourse[] schoolClasses = {
            introToProgramming,
            introToJava,
            advancedJava
        };   
        
        // OutPut array items
        
        for (StandardSchoolCourse c :  schoolClasses) {
            
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
This structure seems to work well, but only when you have very specific methods
and objects that share very similiar structures and do not vary greatly. I could
imagine that this type of architecture would be beneficil for instances where you
need to track and group objects differently by name, but maintain the same base
structure so that any changes to the super class can cascade down tothe sub classes.
This structure would also allow for quick additions and edits since everything is
inherited.
*/