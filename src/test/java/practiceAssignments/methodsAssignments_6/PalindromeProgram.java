package practiceAssignments.methodsAssignments;

public class PalindromeProgram {
    static void checkPalindrome(String str) {
        String str1="";
        for (int i=str.length()-1;i>=0;i--) {
            str1 += str.charAt(i);
        }
        if(str.equals(str1)) {
            System.out.println("The given string is a palindrome");
        } else {
            System.out.println("The given string is not a palindrome");
        }
    }
    public static void main(String[] args) {
        String str = "Madam";
        str = str.toLowerCase();
        checkPalindrome(str);
    }
}