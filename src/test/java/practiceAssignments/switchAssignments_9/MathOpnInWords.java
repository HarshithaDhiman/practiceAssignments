package practiceAssignments.switchAssignments_9;

import java.util.Scanner;

public class MathOpnInWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();String operation;
        if (str.contains("add"))
            operation = "add";
        else if (str.contains("subtract"))
            operation = "subtract";
        else if (str.contains("division"))
            operation = "divide";
        else
            operation = "multiply";
        int a = 10, b = 20;
        switch (operation){
            case "add"-> System.out.println("Sum of two numbers is: "+(a+b));
            case "subtract"-> System.out.println("Difference of two numbers is: "+(a-b));
            case "divide"-> System.out.println("product of two numbers is: "+(a*b));
            case "multiply"-> System.out.println("quotient when one is divided by another number is: "+(a/b));
        }
    }
}