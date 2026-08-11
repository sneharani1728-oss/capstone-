import java.util.*;

public class ConversationSimulator {
    static Map<String, String[]> scenarios = new HashMap<>();

    public static void main(String[] args) {
        scenarios.put("interview", new String[]{
            "Tell me about yourself.",
            "What are your strengths?",
            "Why do you want this job?"
        });
        scenarios.put("food", new String[]{
            "What would you like to order?",
            "Anything to drink?",
            "For here or to go?"
        });

        Scanner sc = new Scanner(System.in);
        System.out.println("=== Issen: Conversation Simulator ===");
        System.out.println("Choose scenario (interview/food): ");
        String choice = sc.nextLine().trim().toLowerCase();

        String[] prompts = scenarios.getOrDefault(choice, scenarios.get("food"));

        for (String prompt : prompts) {
            System.out.println("\nBot: " + prompt);
            System.out.print("You: ");
            String userReply = sc.nextLine();
            String correction = checkGrammar(userReply);
            if (correction != null) System.out.println("[Tip] " + correction);
        }
        System.out.println("\nBot: Great conversation! Practice complete.");
    }

    static String checkGrammar(String text) {
        String lower = text.toLowerCase();
        if (lower.startsWith("i is")) return "Use 'I am' instead of 'I is'.";
        if (lower.contains(" dont ")) return "Use \"don't\" with an apostrophe.";
        return null;
    }
}
