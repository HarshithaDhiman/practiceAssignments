package practiceAssignments.whileLoopAssignments_4;

public class FrequencyOfEachCharacter {
    public static void main(String[] args) {
        String name = "Harshtiha";
        int i = 0; boolean[] b = new boolean[name.length()];
        while (i < name.length()) {
            int count = 1;
            if (b[i]) { //{false, false, false, false, false, false, false, true, true}
                i++;
                continue;
            }
            for (int j = i+1;j<name.length();j++) {
                if (name.charAt(i) == name.charAt(j)){
                    count += 1;
                    b[j] = true;
                }
            }
            System.out.println(name.charAt(i)+": "+count);
            i++;
        }
    }
}
