package practiceAssignments.javaAssignments;

public class LengthOfTheStringWithoutLenFunction {
    public static void main(String[] args) {
        String str = "Harshitha ";
        int i = 0, counter = 0;
        while(str.charAt(i)!= ' ') {
            counter++;
            System.out.println(str.charAt(i));
            i++;
        }
        System.out.println("The length of the String is: "+counter);
    }
}
