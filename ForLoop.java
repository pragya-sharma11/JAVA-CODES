/*   Created by IntelliJ IDEA.
 *   Author: Pragya Sharma
 *   Date: 04/08/20
 *   Time: 6:15 PM
 *   File: ForLoop.java
 */
import java.util.Scanner;
import java.util.stream.IntStream;

// 3 types of for loop initialisation!!!!
public class ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        //type 1 :- simple for loop
        System.out.println("Enter the elements for an integer type array!!!");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = scanner.nextInt();
        }
        scanner.close();
        //type 2:- foreach loop with IntStream!!!!
        IntStream.range(0, numbers.length).forEach(index -> numbers[index] = numbers[index] * 2);
        //type 2:- forEach loop in simple way!!!!
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
