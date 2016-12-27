import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jumlah fibonacci ke: ");
        int n = scanner.nextInt();
        System.out.println(sum(n));
    }

    public static long fib(int n) {
        if (n == 0 || n == 1){
            return 1;
        }
        else {
            return fib (n-1) + fib (n-2);
        }
    }

    public static long sum(int n) {
        if (n == 0){
            return fib(0);
        }
        else {
            return sum(n - 1) + fib(n);
        }
    }
}
