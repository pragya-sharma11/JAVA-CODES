/*
 * Created by intellij IDEA
 *Author :Pragya Sharma
 * Date :20-July-2020
 * Time:11:30 am
 * File Name: NumberInRangeOfDatatype */
package labWork;
import java.util.Scanner;
public class NumberInRangeOfDatatype {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number=sc.nextLong();
        if(number>=Byte.MIN_VALUE && number<=Byte.MAX_VALUE){
            System.out.println("Number is Byte type");
        }
        if(number>=Short.MIN_VALUE && number<=Short.MAX_VALUE){
            System.out.println("Number is Short type");
        }
        if(number>=Integer.MIN_VALUE && number>=Integer.MAX_VALUE){
            System.out.println("Number is Integer type");
        }
        System.out.println("Number is Long type");
    }
}
