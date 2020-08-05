/*
 * Created by intellij IDEA
 *Author :Pragya Sharma
 * Date :20-July-2020
 * Time:10:15 pm
 * File Name: Fibonacci */
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of test in fibbonicci Series");
        int n=sc.nextInt();
        int t=0,s=1,f=0;
        System.out.print(f+", "+s);
        for(int i=0;i<n-2;i++){
            t=s+f;
            System.out.print(", "+t);
            f=s;
            s=t;
        }
    }
}
