public class MediaAdapter implements MediaPlayer{
    AdvancedMediaPlayer advancedMediaPlayer;
    public MediaAdapter(String s){
        if(s.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }else{
            advancedMediaPlayer = new VlcPlayer();
        }
    }
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(fileName);
        }else{
            advancedMediaPlayer.playVlc(fileName);
        }

    }
}
