package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 * @author      Alex Gaudynski
 */
public class AdvancedJavaCourse extends StandardSchoolCourse {
    
    
    //private String courseName;
    //private String courseNumber;
    //private String prerequisites;
    private double credits;   
    
    // Message Service Object
    MessageService output = new MessageService();
    

    // Constructor
    public AdvancedJavaCourse(String courseName, String courseNumber, String prerequisites) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setPrerequisites(prerequisites);
    }

    
    // Set in class to allow for credit max variation
    @Override
    public void setCredits(double credits) {
        if(credits < 1.0 || credits > 5.0) {
            output.outputMessage("Credits must be between 1 and 5.");
            this.credits = 0;
        }
        else
        {
        this.credits = credits;
        }
    }
    
    
    @Override
    public double getCredits() {
        return credits;
    }
    
    
    
}
