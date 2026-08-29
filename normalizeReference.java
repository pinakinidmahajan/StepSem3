public class Day2Problem5 {
    public static String normalizeReference(String raw) {
        String trimmed = raw.trim();
        return trimmed.substring(0, 3).toUpperCase() + trimmed.substring(3);
    }

    public static String validateAndFormat(String reference) {
        if (reference.length() != 14) {
            return "Invalid: wrong length";
        }
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(reference.charAt(i))) {
                return "Invalid: bank code must be 3 letters";
            }
        }
        for (int i = 3; i < 14; i++) {
            if (!Character.isDigit(reference.charAt(i))) {
                return "Invalid: non-digit body";
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(reference.substring(0, 3)).append("] DATE: ")
          .append(reference.substring(3, 5)).append("/").append(reference.substring(5, 7)).append("/").append(reference.substring(7, 9))
          .append(" | SEQ: ").append(reference.substring(9));
        return sb.toString();
    }
}