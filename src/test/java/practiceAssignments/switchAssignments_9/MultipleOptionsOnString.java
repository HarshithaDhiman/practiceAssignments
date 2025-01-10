package practiceAssignments.switchAssignments_9;

import java.util.*;

public class MultipleOptionsOnString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String str = sc.next(); str = str.toLowerCase();
        int option,vowelsCount=0;
        System.out.println("Choose option:\n1.Reverse String and count Vowels\n2.Convert all vowels to Uppercase and cosonants to lowercase" +
                "\n3.Count occurences of each character and print them in descending order");
        option = sc.nextInt();
        switch (option){
            case 1->{
                for (int i =str.length()-1;i>=0;i--){
                    System.out.print(str.charAt(i));
                    if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
                        vowelsCount++;
                }
                System.out.print("\nThe vowels in the string are: "+vowelsCount);
            }
            case 2->{
                for (int i = 0;i<str.length();i++){
                    if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
                        System.out.print(Character.toString(str.charAt(i)).toUpperCase());
                    else
                        System.out.print(Character.toString(str.charAt(i)).toLowerCase());
                }
                System.out.println();
            }
            case 3->{
                int i = 0; boolean[] chars=new boolean[str.length()];
                HashMap<Character,Integer> mapLetterFrequency = new HashMap<Character, Integer>();
                while (i < str.length()){
                    int count = 1;//harshitha
                    if (chars[i]) {
                        i++;
                        continue;
                    }
                    for (int j=i+1;j<str.length();j++){
                        if (str.charAt(i)==str.charAt(j)){
                            count++;
                            chars[j] = true;
                        }
                    }
                    System.out.print(str.charAt(i)+"-"+count+"\t");
                    mapLetterFrequency.put(str.charAt(i),count);
                    i++;
                }
                Set<Map.Entry<Character,Integer>> setletterFrequency = mapLetterFrequency.entrySet();
                List<Map.Entry<Character,Integer>> listLetterFrequency = new ArrayList<Map.Entry<Character, Integer>>();
                listLetterFrequency.addAll(setletterFrequency);
                Collections.sort(listLetterFrequency, new Comparator<Map.Entry<Character, Integer>>() {
                    @Override
                    public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                        return o2.getValue().compareTo(o1.getValue());
                    }
                });
                System.out.println("\nAfter Sorting in descending order according to the frequency of occurence of characters");
                for (Map.Entry<Character,Integer>entry:listLetterFrequency){
                    System.out.print(entry.getKey()+"-"+entry.getValue()+"\t");
                }
            }
        }
    }
}