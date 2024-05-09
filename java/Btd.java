public class Btd {
    public static void binTodec(int n) {
        //int mynum = n;
        int pow = 0;
        int decnum = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            decnum = decnum + (lastdigit * (int) Math.pow(2, pow));
            pow++;
            n = n / 10;
        }
        System.out.println(decnum);
    }

    public static void main(String[] args) {
        binTodec(1101);
    }
}
