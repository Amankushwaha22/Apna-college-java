import java.util.Arrays;

public class InbuiltSort {
    public static void main(String[] args) {
       int arr[] = {5,4,6,3,2,8};
        Arrays.sort(arr,0,2);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


        int arr1[] = {5,1,5,6,2,4,6,4,6,3,2,8};
        Arrays.sort(arr1);
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        } 
}
}
