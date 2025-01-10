package practiceAssignments.arrayAssignment.oneDArray;

import java.util.Arrays;

public class ArrayOutputBasedQuestions {
    public static void main(String[] args) {
        int arr1[] = {1,4,3,2};
        int[] arr2 = arr1;
        arr2[2]=10;
        System.out.println(Arrays.toString(arr1));

        int[] arr3 = {1, 2, 3, 4};
        for (int val: arr3){
            val = val*2;
            System.out.print(val+"\t");
        }
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = {1,2,3,4,5,6};
        for (int i = 0,j=arr4.length-1;i<j;i += 2, j -= 2){
            int temp = arr4[i];
            arr4[i] = arr4[j];
            arr4[j] = temp;
        }
        System.out.println(Arrays.toString(arr4));

        int[] arr5 = {1, 2, 3, 4};
        int[] prefixSum = new int[arr5.length];//prefixSum len is 4
        prefixSum[0] = arr5[0];//prefixSum[0] = 1
        for (int i = 1; i<arr5.length; i++){
            prefixSum[i] = prefixSum[i-1]+arr5[i];//prefixSum[1]=1+2=3 prefixSum[2]=3+3=6
            //prefixSum[3]=6+4=10
        }
        System.out.println(Arrays.toString(prefixSum));
    }
}
