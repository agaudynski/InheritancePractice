package lab1;

import javax.swing.JOptionPane;

/**
 * @author      Alex Gaudynski
 * @version     1.00
 */
public class IntroJavaCourse extends StandardSchoolCourse {
    
    //private String courseName;
    //private String courseNumber;
    //private String prerequisites;
    private double credits;    
    
    // Message Service Object
    MessageService output = new MessageService();
        

    public IntroJavaCourse(String courseName, String courseNumber, String prerequisites) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setPrerequisites(prerequisites);
    }

    
    // Set in class to allow for credit max variation
    @Override    
    public void setCredits(double credits) {
        if(credits < 1.0 || credits > 4.0) {
            output.outputMessage("Credits must be between 1 and 4.");
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
