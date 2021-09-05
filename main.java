import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        // Ask how many new students do we want to add
        System.out.println("Enter number of new students to enroll: ");
        int studentSize = kb.nextInt();

        Student[] students = new Student[studentSize];

        // Create n number of new students
        for(int n=0; n<studentSize; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
        }

        System.out.println(students[0].showInfo());
        System.out.println(students[1].showInfo());
        System.out.println(students[2].showInfo());
    }
}

