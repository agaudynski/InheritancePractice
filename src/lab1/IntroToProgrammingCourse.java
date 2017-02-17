package lab1;

import javax.swing.JOptionPane;

/**
 * @author      Alex Gaudynski
 */
public class IntroToProgrammingCourse extends StandardSchoolCourse {
    
    //private String courseName;
    //private String courseNumber;
    //private String prerequisites;
    private double credits;    

    
    // Constructor
    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setPrerequisites("No prerequisites");
    }
    
    // Message Service Object
    MessageService output = new MessageService();
        

    
    // Set in class to allow for credit max variation
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
    public double getCredits() {
        return credits;
    }
    
    
}
