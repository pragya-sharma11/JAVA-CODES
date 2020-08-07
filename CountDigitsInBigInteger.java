/*   Created by IntelliJ IDEA.
 *   Author: Pragya Sharma
 *   Date: 07/08/20
 *   Time: 7:02 PM
 *   File: RandomDetails.java
 */
package labWork;

import java.math.BigInteger;
import java.util.Scanner;

public class CountDigitsInBigInteger {
    private static final int MAX_COUNT=10;

    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner scanner =new Scanner(System.in);
        BigInteger number = scanner.nextBigInteger(10);
        scanner.close();
        int numberOfDigits=0;
        while (number.compareTo(BigInteger.ZERO)>0) {
            number=number.divide(BigInteger.valueOf(10L));
            numberOfDigits++;
        }
        System.out.println("Number Of digits in your number is "+numberOfDigits);
    }
}
