package sk.ex;

public class maintest {
    private String name;

    public maintest(String name) {
        this.name = name;
    }
    //setter
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String getrevName() {
        StringBuilder sb = new StringBuilder(name);
        String reversed = sb.reverse().toString();
        return reversed.toLowerCase().replaceFirst(String.valueOf(reversed.toCharArray()[0]),String.valueOf(reversed.toCharArray()[0]).toUpperCase());
    }

    public int getlenght(){
        return name.length();
    }
}
