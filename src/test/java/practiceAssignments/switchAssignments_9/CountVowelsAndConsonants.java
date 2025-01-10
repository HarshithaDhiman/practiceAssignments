package practiceAssignments.switchAssignments_9;

import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        String str;int consonantsCount = 0,vowelsCount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to count vowels and consonants: ");
        str = sc.next();
        for (int i=0;i<str.length();i++){
            switch (str.toLowerCase().charAt(i)){
                case'a' -> {
                    vowelsCount += 1;
                    continue;
                }
                case'e' -> {
                    vowelsCount += 1;
                    continue;
                }
                case'i' -> {
                    vowelsCount += 1;
                    continue;
                }
                case'o' -> {
                    vowelsCount += 1;
                    continue;
                }
                case'u' -> {
                    vowelsCount += 1;
                    continue;
                }
                default -> {
                    consonantsCount += 1;
                    continue;
                }
            }
        }
        System.out.println("vowels in the string: "+vowelsCount);
        System.out.println("consonants in the string: "+consonantsCount);
    }
}