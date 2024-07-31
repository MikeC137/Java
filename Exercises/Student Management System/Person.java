public class Person {
    // Private Fields
    private String name;
    private int age;
    private String address;
    private String email;

    public Person() {
        name = "";
        age = 0;
        address = "";
        email = "";
    }

    public Person(String name, int age, String address, String email) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        email = "";
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getAddress() {
        return this.address;
    }

    public String getEmail() {
        return this.email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
