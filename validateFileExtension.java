public class Day2Problem3 {
    public static String validateFileExtension(String filename) {
        int dotIndex = filename.lastIndexOf('.');
        if (dotIndex == -1) {
            return "Rejected — invalid file type";
        }
        String ext = filename.substring(dotIndex + 1).toLowerCase();
        if (ext.equals("pdf") || ext.equals("docx") || ext.equals("zip")) {
            return "Accepted";
        }
        return "Rejected — invalid file type";
    }
}