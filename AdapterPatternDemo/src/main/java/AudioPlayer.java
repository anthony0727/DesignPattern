public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdater;

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("playing mp3 " + fileName);
        } else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter();
            mediaAdapter = mediaAdater.play(audioType, fileName);
        } else {
            System.out.println("not supported");
        }
    }
}
