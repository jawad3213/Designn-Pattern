

class VideoProxy implements Video {
    private RealVideo realVideo; // Reference to the real object
    private String filename;

    public VideoProxy(String filename) {
        this.filename = filename;
        // We do NOT create the RealVideo here.
        System.out.println("Proxy: Object created. No memory used yet.");
    }

    @Override
    public void play() {
        // VIRTUAL PROXY LOGIC: Lazy Initialization
        if (realVideo == null) {
            System.out.println("Proxy: First time request. Initializing real object...");
            realVideo = new RealVideo(filename);
        }
        realVideo.play();
    }
}