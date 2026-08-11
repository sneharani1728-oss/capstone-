import java.util.*;

public class PronunciationChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Issen: Pronunciation Checker ===");

        System.out.print("Target phrase: ");
        String target = sc.nextLine().trim();

        System.out.print("Your spoken attempt (typed as text): ");
        String attempt = sc.nextLine().trim();

        double accuracy = calculateAccuracy(target, attempt);
        System.out.printf("Accuracy: %.2f%%\n", accuracy);
        System.out.println("Feedback: " + getFeedback(accuracy));
    }

    static double calculateAccuracy(String target, String attempt) {
        target = target.toLowerCase();
        attempt = attempt.toLowerCase();
        int distance = levenshtein(target, attempt);
        int maxLen = Math.max(target.length(), attempt.length());
        if (maxLen == 0) return 100.0;
        return Math.max(0, (1.0 - (double) distance / maxLen) * 100.0);
    }

    static int levenshtein(String a, String b) {
        int[][] dp = new int[a.length() + 1][b.length() + 1];
        for (int i = 0; i <= a.length(); i++)
            for (int j = 0; j <= b.length(); j++) {
                if (i == 0) dp[i][j] = j;
                else if (j == 0) dp[i][j] = i;
                else dp[i][j] = Math.min(
                    dp[i-1][j-1] + (a.charAt(i-1) == b.charAt(j-1) ? 0 : 1),
                    Math.min(dp[i-1][j] + 1, dp[i][j-1] + 1));
            }
        return dp[a.length()][b.length()];
    }

    static String getFeedback(double acc) {
        if (acc >= 90) return "Excellent! Native-like.";
        if (acc >= 70) return "Good, work on rhythm.";
        if (acc >= 50) return "Decent, slow down and enunciate.";
        return "Keep practicing!";
    }
}
