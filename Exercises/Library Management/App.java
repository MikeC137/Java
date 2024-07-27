public class App {
    public static void main(String[] args) {
        Library library = new Library();

        Book book = new Book("Malakas", "Antonis", 2000, "18", "sex");

        Magazine magazine1 = new Magazine("OK", "Petropouleas", 2009, "7", 32);

        LibraryMember member1 = new LibraryMember("24398", "Petros");

        library.addMember(member1);
        library.addItem(magazine1);
        library.addItem(book);
        library.displayItems();
        library.removeItem("7");
        library.displayItems();
        member1.borrowItem(magazine1);
        library.displayMembers();
        library.removeMember(member1);
        library.displayMembers();
    }
}