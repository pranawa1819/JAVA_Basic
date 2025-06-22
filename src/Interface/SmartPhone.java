package Interface;

public class SmartPhone implements Camera, MusicPlayer {
    @Override
    public void clickPhoto() {
        System.out.println("The camera clicked the photo!");
    }

    @Override
    public void recordVideo() {
        System.out.println("The camera recorded the video!");
    }

    @Override
    public void playMusic() {
        System.out.println("The music player has played the music!");
    }

    public static void main(String[] args) {
        SmartPhone S1 = new SmartPhone();
        S1.clickPhoto();
        S1.recordVideo();
        S1.playMusic();
    }
}
