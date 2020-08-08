/*   Created by IntelliJ IDEA.
 *   Author: Pragya Sharma
 *   Date: 08/08/20
 *   Time: 3:22 PM
 *   File: StudentsRecords.java
 */
package myWork;

import java.util.Arrays;
import java.util.Scanner;

// Software to process marks of stu̥dents in section!!
public class StudentsRecords {
    //find marks for each student in section!!!
    //find number of students failed in exams!!
    //find number of students who scored full marks!!
    //find sum of marks of students of section!!
    //find average marks scored in section!!
    //find number of students who answered first question incorrectly!!
    private static final float PASSING_MARKS = 3.0f;
    private static final float FULL_MARKS = 10.0f;
    private static final int NUMBER_OF_QUESTIONS = 10;

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Please enter the number of students in section");
        int numberOfStudents = scannerObject.nextInt();
        float[][] sectionMarks = new float[numberOfStudents][NUMBER_OF_QUESTIONS];
        float sumOfMarks = 0.0f;
        int numberOfFailedStudents = 0;
        int numberOfTopperStudents = 0;
        scannerObject.close();
        for (int studentIndex = 0; studentIndex < numberOfStudents; studentIndex++) {
            for (int questionIndex = 0; questionIndex < NUMBER_OF_QUESTIONS; questionIndex++) {
                float randomMarks = (float) (Math.random() * (FULL_MARKS + 1.0f)) * 0.1f;
                randomMarks = Math.min(10.0f, randomMarks);
                randomMarks = randomMarks < 1.0f ? 0.0f : 1.0f;
                sectionMarks[studentIndex][questionIndex] = randomMarks;
            }
        }
        for (float[] students : sectionMarks) {
            System.out.println(Arrays.toString(students));
        }
        int numberOfStudentsAnsweredFirstQuestionWrong = 0;
        for (float[] studentMarks : sectionMarks) {
            if (studentMarks[0] == 0.0f) {
                numberOfStudentsAnsweredFirstQuestionWrong++;
            }
        }
        float sumOfStudentMarks = 0.0f;
        for (int studentIndex = 0; studentIndex < numberOfStudents; studentIndex++) {
            for (int questionIndex = 0; questionIndex < NUMBER_OF_QUESTIONS; questionIndex++) {
                sumOfMarks += sectionMarks[studentIndex][questionIndex];
            }
            sumOfStudentMarks += sumOfMarks;
        }
        System.out.println("Number of students failed in exam: " + numberOfFailedStudents);
        System.out.println("Number of students scored full marks: " + numberOfTopperStudents);
        System.out.println("Total Sum of marks for the section is " + sumOfStudentMarks);
        float averageMarks = sumOfStudentMarks / numberOfStudents;
        System.out.println("The average marks in section is " + averageMarks);
    }
}
