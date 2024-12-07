package sk.ex;

public class RapMusic implements music {
    @Override
    public String getSong(){
        return "oxxy";
    }

    @Override
    public String getType(){
        return "rap";
    }
}