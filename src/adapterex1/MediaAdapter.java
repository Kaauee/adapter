package adapterex1;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {

        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("Mp4")) {
            advancedMusicPlayer = new Mp4Player();
        } else if (audioType.equalsIgnoreCase("TMB")) {
            advancedMusicPlayer = new TmbPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {

        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer.playMp4(fileName);
        } else if (audioType.equalsIgnoreCase("TMB")) {
            advancedMusicPlayer.playTmb(fileName);
        }
    }

}
