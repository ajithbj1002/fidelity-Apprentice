package gamelnheritance;

public class GameWithTimeLimit extends Game{
    private int timeLimit;

    public int getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    @Override
    public String toString() {
        return String.format("%s\nTime Limit for %s is %d minutes", super.toString(), getName(), timeLimit);
    }
}
