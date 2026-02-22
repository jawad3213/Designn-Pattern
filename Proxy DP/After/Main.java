
public class Main {
    public static void main(String[] args) {
        // The application starts instantly because we use the Proxy
        Video myVideo = new VideoProxy("Interstellar_4K.mp4");

        System.out.println("\n--- User is browsing the gallery ---");

        // The heavy work only happens here, on demand
        System.out.println("\n--- User clicks 'PLAY' ---");
        myVideo.play();
    }
}