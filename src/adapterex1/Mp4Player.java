package adapterex1;

public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Tocando o arquivo MP4. Nome: " + fileName);
    }

}
