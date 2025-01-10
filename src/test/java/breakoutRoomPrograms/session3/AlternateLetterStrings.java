package breakoutRoomPrograms.session3;/*Merge Two Strings Alternatively:
String a="jskg"
String b="kiop"
Output: "jksikogp"
If the lengths of the string are not same then the remaining characters should be appended at the end
package breakoutRoomPrograms.session3;*/

public class AlternateLetterStrings {
    public static void main(String[] args) {
        String a = "aceg", b = "bdfhij";
        StringBuffer sb = new StringBuffer(); StringBuffer sb1 = new StringBuffer();
        int firstCounter=0,secondCounter=0, count1 = 0, count2 = 0;
        while (firstCounter<a.length()&&secondCounter<b.length()){
            sb.append(a.charAt(firstCounter++));
            sb.append(b.charAt(secondCounter++));
        }
        while (firstCounter<a.length()){
            sb.append(a.charAt(firstCounter++));
        }
        while (secondCounter<b.length()){
            sb.append(b.charAt(secondCounter++));
        }
        System.out.println(sb);
        if(a.length()==b.length()) {
            for (int i = 0; i < a.length(); i++) {
                sb1.append(Character.toString(a.charAt(i)) + Character.toString(b.charAt(i)));
            }
        }
        else {
            while (count1<a.length()){
                sb1.append(a.charAt(count1));
                sb1.append(b.charAt(count1));
                count1++;
            }
            while (count2<b.length()){
                sb1.append(b.charAt(count2++));
            }
        }
        System.out.println("sb: "+sb);
        System.out.println("sb1: "+sb1);
    }
}