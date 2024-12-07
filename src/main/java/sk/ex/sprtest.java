package sk.ex;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class sprtest {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("AplicationContext.xml");
        //context.getBean("MusicTest", music.class);
        //music music = context.getBean("MusicTest", music.class);
        MusicPlayer MusicPlayer = context.getBean("MusicPlayer", MusicPlayer.class);
        MusicPlayer.setMusic(new RockMusic());
        MusicPlayer.play();
        context.close();
    }
}
