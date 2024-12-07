package sk.ex;

public class classicMusic implements music {
    @Override
    public String getSong(){
        return "not away";
    }

    @Override
    public String getType(){
        return "Clasic";
    }
}
