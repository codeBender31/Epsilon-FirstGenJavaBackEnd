public class Fitness {
    private int steps;
    private int runTimeMinutes;
    private int reps;
    private int crunches;
    private int pushups;
    private int pullups;
    private int throwingDistanceYards;

    public Fitness() {
        // Default constructor with no fitness data
        this.steps = 0;
        this.runTimeMinutes = 0;
        this.reps = 0;
        this.crunches = 0;
        this.pushups = 0;
        this.pullups = 0;
        this.throwingDistanceYards = 0;
    }

    // Setter methods for fitness data
    public void setSteps(int steps) {
        this.steps = steps;
    }

    public void setRunTimeMinutes(int runTimeMinutes) {
        this.runTimeMinutes = runTimeMinutes;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public void setCrunches(int crunches) {
        this.crunches = crunches;
    }

    public void setPushups(int pushups) {
        this.pushups = pushups;
    }

    public void setPullups(int pullups) {
        this.pullups = pullups;
    }

    public void setThrowingDistanceYards(int throwingDistanceYards) {
        this.throwingDistanceYards = throwingDistanceYards;
    }

    // Getter methods for fitness data
    public int getSteps() {
        return steps;
    }

    public int getRunTimeMinutes() {
        return runTimeMinutes;
    }

    public int getReps() {
        return reps;
    }

    public int getCrunches() {
        return crunches;
    }

    public int getPushups() {
        return pushups;
    }

    public int getPullups() {
        return pullups;
    }

    public int getThrowingDistanceYards() {
        return throwingDistanceYards;
    }

    // Method to check if any fitness data is recorded
    public boolean isFitnessDataRecorded() {
        return steps > 0 || runTimeMinutes > 0 || reps > 0 || crunches > 0 || pushups > 0 || pullups > 0
                || throwingDistanceYards > 0;
    }

    // Method to display fitness data
    public String displayFitnessData() {
        if (isFitnessDataRecorded()) {
            return String.format("Fitness Data:\nSteps: %d\nRun Time (Minutes): %d\nReps: %d\nCrunches: %d\nPushups: %d\nPullups: %d\nThrowing Distance (Yards): %d",
                    steps, runTimeMinutes, reps, crunches, pushups, pullups, throwingDistanceYards);
        } else {
            return "No fitness data recorded yet.";
        }
    }
}
