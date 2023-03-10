import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n, first = 0, second = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n");
        n = scanner.nextInt();
        System.out.print("Fibonacci Series upto" + n + " numbers is:");
        for (int i = 1; i <= n; ++i) {
            System.out.print(first + ", ");
            int sum = first + second;
            first = second;
            second = sum;
        }
        scanner.close();
    }
}