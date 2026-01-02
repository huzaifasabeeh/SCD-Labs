package marksheet;

import java.util.Scanner;

public class Marksheet {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Runtime input
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Total Marks: ");
        double totalMarks = sc.nextDouble();

        System.out.print("Enter Obtained Marks: ");
        double obtainedMarks = sc.nextDouble();

        // Calculate Percentage
        double percentage = (obtainedMarks / totalMarks) * 100;

        // Determine Grade
        String grade;
        double gpa;

        if (percentage >= 85) {
            grade = "A";
            gpa = 4.0;
        } else if (percentage >= 75) {
            grade = "B";
            gpa = 3.0;
        } else if (percentage >= 60) {
            grade = "C";
            gpa = 2.0;
        } else if (percentage >= 50) {
            grade = "D";
            gpa = 1.0;
        } else {
            grade = "F";
            gpa = 0.0;
        }

        // Output Display
        System.out.println("\n------------------ MARKSHEET ------------------");
        System.out.println("Student Name      : " + name);
        System.out.println("Total Marks       : " + totalMarks);
        System.out.println("Obtained Marks    : " + obtainedMarks);
        System.out.println("Percentage        : " + percentage + "%");
        System.out.println("Grade             : " + grade);
        System.out.println("GPA               : " + gpa);
        System.out.println("------------------------------------------------");

        sc.close();
    }
}
