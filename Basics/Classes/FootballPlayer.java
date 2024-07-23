public class FootballPlayer {
    // Fields
    String firstName;
    String lastName;
    int age;
    String nationality;
    String position;

    FootballPlayer() {
        firstName = "";
        lastName = "";
        age = 1;
        nationality = "";
        position = "";
    }

    public FootballPlayer(String firstName, String lastName, int age, String nationality, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.nationality = nationality;
        this.position = position;
    }

    // Methods
    void run() {
        System.out.println("The football player is running");
    } 

    void shoot() {
        System.out.println("The football player is shooting");
    }

    void pass() {
        System.out.println("The football player is passing");
    }
}