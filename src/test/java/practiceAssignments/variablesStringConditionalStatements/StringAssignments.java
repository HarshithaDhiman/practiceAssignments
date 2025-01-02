package practiceAssignments.variablesStringConditionalStatements;

public class StringAssignments {
    public static void main(String[] args) {
        String str1 = " abcde". repeat(100);
        System.out.println(str1);

        String str2 = "Counting characters in a string.";
        System.out.println("Character at index 10 is: "+str2.charAt(10));

        String str3 = "HelloWorld", str4 = str3.substring(5), str5 = "World";
        System.out.println(STR."'\{str4}'");
        System.out.println("Both the strings are equal: "+(str4==str5));
        System.out.println(str4.equals(str5));

        String str6 ="concatenate";
        str6 = str6.substring(3,8).concat(str6.substring(1,4)).concat(str6.substring(0,2));
        System.out.println(str6);

        String s7 = "hellojava";
        int index = s7.indexOf("java");
        System.out.println(s7.substring(index));

        String s8="Welcome";
        System.out.println(s8.substring(0,0).isEmpty());
        System.out.println(s8.substring(0,0).isBlank());

        String s9 = "immutable";
        s9 = s9.substring(5).concat(s9.substring(0,5).replace('i','l'));
        System.out.println("s9 value now: "+s9);

        String s10 = "abababa";
        int count = s10.length()-s10.replaceAll("aba","").length();
        System.out.println("s10 length now: "+count);

        String s11 = "abcdefgh";
        s11 = s11.substring(2,6).concat(s11.substring(6)).replace("e","x").replace("c","Y");
        System.out.println("s11 value now: "+s11);

        String s12 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. ".repeat(5);
        System.out.println("s12 char at 120: "+s12.charAt(120));

        String s13 ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int randomIndex = (int)(Math.random()*s13.length());
        System.out.println("Random Index: "+randomIndex+" Char at randomindex: "+s13.charAt(randomIndex));

        String s14 = "Hello, "; String s15 = "World! Welcome to Java programming";
        String combined = s14 + s15;
        System.out.println(combined.charAt(13)); //prints space

        String s16 = "Java", s17 = null;
        String joinString = String.join("-", s16, s17);
        System.out.println("Joined String: "+joinString);

        String s18 = "Very long string loaded from a file...";
        //System.out.println(s18.charAt(100)); StringIndexOutOfBoundsException

        String s19 = "Hello\nWorld\tJava"; //here next line is considered as one char
        System.out.println("String value: "+s19+"\nString Char at 6: "+s19.charAt(6));

        String s20 = new String("Hello");
        String s21 = new String("Hello");
        String s22 = "World", s23 = "World";
        System.out.println("equals method: "+s20.equals(s21));
        System.out.println("== method: "+ (s20==s21));
        System.out.println("equals method: "+s22.equals(s23));
        System.out.println("== method: "+ (s22==s23));

        String s24 = "Hello", s25 = s24;
        s24 = "World";
        System.out.println(s25); //Hello

        String s26 = "abcdef";
        s26 = s26.replace('a','A').substring(1,4);
        System.out.println("s26: "+s26);

        String s27 = " Java Programming ";
        System.out.println(s27.trim().toUpperCase().substring(0,4)); //JAVA

        String[] words = {"Java","is","fun"};
        System.out.println(String.join("", words));

        String s28 = "123";
        int num = Integer.parseInt(s28);
        System.out.println(num == 123); //true

        String s29 = "Mississippi";
        int countafterreplace = s29.length()-s29.replace("s","").length();
        System.out.println("Length After Replace: "+countafterreplace);//4

        String s30 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i<s30.length();i += 5){
            System.out.print(s30.charAt(i)+" ");
        }
        System.out.println();

        String s31 = "The quick brown fox jumps over the lazy dog.";
        int indexValue = s31.indexOf('j')+2;//22
        System.out.println("index: "+indexValue+"Char at index: "+s31.charAt(indexValue));//m

        String s32 = "Java";
        s32.replace('J','K');
        System.out.println(s32);
        System.out.println(s32.replace('J','K'));

        String s33 = " OpenAI";
        String result = s33.trim();
        System.out.println("result: ["+ result +"]");//[OpenAI]
        System.out.println(result.length());//8

        String s34 = "HelloHelloHello";
        System.out.println("Index: "+s34.indexOf("lo",5));//8

        String s35 = "JavaJavaJava";
        System.out.println(s35.indexOf("java"));//-1
        System.out.println(s35.toLowerCase().indexOf("java"));//0

        String s36 = "abcdefgh";
        String s36a = s36.substring(2, 5); // cde
        String s36b = "cde";
        System.out.println("== method: "+(s36a == s36b)); //false
        System.out.println("equals method: "+s36a.equals(s36b)); //true

        String s37 = "Java";
        String s38 = "Programming";
        System.out.println(s37+" "+s38); //Java Programming
    }
}