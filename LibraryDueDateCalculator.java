import java.time.LocalDate;
import java.util.Scanner;

public class LibraryDueDateCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        sc.nextLine();

        LocalDate baseDate = LocalDate.of(2023, 10, 26);

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();
            int spaceIdx = line.indexOf(' ');
            String itemType = line.substring(0, spaceIdx);
            String title = line.substring(spaceIdx + 1).replace("\"", "");

            int days = 0;
            if (itemType.equals("BOOK")) {
                days = 14;
            } else if (itemType.equals("DVD")) {
                days = 7;
            } else if (itemType.equals("MAGAZINE")) {
                days = 3;
            }

            LocalDate dueDate = baseDate.plusDays(days);
            System.out.println(title + ": " + dueDate);
        }

        sc.close();
    }
}