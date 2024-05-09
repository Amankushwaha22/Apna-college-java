public class SelectionSort {
    public static void sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            // int mnpas = i;
            for(int j=i+1;j<arr.length;j++){
            //     if(arr[mnpas]>arr[j]){
            //         mnpas=j;
            //     }
            // }
            // int temp=arr[mnpas];
            // arr[mnpas]=arr[i];
            // arr[i]=temp;
            
            if(arr[i]>arr[j]){
                int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
            }
        }
    }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={5,3,4,84,1,23};
        sort(arr);
    }
    }

