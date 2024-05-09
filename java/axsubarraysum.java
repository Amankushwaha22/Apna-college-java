public class Maxsubarraysum {
    public static void maxsubarray(int numbers[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                currsum = 0;
                for (int k = i; k <= j; k++) {
                    currsum += numbers[k];
                }
                System.out.println(currsum);
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("max sum " + maxsum);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
        maxsubarray(numbers[]);
    }
}
