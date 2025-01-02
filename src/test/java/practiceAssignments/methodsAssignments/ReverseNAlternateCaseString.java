package practiceAssignments.methodsAssignments;

public class ReverseNAlternateCaseString {
    static void reverseString(String str) {
        String str1="", str2="";
        for (int i=str.length()-1;i>=0;i--){
            str1 += str.charAt(i);
        }
        System.out.println(str1);
        for (int i=0;i<str1.length();i++){
            if(i%2==0) {
                str2 += Character.toString(str1.charAt(i)).toUpperCase();
            } else {
                str2 += Character.toString(str1.charAt(i)).toLowerCase();
            }
        }
        System.out.println(str2);
    }
    public static void main(String[] args) {
        String str = "helloWORLD",str1="",str2="";//"ETAdYRIPXeSAhGNIHTYREVe";
        reverseString(str);
    }
}
