/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import lab1.*;
import java.util.Scanner;

/**
 *
 * @author jerem
 */
public class CourseSelectionWalkThrough {  //This is a component class that runs through the process of selecting a course.

    public CourseSelectionWalkThrough(int selection) {
    }

    public static void walkthroughTheProcessOfCourseSelection(int selection) {
        MessagesProgram e = new MessagesProgram();
        Scanner k = new Scanner(System.in);
        switch (selection) {

            case 1:
                ProgrammingCourses i = new IntroToProgrammingCourse("IntroToProgrammingCourse", "1234", 4.0, "No prerequisites");
                outputCourseAttending(i);
                break;
            case 2:
                System.out.print(e.getHaveUTaken() + e.getInto2ProgrammingName() + " (Y/N)");
                String answer = k.nextLine();

                if (answer.equals("Y") || answer.equals("y")) {

                    ProgrammingCourses j = new IntroJavaCourse("IntroJavaCourse", "2345", 4.0, "IntroToProgramming");
                    outputCourseAttending(j);
                } else {
                    System.out.println(e.getuMustTake() + " " + e.getInto2ProgrammingName());
                }
                break;
            case 3:
                System.out.print(e.getHaveUTaken() + e.getIntro2JavaName() + "? (Y/N)");
                String answer1 = k.nextLine();

                if (answer1.equals("Y") || answer1.equals("y")) {
                    ProgrammingCourses a = new AdvancedJavaCourse("AdvancedJavaCourse", "3456", 4.0, "IntroJavaCourse");
                    outputCourseAttending(a);
                } else {
                    System.out.println(e.getuMustTake() + e.getIntro2JavaName());
                }
                break;
            case 4:
                e.getPreReqOptions();
                break;

            default:
                System.out.println(e.getNothingSelected());
        }
    }

    public static void outputCourseAttending(ProgrammingCourses a) { // spits out the report the student signed up for.
        MessagesProgram e = new MessagesProgram();
        System.out.println("");
        System.out.println(e.getEnrolled());
        System.out.println("");
        System.out.println(e.getuHaveSelected() + " " + a.getCourseName());
        System.out.println(e.getCourseNumberMess() + " " + a.getCourseNumber());
        System.out.println(e.getNumberOfCreditsMess() + " " + a.getCredits());
        System.out.println(e.getPrereqMess() + " " + a.getPrerequisites());

    }
}
