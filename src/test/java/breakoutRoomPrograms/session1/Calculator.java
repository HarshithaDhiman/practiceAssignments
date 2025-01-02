package breakoutRoomPrograms.session1;

class Operations {
    public void add(int a, int b) {
        System.out.println("The sum of given two numbers is: "+(a+b));
    }
    public void subtract(int a, int b) {
        if(a > b) {
            System.out.println("The difference of given two numbers is: "+(a - b));
        } else {
            System.out.println("The difference of given two numbers is: "+(b - a));
        }
    }
    public void multiply(int a, int b) {
        System.out.println("The product of given two numbers is: "+(a*b));
    }
    public void divide(int a, int b) {
        if(a > b) {
            System.out.println("The quotient of given two numbers is: "+(a/b));
        } else {
            System.out.println("The quotient of given two numbers is: "+(b/a));
        }
    }
    public void remainder(int a, int b) {
        System.out.println("The remainder of given two numbers is: "+(a%b));
    }
    public void power(int a, int b) {
        System.out.println(a+" to the power of "+b+" is: "+ Math.pow(a,b));
    }
    public void squareRoot(int a) {
        System.out.println("The square root of "+a+" is: "+ Math.sqrt(a));
    }
    public void cubeRoot(int a) {
        System.out.println("The cube root of "+a+" is: "+ Math.cbrt(a));
    }
    public void factorial(int n) {
        int fact = 1;
        if(n == 0 || n == 1) {
            System.out.println("The factorial of "+n+ " is: 1");
        } else if (n < 0) {
            System.out.println("There is no factorial for negative numbers");
        } else {
            for (int i = 1; i<=n;i++) {
                fact = fact*i;
            }
            System.out.println("The factorial of "+n+ " is: "+fact);
        }
    }
    public void logarithm(int n) {
        System.out.println(Math.log10(n));
    }
}

public class Calculator {
    public static void main(String[] args) {
        Operations op = new Operations();
        op.add(12,3);
        op.subtract(12,3);
        op.multiply(12,3);
        op.divide(12,3);
        op.remainder(12, 3);
        op.power(2,3);
        op.squareRoot(16);
        op.cubeRoot(27);
        op.factorial(-1);
        op.logarithm(2);
    }
}
