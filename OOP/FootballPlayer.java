public class FootballPlayer {
    // Fields
    private String firstName;
    private String lastName;
    private int age;
    private String nationality;
    private String position;

    public FootballPlayer() {
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

    // Mutators/Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // Accessors/Getters

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }

    public String getPosition() {
        return position;
    }

    public void run() {
        System.out.println("The football player is running");
    } 

    public void shoot() {
        System.out.println("The football player is shooting");
    }

    public void pass() {
        System.out.println("The football player is passing");
    }
}