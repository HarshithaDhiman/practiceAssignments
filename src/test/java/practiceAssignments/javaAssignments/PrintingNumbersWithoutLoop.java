package practiceAssignments.javaAssignments;

public class PrintingNumbersWithoutLoop {
    public static  void printNumbers1to100(int number) {
        if (number<=100) {
            System.out.println(number);
            printNumbers1to100(number+1);
        }
    }
    public static void printNumbers100to1(int number) {
        if (number>=1) {
            System.out.println(number);
            printNumbers100to1(number-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("********************Numbers from 1 to 100*****************");
        printNumbers1to100(1);
        System.out.println("********************Numbers from 100 to 1*****************");
        printNumbers100to1(100);
    }
}