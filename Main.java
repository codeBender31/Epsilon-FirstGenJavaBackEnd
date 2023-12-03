import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    // Create an ArrayList to store the users
    ArrayList<User> users = new ArrayList<>();

    // Create User objects without initial scores
    User newUser1 = createNewUser("User1", "One", 8, "user1", "user1@example.com", "password123");
    User newUser2 = createNewUser("User2", "Two", 9, "user2", "user2@example.com", "password456");
    User newUser3 = createNewUser("User3", "Three", 10, "user3", "user3@example.com", "password789");
    User newUser4 = createNewUser("User4", "Four", 11, "user4", "user4@example.com", "passwordabc");

    // Add users to the ArrayList
    users.add(newUser1);
    users.add(newUser2);
    users.add(newUser3);
    users.add(newUser4);

    // Now, you can add and modify scores for each user as needed.
    // Example:
    List<String> additionScores = Arrays.asList("11/26/2023, 70.52", "11/27/2023, 80.0");
    newUser1.getArithmetic().appendScores("Addition", additionScores);
    List<String> subtractionScores = Arrays.asList("11/25/2023, 85.0", "11/28/2023, 75.5");
    newUser2.getArithmetic().appendScores("Subtraction", subtractionScores);
    List<String> multiplicationScores = Arrays.asList("11/24/2023, 92.5", "11/29/2023, 88.0");
    newUser3.getArithmetic().appendScores("Multiplication", multiplicationScores);
    List<String> divisionScores = Arrays.asList("11/23/2023, 78.3", "11/30/2023, 90.2");
    newUser4.getArithmetic().appendScores("Division", divisionScores);

    // Append new addition scores for user3
    List<String> additionalAdditionScores = Arrays.asList("11/26/2023, 83.5", "11/26/2023, 95.5");
    newUser3.getArithmetic().appendScores("Addition", additionalAdditionScores);

    // Update reading for user4
    String bookTitle4 = "The Alchemist";
    List<String> initialReadingEntry4 = Arrays.asList("11/26/2023", "30:52", "Paulo Coelho", "18");
    newUser4.getReading().addReadingEntry(bookTitle4, initialReadingEntry4);

    // Test 1: Add $100 to the amount saved for user2
    newUser2.getFinance().addAmountSaved(100.0);
    // Test 2: Add $50 to the amount spent for user2
    newUser2.getFinance().addAmountSpent(50.0);

    // Test data for newUser1's fitness
    newUser1.getFitness().setSteps(8000);
    newUser1.getFitness().setRunTimeMinutes(30);
    newUser1.getFitness().setReps(15);
    newUser1.getFitness().setCrunches(30);
    newUser1.getFitness().setPushups(20);
    newUser1.getFitness().setPullups(10);
    newUser1.getFitness().setThrowingDistanceYards(40);


    // Display user information, arithmetic scores, and reading progress
    for (User user : users) {
      System.out.println("User Information:");
      user.displayUserInfo();
      System.out.println("User's Arithmetic Scores:");
      System.out.println(user.getArithmetic().displayAllScores());
      System.out.println(user.getFinance().displayFinancialSummary());
      System.out.println(user.getFitness().displayFitnessData());

      // Display reading progress if available
      if (!user.getReading().getAllBookTitles().isEmpty()) {
        System.out.println("Reading Progress:");
        for (String bookTitle : user.getReading().getAllBookTitles()) {
          System.out.println("Book Title: " + bookTitle);
          List<List<String>> readingEntries = user.getReading().getReadingEntries(bookTitle);
          for (List<String> entry : readingEntries) {
            System.out.println("Date: " + entry.get(0));
            System.out.println("Time Read: " + entry.get(1));
            System.out.println("Author: " + entry.get(2));
            System.out.println("Last Page Read: " + entry.get(3));
          }
        }
      } else {
        System.out.println("No reading progress found.");
      }

      System.out.println();
    }

  }

  // Helper method to create a User object without initial scores
  private static User createNewUser(String firstName, String lastName, int gradeLevel, String username, String email,
      String password) {
    // Create an empty Arithmetic object for the user
    Arithmetic arithmetic = new Arithmetic();
    // Create a Reading object
    Reading reading = new Reading();

    // Create a new object for Finance
    Finance finance = new Finance();

    //Create a new fitness object
    Fitness fitness = new Fitness();
    // Create and return the User object
    return new User(firstName, lastName, gradeLevel, username, email, password, arithmetic, reading, finance, fitness);
  }
}
