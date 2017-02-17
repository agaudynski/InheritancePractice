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
    // private double credits;  // Not required for this super class    
    
    
    // Getters
    
    public String getCourseNumber() {
        return courseNumber;
    }
    
    public  String getCourseName() {
        return courseName;
    }
        
    public String getCapitalizedCourseName(){
        return courseName.toUpperCase();
    }
     
    
    public String getPrerequisites(){
        return prerequisites;
    }
    
    // Set in each method as credits change per class
    public abstract double getCredits();
    
       
    // Setters
    
    public final  void setCourseNumber (String courseNumber){
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber.trim();
    }
 
    
    
    public final void setCourseName(String courseName){
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName.trim();
    }
    
    
    
    public void setPrerequisites(String prerequisites){
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites.trim();
    }
    
    
    // Abstract method, declared in each subclass
    public abstract void setCredits(double credits);
    
    
}
