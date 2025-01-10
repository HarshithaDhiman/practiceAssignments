package practiceAssignments.ternaryOperatorAssignments_8;

public class Assignment3 {
    public static void main(String[] args) {
        String s1 = "apple", s2 = "banana", s3 = "cherry";
        System.out.println(s1.charAt(0)<s2.charAt(0)?(s1.charAt(0)<s3.charAt(0)?"s1 starts first":"s3 starts first"):(s2.charAt(0)<s3.charAt(0))?"s2 starts first":"s3 starts first");
    }
}
