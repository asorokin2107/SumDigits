import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = new Scanner(System.in).nextInt();
        sumDigits(num);
    }

    public static void sumDigits(Integer num) {
        String str = Integer.toString(num);
        int a = Integer.parseInt(str);
        int sum = 0;
        while (a > 0) {
            sum = sum + a % 10;
            a = a / 10;

        }
        System.out.println(sum);

    }



}
