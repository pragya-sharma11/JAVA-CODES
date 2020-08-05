/*
 * Created by intellij IDEA
 *Author :Pragya Sharma
 * Date :21-July-2020
 * Time:8:2 pm
 * File Name:StackCodeInArray  */
package labWork;
import java.util.Scanner;

 class StackCodeInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Test ob=new Test();
        int option;
        while(true){
            System.out.println("1-push ,2-pop, 3-display ,4-exit");
            option=sc.nextInt();
            if(option==1){
                System.out.println("enter number to be feeded11");
                int number=sc.nextInt();
                ob.pushNumber(number);
            }
            else if(option==2) {
                if (ob.popNumber() == -999) {
                    System.out.println("Empty Stack");
                } else {
                    System.out.println(ob.popNumber());
                }
            }
            else if (option==3){
                ob.display();
            }
            else if(option==4){
                System.out.println("Operation executed");
                break;
            }
            else {
                System.out.println("invalid input");
            }
        }


        }
    }
class Test {
    int numbersArray[]=new int[10];
    int top=-1,r=0,j;
    public void pushNumber(int number){
        if(top==9){
            System.out.println("Stack Overflow");
        }
        else {
            top=top+1;
            numbersArray[top]=number;
        }
    }
    public int popNumber() {
        if (top==-1) {
            r=-999;
            return r;
        }
        else{
            r=numbersArray[top];
            top--;
        }
        return r;
    }
    public void display(){
        for(int i=0;i<=top;i++){
            System.out.println(numbersArray[i]);
        }
    }
}
