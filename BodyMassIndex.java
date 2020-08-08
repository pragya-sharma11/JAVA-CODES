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
        System.out.println("Body Mass Index of Your Body is : " + bodyMassIndex);
        if (bodyMassIndex < 15.0f) {
            System.out.println("You are very severely underweight!!!");
        } else if (bodyMassIndex >= 15.0f && bodyMassIndex <= 16.0f) {
            System.out.println("You are severely underweight!!!");
        } else if (bodyMassIndex > 16.0f && bodyMassIndex <= 18.4f) {
            System.out.println("You are Underweight!!!");
        } else if (bodyMassIndex > 18.4f && bodyMassIndex <= 24.9) {
            System.out.println("You are Normal Weight!!!");
        } else if (bodyMassIndex >= 25.0f && bodyMassIndex <= 29.0f) {
            System.out.println("You are OverWeight!!!");
        } else if (bodyMassIndex >= 30.0f && bodyMassIndex <= 34.9) {
            System.out.println("You are moderately obese!!!");
        } else if (bodyMassIndex >= 35.0f && bodyMassIndex <= 39.9f) {
            System.out.println("You are Severely Obese!!!");
        } else {
            System.out.println("You are Morbidly obese!!!");
        }
    }
}
