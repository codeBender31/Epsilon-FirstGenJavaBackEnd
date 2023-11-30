public class User {
private String firstName;
private String lastName;
private int gradeLevel;
private String username;
private String email;
private String password;
private Arithmetic arithmetic;
private Reading reading;


public User(String firstName, String lastName, int gradeLevel, String username, String email, String password, Arithmetic arithmetic, Reading reading) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.gradeLevel = gradeLevel;
    this.username = username;
    this.email = email;
    this.password = password;
    this.arithmetic = arithmetic; // Assign the provided Arithmetic object\
    this.reading = reading; // Assign the provided Reading object
}

    // Getter methods
   //Getter for Arithmetic object
    // Getter methods for Arithmetic (optional)
    public Reading getReading() {
      return reading;
    }
    public Arithmetic getArithmetic() {
        return arithmetic;
    }
  
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    // Setter methods (optional, depending on your needs)
    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    // You can add more setter methods as needed

    // Example method to display user information
    public void displayUserInfo() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Grade Level: " + gradeLevel);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
      //Object displays
      // System.out.println("Arithmetic Object: " + arithmetic.displayAllScores());
    }
}
