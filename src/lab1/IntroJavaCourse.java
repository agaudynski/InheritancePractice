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
    

    public IntroJavaCourse(String courseName, String courseNumber, String prerequisites) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setPrerequisites(prerequisites);
    }

    
    // Set in class to allow for credit max variation
    @Override    
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
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
