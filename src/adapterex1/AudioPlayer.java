package adapterex1;


public class AudioPlayer implements MediaPlayer{

    MediaAdapter mediaAdapter;
    
    @Override
    public void play(String audioType, String fileName) {

        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Tocando o arquivo MP3. Nome: " + fileName);
        }
        
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("MP4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else{
            System.out.println("Media inserida invalida " + audioType + " Formato não utilizado");
        }
    }
 
    
    
}
