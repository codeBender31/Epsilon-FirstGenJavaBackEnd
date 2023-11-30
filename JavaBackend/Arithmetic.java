import java.util.*;

public class Arithmetic {
    private Map<String, Map<String, List<String>>> operationData;

    public Arithmetic() {
        // Initialize the operationData map
        operationData = new HashMap<>();
    }

    // Method to add a score for a specific operation
    public void addScore(String operation, String data) {
        Map<String, List<String>> operationMap = operationData.getOrDefault(operation, new HashMap<>());
        List<String> scores = operationMap.getOrDefault("Scores", new ArrayList<>());
        scores.add(data);
        operationMap.put("Scores", scores);
        operationData.put(operation, operationMap);
    }

    // Method to append new scores to a specific operation
    public void appendScores(String operation, List<String> newData) {
        Map<String, List<String>> operationMap = operationData.getOrDefault(operation, new HashMap<>());
        List<String> scores = operationMap.getOrDefault("Scores", new ArrayList<>());
        scores.addAll(newData);
        operationMap.put("Scores", scores);
        operationData.put(operation, operationMap);
    }

    // Method to get scores for a specific operation
    public List<String> getScores(String operation) {
        Map<String, List<String>> operationMap = operationData.get(operation);
        if (operationMap != null) {
            return operationMap.getOrDefault("Scores", new ArrayList<>());
        }
        return new ArrayList<>();
    }

    // Method to return scores for all operations as a string
    public String displayAllScores() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Map<String, List<String>>> entry : operationData.entrySet()) {
            String operation = entry.getKey();
            Map<String, List<String>> operationMap = entry.getValue();
            List<String> scores = operationMap.getOrDefault("Scores", new ArrayList<>());

            result.append("Operation: ").append(operation).append("\n");
            for (String score : scores) {
                result.append(score).append("\n");
            }
        }
        return result.toString();
    }
}
