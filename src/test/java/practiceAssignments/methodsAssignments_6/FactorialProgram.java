package practiceAssignments.methodsAssignments_6;

import java.util.Scanner;

public class FactorialProgram {
    static void factorial(int n) {
        int fact = 1;
        if (n==0 || n==1) {
            fact = 1;
        }
        for (int i = 1;i<=n;i++){
            fact = fact * i;
        }
        System.out.println("The factorial of "+n+" is: "+fact);
    }
    static int recursiveFactorial(int n) {
        if (n==1 || n==0)
            return 1;
        else
            return n * recursiveFactorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find the factorial of: ");
        int n = sc.nextInt();
        factorial(n);
        System.out.print("The Factorial of "+n+" is: "+recursiveFactorial(n));
    }
}