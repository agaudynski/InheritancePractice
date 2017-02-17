/*
 */
package lab2;

/**
 * @author Owner
 */
public interface GeneralCollegeCourse {
    
    // Abstract getters
    
    public abstract String getCourseName();
    
    public abstract String getCourseNumber();
    
    public abstract String getCapitalizedCourseName();
    
    public abstract String getPrerequisites();
    
    public abstract double getCredits();
    
    // Abstract Setters
    
    public abstract void setCourseName(String courseName);
    
    public abstract void setCourseNumber (String courseNumber);
    
    public abstract void setPrerequisites(String prerequisites);
    
    public abstract void setCredits (double credits);
}
