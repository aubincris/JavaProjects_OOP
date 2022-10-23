package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {

        //Ask how many new students we want to add
        System.out.println("Enter the number of new students");
        Scanner sc = new Scanner(System.in);
        int numOfStudents = sc.nextInt();
        Student[] students = new Student[numOfStudents];


        //Create n number of new students
        for (int i = 0; i < students.length; i++){
            Student student = new Student();
            student.enroll();
            student.payTuition();
            System.out.println(student.toString());


        }


    }
}
