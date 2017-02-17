/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;


import javax.swing.JOptionPane;
/**
 * @author      Alex Gaudynski
 */
public abstract class StandardSchoolCourse {
    
    private String courseNumber;
    private String courseName;
    private String prerequisites;
    private double credits;   
    
    // Message Service Object
    MessageService output = new MessageService();
    
    // Getters
    
    public final String getCourseNumber() {
        return courseNumber;
    }
    
    public  final String getCourseName() {
        return courseName;
    }
        
    public final String getCapitalizedCourseName(){
        return courseName.toUpperCase();
    }
     
    
    public final String getPrerequisites(){
        return prerequisites;
    }
    
    // Set in each method as credits change per class
    public abstract double getCredits();
    
       
    // Setters
    
    public void setCourseNumber (String courseNumber){
        if(courseNumber == null || courseNumber.length() == 0) {
            output.outputMessage("Course Number cannot be null or empty.");
            this.courseNumber = "0";
        }
        this.courseNumber = courseNumber.trim();
    }
 
    
    
    public void setCourseName(String courseName){
        if(courseName == null || courseName.length() == 0) {
            output.outputMessage("Course Na e cannot be null or empty.");
            this.courseName = "0";
        }
        this.courseName = courseName.trim();
    }
    
    
    
    public void setPrerequisites(String prerequisites){
        if(prerequisites == null || prerequisites.length() == 0) {
            output.outputMessage("Prerequisites cannot be null or empty.");
            this.prerequisites = "0";
        }
        this.prerequisites = prerequisites.trim();
    }
    
    
    // Abstract method, declared in each subclass
    public abstract void setCredits(double credits);
    
    
}
