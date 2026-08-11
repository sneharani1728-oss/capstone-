import java.util.*;

public class IdiomLibrary {
    static Map<String, String> idioms = new HashMap<>();
    static Map<String, String> examples = new HashMap<>();

    public static void main(String[] args) {
        idioms.put("Break the ice", "To start a conversation");
        idioms.put("Hit the sack", "To go to sleep");
        idioms.put("Touch base", "To check in with someone");

        examples.put("Break the ice", "He told a joke to break the ice.");
        examples.put("Hit the sack", "I'm tired, going to hit the sack.");
        examples.put("Touch base", "Let's touch base tomorrow.");

        Scanner sc = new Scanner(System.in);
        System.out.println("=== Issen: Idioms Library ===");
        System.out.println("Search an idiom (or type 'all'): ");
        String query = sc.nextLine().trim();

        if (query.equalsIgnoreCase("all")) {
            for (String key : idioms.keySet()) {
                printIdiom(key);
            }
        } else {
            boolean found = false;
            for (String key : idioms.keySet()) {
                if (key.toLowerCase().contains(query.toLowerCase())) {
                    printIdiom(key);
                    found = true;
                }
            }
            if (!found) System.out.println("No idiom found.");
        }
    }

    static void printIdiom(String key) {
        System.out.println("\nPhrase: " + key);
        System.out.println("Meaning: " + idioms.get(key));
        System.out.println("Example: " + examples.get(key));
    }
}
