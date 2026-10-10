import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        while (sc.hasNext()) {
            String token = sc.next().replaceAll("[^0-9-]", "");
            if (!token.isEmpty()) {
                int num = Integer.parseInt(token);
                if (num % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}