import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan n: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.print(i + " ");
        }
    }
}