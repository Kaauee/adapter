package adapterex1;

public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Tocando arquivo VLC. Nome: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }

    @Override
    public void playTmb(String fileName) {
        
    }

}
