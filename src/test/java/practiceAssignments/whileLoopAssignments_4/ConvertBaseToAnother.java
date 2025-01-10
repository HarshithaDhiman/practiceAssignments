package practiceAssignments.whileLoopAssignments_4;

import java.util.ArrayList;
import java.util.Scanner;

public class ConvertBaseToAnother {
    public static void convertToAnotherBase(String binary, int base) {
        String[] digits = binary.split("");
        ArrayList<Integer> number = new ArrayList<Integer>();
        int decimal = 0;
        for(int i= 0;i < digits.length;i++) {
            decimal = decimal + (int)Math.pow(2, digits.length-1-i)*Integer.valueOf(digits[i]);
        }
        System.out.println("The decimal value of the binary "+binary+" is: "+decimal);
        if (base == 8){
            while (decimal > 0) {
                int quotient = decimal /8;
                int remainder = decimal % 8;
                if (quotient != 0) {
                    number.add(quotient);
                    number.add(remainder);
                }
                decimal = quotient/8;
            }
            for(int i=0;i< number.size();i++) {
                System.out.print(number.get(i));
            }
        } else if (base == 6) {
            while (decimal > 0) {
                number.add(decimal%6);
                decimal = decimal / 6;
            }
            for(int i=number.size()-1;i>=0;i--) {
                System.out.print(number.get(i));
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any binary value: ");
        String binary = sc.next();
        System.out.print("Enter the base to which the value has to be converted: ");
        int base = sc.nextInt();
        convertToAnotherBase(binary, base);
    }
}