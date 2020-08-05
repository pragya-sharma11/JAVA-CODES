/*   Created by IntelliJ IDEA.
 *   Author: Pragya Sharma
 *   Date: 27/07/20
 *   Time: 2:38 PM
 *   File: Lab3Task.java
 */
import java.util.Scanner;
class CollatzConjecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.print(n);
        }
        while (n != 1) {
            
            System.out.print(n + " ");
            if (n % 2 == 0){
                n = n / 2;
                
            }
            else {
                n = 3 * n + 1;
            }
            if (n == 1) {
                System.out.print(n + " ");
                break;
            }
        }
    }
}
