import java.util.Scanner;

public class insertionSort {
    public static void sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            while (prev>=0&&arr[prev]>curr) {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);                                   
        // System.out.println("Enter Array size:");
        // int n = sc.nextInt();
        // int arr[]=new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }
        int arr[] = {5,4,3,2,1};
        sort(arr);
    }
}
