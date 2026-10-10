import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String name = sc.next();
            String line = sc.nextLine();
            line = line.replaceAll("[^0-9 ]", "").trim();
            String[] parts = line.split("\\s+");
            double sum = 0;
            for (String p : parts) {
                if (!p.isEmpty()) {
                    sum += Double.parseDouble(p);
                }
            }
            double avg = sum / parts.length;
            char grade = 'F';
            if (avg >= 75) {
                grade = 'B';
            } else if (avg >= 40 && avg <= 59) {
                grade = 'D';
            } else if (avg >= 60) {
                grade = 'C';
            } else if (avg >= 90) {
                grade = 'A';
            }
            System.out.printf("%s: Average %.1f, Grade %c\n", name.toUpperCase(), avg, grade);
        }
    }
}