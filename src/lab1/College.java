/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author jerem
 */
public class College {

    public static void main(String[] args) {
        MessagesProgram e = new MessagesProgram();
        Scanner k = new Scanner(System.in);
        
        System.out.println("Programming Courses SignUp");
        System.out.println("");
        System.out.println("Please Select the course you would like to take.");

        System.out.println("1. " + e.getInto2ProgrammingName());
        System.out.println("2. " + e.getIntro2JavaName());
        System.out.println("3. " + e.getAdvancedJavaName());
        System.out.println("4. See Prereqs");

        System.out.print("Number: ");
        int selection = k.nextInt();
        
        
        //Make this a class method
        
        
        CourseSelectionWalkThrough.walkthroughTheProcessOfCourseSelection(selection);

    }

}
