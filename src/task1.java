public class task1 {

    public static String generatePattern(int n) {
        StringBuilder pattern = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                pattern.append("+");
            } else {
                pattern.append("-");
            }
        }

        return pattern.toString();
    }

    public static void main(String[] args) {
        // Example usage:
        int n1 = 5;
        int n2 = 8;

        String pattern1 = generatePattern(n1);
        String pattern2 = generatePattern(n2);

        System.out.println("Pattern for n=" + n1 + ": " + pattern1);
        System.out.println("Pattern for n=" + n2 + ": " + pattern2);

    }
}
