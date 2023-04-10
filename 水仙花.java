public class 水仙花 {
    public static void main(String[] args) {

        for (int num = 100; num < 1000; num++) {
            int a = num % 10;
            int b = num / 10 % 10;
            int c = num / 100 % 10;
            if (num == Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)) {
                System.out.print(num + " ");
            }
        }
    }
}














