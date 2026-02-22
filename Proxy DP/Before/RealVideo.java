
class RealVideo {
    private String filename;

    public RealVideo(String filename) {
        this.filename = filename;
        loadFromDisk(); // Expensive operation triggered immediately!
    }

    private void loadFromDisk() {
        System.out.println(">> [CRITICAL] Loading 1GB file: " + filename);
    }

    public void play() {
        System.out.println("Playing video: " + filename);
    }
}