/*   Created by IntelliJ IDEA.
 *   Author: Pragya Sharma
 *   Date: 07/08/20
 *   Time: 6:37 PM
 *   File: CommaSeperatedInput.java
 */
import java.util.Arrays;
import java.util.Scanner;

public class CommaSeperatedInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the comma seperated values!!!");
        String commaSeperatedValues = scanner.nextLine().trim();
        String[] values = commaSeperatedValues.split(",");
        int[] convertedValues = new int[values.length];
        for (int indexOfvalues = 0; indexOfvalues < values.length; indexOfvalues++) {
            convertedValues[indexOfvalues] = Integer.parseInt(values[indexOfvalues]);
        }
        System.out.println("For printing Values in The form of Array enter 1,for multiline printing enter 2");
        int choice = scanner.nextInt();
        scanner.close();
        if (choice == 1) {
            System.out.print(Arrays.toString(convertedValues));
        } else if (choice == 2) {
            for (int value : convertedValues) {
                System.out.println(value);
            }
        }

    }
}
