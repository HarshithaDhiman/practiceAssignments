package practiceAssignments.javaAssignments;

public class ConditionalStatementsAssignments {
    public static void main(String[] args) {
        int a1 = 10, b1 = 20, c1 = 5;
        String result1 = "";

        if (a1 + b1 > c1 * 5) { //30 > 25
            result1 = "Condition 1";
        } else if (a1 * 2 < b1 / 2) { //20 < 10
            result1 = "Condition 2";
        } else if ((a1 + b1 + c1) % 3 == 0) { //5 == 0
            result1 = "Condition 3";
        } else {
            result1 = "No Condition Met";
        }
        System.out.println(result1); //Condition 1

        int x1 = 15, y1 = 30, z1 = 10;
        String result2 = "";
        if (x1 * y1 - z1 > 100) { //450 >100
            if (y1 / x1 + z1 == 12) { // 12==12
                result2 = "Nested True";
            } else {
                result2 = "Inner Else";
            }
        } else if (z1 * 2 < x1) { //20 < 15
            result2 = "Else-If block";
        } else {
            result2 = "Outer Else";
        }
        System.out.println(result2); //Nested True

        String str1 = "hello", str2 = "Hello", result3 = "";
        if (str1.equals(str2)) { //not equal
            result3 = "Equal Method";
        } else if (str1.equalsIgnoreCase(str2)) {
            result3 = "IgnoreCaseEqual Method";
        } else if (str1.length() > str2.length() || str2.charAt(0) == 'H') {
            result3 = "Length of First char";
        } else {
            result3 = "No Match";
        }
        System.out.println(result3); //IgnoreCaseEqual Method

        int a2 = 6, b2 = 1, c2 = 10;
        String result4 = "";
        if (a2 * b2 % c2 == 0 && (a2 + c2 > b2)) { //6 == 0 and 16>1
            result4 = "Condition 1";
        } else if (b2 / a2 - c2 < 5 || b2 % a2 == 1) { // -10 < 5 Or 1 == 1
            result4 = "Condition 2";
        } else if (c2 - b2 + a2 > 0) { //25 > 0
            result4 = "Condition 3";
        } else {
            result4 = "Condition 4";
        }
        System.out.println(result4); // Condition 2

        String str3 = "CodingChallenge";
        int len = str3.length(); //15
        String result5 = "";
        if (len > 10 && str3.startsWith("Coding")) { //15 > 10 and true
            if (str3.substring(6, 9).equals("Cha")) {
                result5 = "Perfect Match";
            } else {
                result5 = "Partial Match";
            }
        } else if (str3.endsWith("ge") && len % 2 == 0) {
            result5 = "Ends with 'ge' and Even length";
        } else {
            result5 = "No Match Found";
        }
        System.out.println(result5);//Perfect Match

        String str4 = "Complex123";
        boolean result6 = (str4.length()*2-5) > 10 || (str4.indexOf("123")%3==0 && str4.substring(3).contains("m"));
        //15 > 10 or false
        System.out.println(result6); //true

        String str5 = "Challenge", result7 = "";
        int length = str5.length(); //9
        //System.out.println(str5.charAt(1)-1); h = 104, 103 is final ans
        for (int i = 0; i < length; i++){
            if ((length+i)%2 == 0){
                result7 += (char)(str5.charAt(i)-1);
            } else if ((length-i)%3==0) {
                result7 += "*";
            }else {
                result7 += str5.charAt(i);
            }
        } //
        System.out.println(result7);

        String str6 = "Programming", result8 = "";
        for (int i = 0; i<str6.length(); i++){
            if ((str6.charAt(i)+i)%3 == 0) {
                result8 += str6.charAt(i);
            } else if (i%2 == 0) {
                result8 += (char)(str6.charAt(i)-1);
            } else {
                result8 += (char)(str6.charAt(i)+1);
            }
        }
        System.out.println(result8);

        String str7 = "Reflection", result9 = "";
        for(int i = str7.length()-1; i >= 0;i--) {
            if((str7.charAt(i)+i)%2 == 0) {
                result9 += (char)(str7.charAt(i)+1);
            } else {
                result9 += str7.charAt(i);
            }
        }
        System.out.println(result9); //nojudelgfS

        int x = 10, y = 20;
        if (x > 5 || ++y > 25) {
            System.out.println("X: "+x+", Y: "+y); //10, 20
        }

        String word = "Encapsulation", result10="";
        int length1 = word.length(); //13
        for (int i = 1; i < length1/2; i++) { //1 to 6 ncaps
            result10 += word.substring(i-1, i).toUpperCase();
            if ((length1*i)%5 == 0){
                result10 += (char)(word.charAt(length1-1)+2);
            }
        }
        System.out.println(result10); //ENCAPp
    }
}
