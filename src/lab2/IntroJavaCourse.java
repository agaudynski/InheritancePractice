package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 * @version     1.00
 */
public class IntroJavaCourse implements GeneralCollegeCourse {
    
    
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    
    // Constructor
    public IntroJavaCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber; 
    }

    // Getters
    
    @Override
    public String getCourseNumber() {
        return courseNumber;
    }
    
    @Override
    public String getPrerequisites() {
        return prerequisites;
    }    
    
    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public String getCapitalizedCourseName() {
        return courseName.toUpperCase();
    }
    
    @Override
    public double getCredits() {
        return credits;
    }
    

    // Setters
    
    @Override
    public void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0){
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
        }
        else
        {
        this.courseNumber = courseNumber.trim();
        }
    }

    @Override
    public void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0){
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be between 0.5 and 4.0");
        }
        else
        {
            this.credits = credits;
        }
    }


    @Override
    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0){
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
        }
        else
        {
        this.prerequisites = prerequisites.trim();
        }
    }


    @Override
    public void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0){
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
        }
        else
        {
        this.courseName = courseName.trim();
        }
    }

    
}
