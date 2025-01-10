/**/
package practiceAssignments.arrayAssignment.oneDArray;

import java.util.Arrays;

public class RotateKElements {
    public static void rotate(int[] array, int k){
        int[] modified = new int[array.length];
        int temp = k, n = k;
        for (int i=array.length-1;i>=temp;i--){//i=4;i=3;i=2;i=1
            modified[i] = array[temp];//m[4]=3;m[3]=2;m[2]=1;
            temp--;//k=1;k=0;k=-1
            if (temp<0)
                break;
        }
        for(int j=0;j<array.length-(n+1);j++){//j=0;j=1;j=2
            modified[j]=array[k+1];//m[0]=array[3]=4;m[1]=array[4]=5
            k++;//k=3;k=4
        }
        System.out.println(Arrays.toString(modified));
    }
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6};
        int k = 2;
        rotate(array,k);
    }
}
