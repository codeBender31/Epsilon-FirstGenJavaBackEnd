import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Reading {
    private Map<String, List<List<String>>> readingProgress;

    public Reading() {
        readingProgress = new HashMap<>();
    }

    // Method to add a new reading entry for a book
    public void addReadingEntry(String bookTitle, List<String> entry) {
        // If the book title is already in the map, add the new entry to the existing list
        if (readingProgress.containsKey(bookTitle)) {
            readingProgress.get(bookTitle).add(entry);
        } else {
            // If it's a new book title, create a new list with the entry and put it in the map
            List<List<String>> newEntryList = new ArrayList<>();
            newEntryList.add(entry);
            readingProgress.put(bookTitle, newEntryList);
        }
    }

    // Method to get all reading entries for a book
    public List<List<String>> getReadingEntries(String bookTitle) {
        return readingProgress.getOrDefault(bookTitle, new ArrayList<>());
    }

    // Method to get all book titles
    public List<String> getAllBookTitles() {
        return new ArrayList<>(readingProgress.keySet());
    }
}