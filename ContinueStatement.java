package Descion_making_statements;

import java.util.Scanner;

public class ContinueStatement {
    private static Scanner sc;
    public static void main(String[]arg){
        int Number;
        sc=new Scanner(System.in);
        System.out.println("Please Enter any Integer Value: ");
        Number= sc.nextInt();
        int i;
        for (i=1; i<=Number; i++){
            if(i%2!=0){
                System.out.format("\n Odd Number=%d(Skipped By Continue)\n",i);
                continue;
            }
            System.out.format("Even Number=%d",i);
        }
    }
}


// In this Java continue statement example, we are not going to explain the for loop. If you do not understand Java code, then please visit our article For Loop.

// Inside the for loop we placed If Statement to test whether (i % 2 != 0).
// If this condition is True, then the continue statement executed, and the iteration will stop at that number without printing the other: System.out.format(” Even Numbers = %d “,i);.
// If the condition is false, then it will skip the Java continue statement and prints that value as output (In Our case Even Number).


// Continue statement is one of the most useful one that control the flow of loops. We generally use this inside the For Loop, While Loop and Do While. While executing these, if the Javac compiler finds the Java Continue statement inside them, it will stop the current iteration and starts the new iteration from the beginning.
// n Java For Loop with example. This program allows the user to enter any integer value. Then it will display the Even and Odd numbers inside the given range.
// 