public class printSubarrays {
    public static void subarr(int numbers[]) {
    for(int i=0;i<numbers.length;i++){
        for(int j=i;j<numbers.length;j++){
            for(int k=i;k<=j;k++){
                System.out.print(numbers[i]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
public static void main(String[] args) {
    int numbers[]={2,4,6,3,5,7};
    subarr(numbers);
}
}
