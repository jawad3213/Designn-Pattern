
public class MainBad {
    public static void main(String[] args) throws InterruptedException {
        SoftwareProject project = new SoftwareProject();

        // Polling : On vérifie manuellement chaque seconde
        while (!project.status.equals("Finished")) {
            System.out.println("Checking status... still: " + project.status);
            Thread.sleep(1000);
            // Imaginez faire cela pour 1000 utilisateurs...
        }
    }
}