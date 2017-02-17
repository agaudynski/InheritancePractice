package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse implements GeneralCollegeCourse {
    
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    // Message Service Object
    MessageService output = new MessageService();    
    
    // Constructor
    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        prerequisites = "None";
    }

    
    // Getters
    
    @Override
    public String getCourseNumber() {
        return courseNumber;
    }
    
    @Override
    public double getCredits() {
        return credits;
    }
    
    @Override
    public String getCourseName() {
        return courseName;
    }
    
    @Override
    public String getPrerequisites() {
        return prerequisites;
    }
    
    @Override
    public String getCapitalizedCourseName() {
        return courseName.toUpperCase();
    }


    // Setters

    @Override
    public void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            output.outputMessage("Course Number cannot be null or empty.");
            this.courseNumber = "0";
        }
        else
        {
            this.courseNumber = courseNumber;
        }
    }


    @Override
    public void setCredits(double credits) {
        if(credits < 1.0 || credits > 3.0) {
            output.outputMessage("Credits must be between 1 and 3.");
            this.credits = 0;
        }
        else
        {
            this.credits = credits;
        }
    }


    @Override
    public void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            output.outputMessage("Course Name cannot be null or empty.");  
            this.courseName = "0";
        }
        else
        {
            this.courseName = courseName;
        }
    }
  


    @Override
    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            output.outputMessage("Prerequisites cannot be null or empty."); 
            this.prerequisites = "0";
        }
        else
        {
            this.prerequisites = prerequisites;
        }
     }

    
}
