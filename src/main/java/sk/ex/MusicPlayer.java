package sk.ex;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<music> musiclist = new ArrayList<>();
    private String user;
    private int volume;

    //bean
    public  MusicPlayer(music music){
            this.musiclist.add(music);
    }
    public MusicPlayer(){}

    public void setMusic(music music) {
        this.musiclist.add(music);
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getUser() {
        return user;
    }

    public int getVolume() {
        return volume;
    }

    public void play(){
        for (int r = 0;r< musiclist.toArray().length;r++){
            System.out.println((r+1)+"|played: "+ musiclist.get(r).getSong());
        }
    }
}
