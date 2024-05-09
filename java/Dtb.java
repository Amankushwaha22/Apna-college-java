public class Dtb {
    public static void decTobin(int n) {
        // int mynum = n;
        int pow = 0;
        int binnum = 0;
        while (n > 0) {
            int lastdigit = n % 2;
            binnum = binnum + (lastdigit * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println(binnum);
    }

    public static void main(String[] args) {
        decTobin(17);
    }
}
