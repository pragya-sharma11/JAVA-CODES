/*
 * Created by intellij IDEA
 *Author :Pragya Sharma
 * Date :25-July-2020
 * File Name: FizzBuzz */
package labWork;
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        if (number % 3 == 0 && number % 5 == 0){
            System.out.println("FizzBuzz");
        }
        else if (number % 3 == 0){
            System.out.println("Fizz");
        }
        else if (number % 5 == 0){
            System.out.println("Buzz");
        }
    }
}
