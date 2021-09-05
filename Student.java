import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private String classYear;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // Constructor to prompt user to enter student's name and year
    public Student() {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter student first name: ");
        this.firstName = kb.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = kb.nextLine();

        System.out.print("\n1) Freshman " +
                "\n2) Sophomore " +
                "\n3) Junior " +
                "\n4) Senior " +
                "\nEnter student class year: ");
        this.gradeYear = kb.nextInt();

        int classLevel = this.gradeYear;
        this.classYear = classYear;

        switch (classLevel) {
            case 1:
                classYear = "Freshman";
                break;
            case 2:
                classYear = "Sophomore";
                break;
            case 3:
                classYear = "Junior";
                break;
            case 4:
                classYear = "Senior";
                break;
        }

        setStudentID();
    }

    // Generate a 5-digit unique ID
    private void setStudentID() {
        //Grade Level + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }

    // Enroll in courses
    public void enroll() {
        // Get inside a loop, user hits Q to quit
        do {
            Scanner kb = new Scanner(System.in);
            System.out.print("Enter course to enroll (Q to Quit): ");
            String course = kb.nextLine();

            if (!course.equals("Q")) {
                courses = courses + "\n \t" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        } while (1 != 0);
    }

    // View in balance
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
        System.out.println();
    }

    // Pay tuition
    public void payTuition() {
        Scanner kb = new Scanner(System.in);

        viewBalance();

        System.out.print("Enter the payment: $");
        int payment = kb.nextInt();

        tuitionBalance = tuitionBalance - payment;

        System.out.println("\nThank you for you payment of $" + payment);

        viewBalance();
    }

    // Show Status
    public String showInfo() {
        return "\nName: " + firstName + " " + lastName +
                "\nClass: " + classYear +
                "\nStudent ID: " + studentID +
                "\n\nCoursees Enrolled: " + courses +
                "\n\nBalance: $" + tuitionBalance;
    }
}
