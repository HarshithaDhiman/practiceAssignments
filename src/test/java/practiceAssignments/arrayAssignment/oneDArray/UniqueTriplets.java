package practiceAssignments.arrayAssignment.oneDArray;

import java.util.Arrays;

public class UniqueTriplets {
    public static int[] findTripletsToTargetSum(int[] arr, int targetSum){
        int[] tripletArr = new int[0]; boolean flag = false;//{1,2,3,4}
        for (int i=0;i<arr.length;i++){
            for (int j = i+1;j<arr.length;j++){
                for (int k = j+1;k<arr.length;k++){
                    if (arr[i]+arr[j]+arr[k] == targetSum){
                        tripletArr = new int[]{arr[i], arr[j], arr[k]};
                        System.out.println(Arrays.toString(tripletArr));
                        flag = true;
                    }
                }
            }
        }
        if (flag==false){
            System.out.println("No triplets exists which matches the target sum");
        }
        return tripletArr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        findTripletsToTargetSum(arr,8);
    }
}