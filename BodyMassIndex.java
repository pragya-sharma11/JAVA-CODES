/*   Created by IntelliJ IDEA.
 *   Author: Pragya Sharma
 *   Date: 08/08/20
 *   Time: 4:14 PM
 *   File: BodyMassIndex.java
 */
package myWork;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Height in feet:");
        int feetHeight = scanner.nextInt();
        System.out.println("Enter Your Height in inches:");
        int inchesHeight = scanner.nextInt();
        System.out.println("Enter your weight in Kg:");
        float weight = scanner.nextFloat();
        float heightInMetres = (feetHeight * 0.3048f) + (inchesHeight * 0.0254f);
        float bodyMassIndex = weight / (heightInMetres * heightInMetres);
        System.out.print("Body Mass Index of Your Body is : " + bodyMassIndex);
    }
}
