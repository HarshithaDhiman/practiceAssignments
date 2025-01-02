package practiceAssignments.whileLoopAssignments;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Harshitha", reverse = "";
        int i = str.length()-1;
        while(i >=0) {
            reverse = reverse + str.charAt(i);
            i--;
        }
        System.out.print(reverse+"\t");
    }
}
