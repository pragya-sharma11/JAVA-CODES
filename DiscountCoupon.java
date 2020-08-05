/*   Created by IntelliJ IDEA.
 *   Author: Pragya Sharma
 *   Date: 27/07/20
 *   Time: 2:38 PM
 *   File: Lab3Task.java
 */
// to check whether the code of discount coupon given by client ̥is valid or not.

import java.util.Scanner;

public class DiscountCoupon {
    public static final String DISCOUNT_CODE = "CoVid19";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the discount code of your coupon");
        String clientInputDiscountCode = scanner.nextLine();
        scanner.close();
        if (clientInputDiscountCode.equalsIgnoreCase(DISCOUNT_CODE)) {
            System.out.println("Congrats, you get ₹ 100 off on your bill!");
        } else if (clientInputDiscountCode.isEmpty() /* || clientInputDiscountCode.isBlank()*/) {
            System.out.println("Coupon code cannot be blank or empty!!!");
        } else {
            System.out.println("The discount coupon code which you have entered, is wrong!!!");
        }
    }
}
