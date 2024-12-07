package sk.ex;

public class RockMusic implements music {
    @Override
    public String getSong() {
        return "going to boing";
    }

    @Override
    public String getType() {
        return "rock";
    }
}