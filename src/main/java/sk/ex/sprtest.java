package sk.ex;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class sprtest {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("AplicationContext.xml");
        //context.getBean("MusicTest", music.class);
        RapMusic music1 = context.getBean("MusicTest", RapMusic.class);
        RapMusic music2 = context.getBean("MusicTest", RapMusic.class);
        music2.setSong("oxxxymiron");
        System.out.println(music1.getSong());
        System.out.println(music2.getSong());
        MusicPlayer MusicPlayer = context.getBean("MusicPlayer", MusicPlayer.class);
        MusicPlayer.setMusic(new RockMusic());
        MusicPlayer.play();
        context.close();
    }
}
