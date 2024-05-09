import java.util.Arrays;
// import java.util.Collection;
import java.util.Collections;

public class ReverseArray {
    public static void main(String[] args) {
        Integer arr[] = {5,4,6,3,2,8};
        Arrays.sort(arr,0,2,Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        Integer arr1[] = {5,1,5,6,2,4,6,4,6,3,2,8};
        Arrays.sort(arr1,Collections.reverseOrder());
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        } 
    }
}
