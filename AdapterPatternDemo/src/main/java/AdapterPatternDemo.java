public class AdapterPatternDemo {
    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "2pac.mp3");
        audioPlayer.play("mp4", "biggie.mp4");
        audioPlayer.play("vlc", "okay.vlc");
        audioPlayer.play("avi", "oh.avi");

    }
}
