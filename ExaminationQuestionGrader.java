import java.util.Scanner;

public class ExaminationQuestionGrader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        sc.nextLine();

        double overallScore = 0.0;

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();
            String[] parts = line.split("\"");

            String questionType = parts[0].trim();
            String correctAnswer = parts[3];
            String studentAnswer = parts[5];
            double points = Double.parseDouble(parts[6].trim());

            double score = 0.0;

            if (questionType.equals("MCQ") || questionType.equals("TF")) {
                if (studentAnswer.equalsIgnoreCase(correctAnswer)) {
                    score = points;
                }
            } else if (questionType.equals("ESSAY")) {
                String[] keywords = correctAnswer.split(",");
                int matchCount = 0;
                String lowerStudentAns = studentAnswer.toLowerCase();

                for (String kw : keywords) {
                    if (lowerStudentAns.contains(kw.trim().toLowerCase())) {
                        matchCount++;
                    }
                }

                if (matchCount >= 2) {
                    score = points * 0.75;
                } else if (matchCount == 1) {
                    score = points * 0.50;
                }
            }

            System.out.printf("%s: %.2f\n", questionType, score);
            overallScore += score;
        }

        System.out.printf("Total Score: %.2f\n", overallScore);
        sc.close();
    }
}