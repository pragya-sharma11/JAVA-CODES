/*   Created by IntelliJ IDEA.
 *   Author: Pragya Sharma
 *   Date: 07/08/20
 *   Time: 7:02 PM
 *   File: RollCall.java
 */
package myWork;

import java.util.Scanner;

public class RollCall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name!!");
        String nameOfStudent = scanner.nextLine();
        scanner.close();
        final String ELLEN = "Ellen";
        final String JAMES = "James";
        final String THOMAS = "Thomas";
        if (nameOfStudent.compareTo(ELLEN) < 0) {
            System.out.println("Your roll number is about to call!!!");
        } else if (nameOfStudent.compareTo(ELLEN) > 0 && nameOfStudent.compareTo(JAMES) < 0) {
            System.out.println("You need not to wait !!!");
        } else if (nameOfStudent.compareTo(JAMES) > 0 && nameOfStudent.compareTo(THOMAS) < 0) {
            System.out.println("You Need to wait a little longer!!!");
        } else if (nameOfStudent.compareTo(THOMAS) > 0) {
            System.out.println("You should have patience enough,You have to wait longer!!!");
        }
    }
}

