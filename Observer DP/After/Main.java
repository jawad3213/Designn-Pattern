
public class Main {
    public static void main(String[] args) {
        Subject scrumProject = new Subject();

        // Création des abonnés (Étudiants ENSA par exemple)
        User jaouad = new User("Jaouad");
        User teamMember = new User("Collaborator");

        scrumProject.addObserver(jaouad);
        scrumProject.addObserver(teamMember);

        // Changement d'état -> Notification automatique
        System.out.println("Changing state to: IN_PROGRESS");
        scrumProject.setState("IN_PROGRESS");

        System.out.println("\nChanging state to: COMPLETED");
        scrumProject.setState("COMPLETED");
    }
}