public class MediaAdapter implements MediaPlayer {
    public void play(String audioType, String fileName);

    public MediaAdapter(String audioType) {
        if(audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer = new VlcPlayer();
        } else if(audioType.equalsIgnoreCase("mp4"))
    }
}
