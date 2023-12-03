public class Finance {
    private double amountSaved;
    private double amountSpent;
    private double total;

    public Finance() {
        amountSaved = 0.0;
        amountSpent = 0.0;
        total = 0.0;
    }

    // Getter methods for amountSaved, amountSpent, and total
    public double getAmountSaved() {
        return amountSaved;
    }

    public double getAmountSpent() {
        return amountSpent;
    }

    public double getTotal() {
        return total;
    }

    // Setter methods to update amountSaved and amountSpent
    public void addAmountSaved(double amount) {
        amountSaved += amount;
        total += amount;
    }

    public void addAmountSpent(double amount) {
        amountSpent += amount;
        total -= amount; // Subtract spent amount from the total
    }

  // Display financial summary as a formatted string
  public String displayFinancialSummary() {
      return String.format("Amount Saved: $%.2f\nAmount Spent: $%.2f\nTotal: $%.2f", amountSaved, amountSpent, total);
  }

}
