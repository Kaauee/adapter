package adapterex1;

public class AdapterEx1 {
    public static void main(String[] args) {
        
        AudioPlayer audioPlayer = new AudioPlayer();
        
        audioPlayer.play("mp3","Beyond the horizon.mp3");
        audioPlayer.play("mp4","alone.mp4");
        audioPlayer.play("vlc","far far away.vlc");
        audioPlayer.play("TMB","Rules of Toplane.tmb");
        audioPlayer.play("Avi","mind me.avi");
    }
    
}
