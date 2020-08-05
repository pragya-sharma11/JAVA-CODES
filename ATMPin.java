/*   Created by IntelliJ IDEA.
 *   Author: Pragya Sharma
 *   Date: 27/07/20
 *   Time: 2:38 PM
 *   File: ATMPin.java
 */
import java.util.Scanner;

//code for atm machine!!!
public class ATMPin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int ATM_CODE = 7290;
        System.out.println("enter pin code");
        int atmCode = scanner.nextInt();
        boolean isWrongCode = atmCode != ATM_CODE;
        while (isWrongCode) {
            System.out.println("enter pin code");
            atmCode = scanner.nextInt();
            isWrongCode = atmCode != ATM_CODE;
        }
        scanner.close();
        System.out.println("Thanks for being coperative!!!");
    }
}
