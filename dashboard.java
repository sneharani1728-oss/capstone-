import java.util.*;

public class ProgressDashboard {
    public static void main(String[] args) {
        Map<String, Double> skillScores = new LinkedHashMap<>();
        skillScores.put("idioms", 80.0);
        skillScores.put("pronunciation", 45.0);
        skillScores.put("conversation", 60.0);
        skillScores.put("grammar", 30.0);

        System.out.println("=== Issen: Progress Dashboard ===");
        for (Map.Entry<String, Double> entry : skillScores.entrySet()) {
            System.out.printf("%s: %.1f%%\n", entry.getKey(), entry.getValue());
        }

        System.out.println("\nRecommendations:");
        List<Map.Entry<String, Double>> sorted = new ArrayList<>(skillScores.entrySet());
        sorted.sort(Comparator.comparingDouble(Map.Entry::getValue)); // weakest first

        for (int i = 0; i < 2; i++) {
            String skill = sorted.get(i).getKey();
            double score = sorted.get(i).getValue();
            System.out.println("- Improve " + skill + " (currently " + score + "%). Try more practice here.");
        }
    }
}
