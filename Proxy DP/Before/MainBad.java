
public class MainBad {
    public static void main(String[] args) {
        // Without a Proxy, the heavy file loads IMMEDIATELY on creation
        // Even if the user never clicks "Play"
        RealVideo video1 = new RealVideo("Interstellar_4K.mp4");
        RealVideo video2 = new RealVideo("Avatar_8K.mp4");
        RealVideo video3 = new RealVideo("Dune_IMAX.mp4");

        System.out.println("\n--- All 3 videos loaded into memory even though none are playing! ---");
        System.out.println("--- Imagine loading 100 videos in a gallery... ---");

        // User finally plays one
        System.out.println("\n--- User clicks 'PLAY' on video 1 ---");
        video1.play();
    }
}
