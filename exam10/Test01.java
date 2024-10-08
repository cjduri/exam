import java.util.Scanner;

public class Test01 {
    static int sumUp(int n) {
        int sum = 0;
        for(int i=0; i<=n; i++)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 x까지의 합을 구하자.");
        int x;
        do {
            System.out.print("x의 값:");
            x = stdIn.nextInt();
        } while (x <= 0);

        System.out.print("1부터 " + x + "까지의 합은 " + sumUp(x) + "입니다.");
    }
}
