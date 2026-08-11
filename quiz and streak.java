import java.util.*;

public class QuizStreak {
    static int totalXp = 0;
    static int streak = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Issen: Quiz & Streak ===");

        String[][] quiz = {
            {"What does 'break the ice' mean?", "to start a conversation"},
            {"Fill blank: I need to ___ base with my manager.", "touch"},
        };

        for (String[] q : quiz) {
            System.out.println("\n" + q[0]);
            System.out.print("Your answer: ");
            String ans = sc.nextLine().trim().toLowerCase();

            if (ans.equals(q[1])) {
                totalXp += 10;
                streak++;
                System.out.println("Correct! +10 XP");
            } else {
                System.out.println("Incorrect. Correct answer: " + q[1]);
            }
        }

        int level = 1 + totalXp / 20;
        System.out.println("\nTotal XP: " + totalXp);
        System.out.println("Level: " + level);
        System.out.println("Streak: " + streak + " correct in a row");
    }
}
