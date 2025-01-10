package practiceAssignments.methodsAssignments_6;

import java.util.Scanner;

public class FibonacciProgram {
    public static void fibonacciSequence(int n0, int n1, int count) {
        for (int i=2;i<count;i++) {
            int res = n0 + n1;
            n0 = n1;
            n1 = res;
            System.out.print(","+res);
        }
    }
    public static void main(String[] args) {
        int n0 = 0, n1 = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values to be printed for the fibonacci sequence: ");
        int count = sc.nextInt();
        System.out.print(n0+","+n1);
        fibonacciSequence(n0, n1, count);
    }
}
