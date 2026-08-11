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

        idioms.put("Break the ice", "To start a conversation");
        examples.put("Break the ice", "He told a joke to break the ice.");

        idioms.put("Hit the sack", "To go to sleep");
        examples.put("Hit the sack", "I'm tired, going to hit the sack.");

        idioms.put("Touch base", "To check in with someone");
        examples.put("Touch base", "Let's touch base tomorrow.");

        // --- Daily Use Idioms ---
        idioms.put("Bite the bullet", "To face a difficult situation with courage");
        examples.put("Bite the bullet", "I need to bite the bullet and go to the dentist.");

        idioms.put("Break a leg", "A way to wish someone good luck");
        examples.put("Break a leg", "Break a leg at your audition tonight!");

        idioms.put("Call it a day", "To stop working on something for the day");
        examples.put("Call it a day", "We've done enough work, let's call it a day.");

        idioms.put("Cutting corners", "Doing something poorly to save time or money");
        examples.put("Cutting corners", "They cut corners on construction, and the roof leaked.");

        idioms.put("Get out of hand", "To get out of control");
        examples.put("Get out of hand", "The party got out of hand when more guests arrived.");

        idioms.put("Hang in there", "Don't give up");
        examples.put("Hang in there", "I know things are tough, but hang in there.");

        idioms.put("No pain, no gain", "You have to work hard for what you want");
        examples.put("No pain, no gain", "I hate working out, but no pain, no gain.");

        idioms.put("On the ball", "Alert, active, and efficient");
        examples.put("On the ball", "She's really on the ball with her new project.");

        idioms.put("Pull someone's leg", "To joke or tease someone");
        examples.put("Pull someone's leg", "Don't worry, I was just pulling your leg.");

        idioms.put("Speak of the devil", "The person you were talking about just arrived");
        examples.put("Speak of the devil", "Speak of the devil, here comes Mark now.");

        idioms.put("Under the weather", "Feeling slightly sick");
        examples.put("Under the weather", "I stayed home today because I felt under the weather.");

        idioms.put("Spill the beans", "To reveal a secret");
        examples.put("Spill the beans", "Trust him not to spill the beans about the party.");

        idioms.put("See eye to eye", "To agree completely with someone");
        examples.put("See eye to eye", "My boss and I don't always see eye to eye.");

        // --- Work Life & Professional Idioms ---
        idioms.put("Ball is in your court", "It is up to you to take the next step");
        examples.put("Ball is in your court", "I sent the proposal, so the ball is in their court.");

        idioms.put("Back to the drawing board", "To start over because a plan failed");
        examples.put("Back to the drawing board", "The campaign failed, so it's back to the drawing board.");

        idioms.put("Burn the midnight oil", "To work late into the night");
        examples.put("Burn the midnight oil", "I had to burn the midnight oil to finish the report.");

        idioms.put("Get the ball rolling", "To start a process or project");
        examples.put("Get the ball rolling", "Let's schedule a meeting to get the ball rolling.");

        idioms.put("Go the extra mile", "To make a special effort to achieve something");
        examples.put("Go the extra mile", "She always goes the extra mile for her clients.");

        idioms.put("In the loop", "Keeping someone informed about a situation");
        examples.put("In the loop", "Please keep me in the loop regarding the budget updates.");

        idioms.put("Keep your chin up", "To remain joyful in a tough situation");
        examples.put("Keep your chin up", "Keep your chin up, you will find a new job soon.");

        idioms.put("Play devil's advocate", "To argue the opposite side for debate");
        examples.put("Play devil's advocate", "Let me play devil's advocate to test your theory.");

        idioms.put("Think outside the box", "To think creatively from a new perspective");
        examples.put("Think outside the box", "We need to think outside the box to solve this issue.");

        idioms.put("On the same page", "To think in a similar way or have the same data");
        examples.put("On the same page", "Before we start, let's make sure we are all on the same page.");

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
