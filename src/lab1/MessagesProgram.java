/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author jerem
 */
public class MessagesProgram {
    
    private String courseNumberErr, setCreditsErr, setPrereqErr, nothingSelected; //Error Messages
    private String enrolled, uHaveSelected, courseNumberMess, numberOfCreditsMess, prereqMess; //General Messages
    private String uMustTake, haveUTaken;
    private String into2ProgrammingName, intro2JavaName, advancedJavaName; //Program Names
            
    public MessagesProgram() {
        
        //              Here you can globally change Strings.
        
        //Errors
        this.courseNumberErr = "Error: courseNumber cannot be null of empty string";
        this.setCreditsErr = "Error: credits must be in the range 0.5 to 4.0";
        this.setPrereqErr = "Error: prerequisites cannot be null of empty string";
        //General
        this.enrolled = "You are now enrolled in: ";
        this.nothingSelected = "nothing Seleceted";
        this.uHaveSelected = "You have selected: ";
        this.courseNumberMess = "    Course Number: ";
        this.numberOfCreditsMess = "Number of Credits: ";
        this.prereqMess = "    Prerequisites: ";
        this.uMustTake = "You must take ";
        this.haveUTaken = "Have you taken ";
        this.advancedJavaName = " ADVANCED JAVA";
        this.into2ProgrammingName = " INTRODUCTION TO PROGRAMMING";
        this.intro2JavaName = " INTRODUCTION TO JAVA PROGRAMMING";
    }
    
    
    //                  Getters and setters for each String

    public String getInto2ProgrammingName() {
        return into2ProgrammingName;
    }

    public void setInto2ProgrammingName(String into2ProgrammingName) {
        this.into2ProgrammingName = into2ProgrammingName;
    }

    public String getIntro2JavaName() {
        return intro2JavaName;
    }

    public void setIntro2JavaName(String intro2JavaName) {
        this.intro2JavaName = intro2JavaName;
    }

    public String getAdvancedJavaName() {
        return advancedJavaName;
    }

    public void setAdvancedJavaName(String advancedJavaName) {
        this.advancedJavaName = advancedJavaName;
    }

    public String getuMustTake() {
        return uMustTake;
    }

    public void setuMustTake(String uMustTake) {
        this.uMustTake = uMustTake;
    }

    public String getHaveUTaken() {
        return haveUTaken;
    }

    public void setHaveUTaken(String haveUTaken) {
        this.haveUTaken = haveUTaken;
    }

    public String getPrereqMess() {
        return prereqMess;
    }

    public void setPrereqMess(String prereqMess) {
        this.prereqMess = prereqMess;
    }

    public String getNumberOfCreditsMess() {
        return numberOfCreditsMess;
    }

    public void setNumberOfCreditsMess(String numberOfCreditsMess) {
        this.numberOfCreditsMess = numberOfCreditsMess;
    }

    public String getCourseNumberMess() {
        return courseNumberMess;
    }

    public void setCourseNumberMess(String courseNumberMess) {
        this.courseNumberMess = courseNumberMess;
    }

    public String getuHaveSelected() {
        return uHaveSelected;
    }

    public void setuHaveSelected(String uHaveSelected) {
        this.uHaveSelected = uHaveSelected;
    }
    

    public String getNothingSelected() {
        return nothingSelected;
    }

    public void setNothingSelected(String nothingSelected) {
        this.nothingSelected = nothingSelected;
    }

    public String getEnrolled() {
        return enrolled;
    }

    public void setEnrolled(String enrolled) {
        this.enrolled = enrolled;
    }

    public String getCourseNumberErr() {
        return courseNumberErr;
    }

    public void setCourseNumberErr(String courseNumberErr) {
        
        this.courseNumberErr = courseNumberErr;
    }

    public String getSetCreditsErr() {
        return setCreditsErr;
    }

    public void setSetCreditsErr(String setCreditsErr) {
        this.setCreditsErr = setCreditsErr;
    }

    public String getSetPrereqErr() {
        return setPrereqErr;
    }

    public void setSetPrereqErr(String setPrereqErr) {
        this.setPrereqErr = setPrereqErr;
    }
    
    public String getPreReqOptions(){
    
        String a = "1. Intro to Programming: No PreReq \n 2. Intro to Java Programming: Intro to Programming \n 3. Advanced Java: Intro to Java Programming";
        
        return a;
    
    }

   
    
    
    
    
}
