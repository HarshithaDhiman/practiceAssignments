package practiceAssignments.methodsAssignments;

public class ReverseNumberProgram {
    static void numberReverse(int num) {
        int rev=0, remainder;
        while(num!=0) {
            remainder = num%10; //rem=3,2,1
            rev = rev*10+remainder; //rev=3, 321
            num = num/10; //num=12,1,0
        }
        System.out.println(rev);
    }
    public static void main(String[] args) {
        int number;
        numberReverse(678);
    }
}