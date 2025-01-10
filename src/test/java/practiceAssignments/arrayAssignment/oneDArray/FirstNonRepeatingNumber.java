package practiceAssignments.arrayAssignment.oneDArray;

import java.util.Arrays;

public class FirstNonRepeatingNumber {
    public static int nonrepeatingNumber(int[] arr){ //{4,5,4,5,3,2,3}
        boolean[] setValue = new boolean[arr.length];int val = 0;
        Arrays.fill(setValue,false);
        for (int i=0;i<arr.length;i++){//4;5;4;5;3;2
            if (setValue[i]==true){
                continue;
            }
            for (int j = i+1;j<arr.length;j++){//5,4; 4,5; -;-;2,3; -
                if (arr[i]==arr[j]){
                    setValue[j]=true;//{false,false,true,true,false,false,true}
                    break;
                }
            }
            val = arr[i];
        }
        return val;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,4,5,3,2,3};
        System.out.println(nonrepeatingNumber(arr));
    }
}