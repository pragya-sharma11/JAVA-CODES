/*   Created by IntelliJ IDEA.
 *   Author: Pragya Sharma
 *   Date: 05/07/20
 *   Time: 6:15 PM
 *   File: NumberInEnglish.java
 */
import java.util.Scanner;

public class NumberInEnglish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student's name:");
        String studentName = sc.nextLine();
        System.out.print("\nEnter Father's name:");
        String fatherName = sc.nextLine();
        System.out.print("\nEnter Mother's name:");
        String motherName = sc.nextLine();
        System.out.print("\nPermanent Address :");
        String permanentAddress = sc.nextLine();
        System.out.print("\nEnter Student's number:");
        long studentNumber = sc.nextLong();
        System.out.print("\nEnter Father's number:");
        long fatherNumber = sc.nextLong();
        System.out.print("\nEnter Mother's number:");
        long motherNumber = sc.nextLong();
        System.out.print("\nEnter 12th percentage:");
        double percentInTwelvth = sc.nextDouble();
        System.out.print("\nEnter 10th percentage:");
        double percentInTenth = sc.nextDouble();
        System.out.print("\nEnter hostel choice:");
        boolean hostelChoice = sc.nextBoolean();
        sc.close();
        System.out.print("\nStudent's name:" + studentName);
        System.out.print("\nFather's name:" + fatherName);
        System.out.print("\nMother's name:" + motherName);
        System.out.print("\nPermanent Address:" + permanentAddress);
        System.out.print("\nStudent's number:" + studentNumber);
        System.out.print("\nFather's number:" + fatherNumber);
        System.out.print("\nMother's number:" + motherNumber);
        System.out.print("\n12th percentage:" + percentInTwelvth);
        System.out.print("\n10th percentage:" + percentInTenth);
        System.out.print("\nYear:" + "1");
        System.out.print("\nsection:" + "A");
        System.out.print("\nClass Roll number:" + "1");
        System.out.print("\nUniversity Roll number:" + "201500641");
        System.out.print("\nCourse:" + "B.Tech CSE");
    }
}
