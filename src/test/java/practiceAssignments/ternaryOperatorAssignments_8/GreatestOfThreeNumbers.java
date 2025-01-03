package practiceAssignments.ternaryOperatorAssignments;

public class GreatestOfThreeNumbers {
    public static void largestNumber(int a, int b, int c) {
        if(a>b && a>c) {
            System.out.println(a+"  is largest");
        } else if (b>c) {
            System.out.println(b+"  is largest");
        } else {
            System.out.println(c+"  is the largest");
        }
    }
    public static void main(String[] args) {
        int a = 10,b = 12, c = 6;
        int largest = (a>b)?(a>c?a:b):(b>c?b:c);
        System.out.println(largest);
        largestNumber(a,b,c);
    }
}