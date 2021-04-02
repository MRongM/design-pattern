public class AdapterDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","beyond horizon.mp4");
        audioPlayer.play("mp4","alone.mp4");
        audioPlayer.play("vlc","far far way.vlc");
        audioPlayer.play("avi","mind me.avi");
    }
}
