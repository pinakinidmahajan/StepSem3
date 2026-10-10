import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext()) return;
        String word = sc.next();
        StringBuilder sb = new StringBuilder(word);
        String reversed = sb.reverse().toString();
        if (word.equals(reversed)) {
            System.out.println(word + " - palindrome");
        } else {
            System.out.println(reversed + " - not a palindrome");
        }
    }
}