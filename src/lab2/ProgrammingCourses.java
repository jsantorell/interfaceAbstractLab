/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import javax.swing.JOptionPane;

/**
 *
 * @author jerem
 */
public class ProgrammingCourses implements CollegeClassOfferings {
    
    
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    MessagesProgram e = new MessagesProgram();

    public ProgrammingCourses(String courseName, String courseNumber, double credits, String prerequisites) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.credits = credits;
        this.prerequisites = prerequisites;
        
        
        
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
        
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    e.getCourseNumberErr());
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public final void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    e.getSetCreditsErr());
            System.exit(0);
        }
        this.credits = credits;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public final void setPrerequisites(String prerequisites) {
        
    if(this.courseName.equals("IntroToProgrammingCourse")){
        
        this.prerequisites = "No Prerequisites";

    }else{
    
                if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    e.getSetPrereqErr());
            System.exit(0);
        }
    
    }
        this.prerequisites = prerequisites;
        
    }
    
    
    
    
}
