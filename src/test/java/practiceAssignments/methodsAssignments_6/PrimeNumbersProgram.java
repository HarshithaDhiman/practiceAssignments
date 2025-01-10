package practiceAssignments.methodsAssignments_6;

public class PrimeNumbersProgram {
    static void checkPrime(int num) {
        boolean flag=false;
        if (num == 0 || num==1)
            System.out.println(num+" is not a prime number");
        else {
            for (int i=2;i<num;i++){
                if (num%i==0) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.println(num+" is a prime number");
            else
                System.out.println(num+" is not a prime number");
        }
    }
    static void rangeOfPrimeNumbers(int range) {
        boolean flag = false;
        for (int i=2;i<range;i++) { //i=2,3,4,5
            if (i==2) {
                System.out.print(i+", ");
                continue;
            }
            for (int j=2;j<i;j++) {//j=2,2<3; j=2,2<4; j=2,2<5
                if (i%j==0) { //3%2; 4%2; 5%2,5%3,5%4;
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.print(i+", ");
            flag = false;
        }
        System.out.println("are prime numbers under "+range);
    }
    public static void main(String[] args) {
        checkPrime(3);
        rangeOfPrimeNumbers(20);
    }
}