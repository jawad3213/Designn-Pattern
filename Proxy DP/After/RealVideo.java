
class RealVideo implements Video {
    private String filename;

    public RealVideo(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println(">> [REAL] Loading 1GB high-definition file: " + filename);
    }

    @Override
    public void play() {
        System.out.println(">> [REAL] Now playing: " + filename);
    }
}