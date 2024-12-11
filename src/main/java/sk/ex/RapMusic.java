package sk.ex;

public class RapMusic implements music {
    String song;
    public void myInit(){
        System.out.println("initilazion");
        song="oxxy";
    }
    @Override
    public String getSong(){
        return song;
    }
    public void setSong(String dn){
        song=dn;
    }
    @Override
    public String getType(){
        return "rap";
    }
}