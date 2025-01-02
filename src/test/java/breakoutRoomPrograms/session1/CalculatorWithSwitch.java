package breakoutRoomPrograms.session1;

public class CalculatorWithSwitch {
    public static void arithematicOperations(int a, int b, String operation) {
        switch (operation.toUpperCase()) {
            case "SUM" -> System.out.println("Sum of two  numbers is: "+(a+b));
            case "DIFFERENCE" -> System.out.println("Difference of two numbers: "+(a-b));
            case "PRODUCT" -> System.out.println("Product of two numbers: "+(a*b));
            case "QUOTIENT" -> System.out.println("Quotient when "+a+" is divided by "+b+" is: "+(a/b));
            case "REMAINDER" -> System.out.println("Remainder when "+a+" is divided by "+b+" is: "+(a%b));
            case "POWER" -> System.out.println(a+" to the power of "+b+" is: "+ Math.pow(a,b));
            case "SQUAREROOt" -> System.out.println("The square root of "+a+" is: "+ Math.sqrt(a));
            case "CUBEROOT" -> System.out.println("The cube root of "+a+" is: "+ Math.cbrt(a));
            case "FACTORIAL" -> {
                int fact = 1;
                if (a == 0 || a == 1){
                    System.out.println("The factorial of "+a+ " is 1");
                }
                for (int i = 1;i<=a;i++){
                    fact = fact*i;
                }
                System.out.println("The factorial of "+a+ " is: "+fact);
            }
            case "LOGARITHM" -> System.out.println("The log of "+a+" to the base 2 is: "+Math.log(Math.max(a, b)));
        }
    }
    public static void main(String[] args) {
        arithematicOperations(2,3,"sum");
        arithematicOperations(2,3,"difference");
        arithematicOperations(2,3,"product");
        arithematicOperations(2,3,"quotient");
        arithematicOperations(2,3,"remainder");
        arithematicOperations(2,3,"power");
        arithematicOperations(2,3,"squareroot");
        arithematicOperations(2,3,"cuberoot");
        arithematicOperations(2,3,"factorial");
        arithematicOperations(2,3,"logarithm");
    }
}
