public class Book extends LibraryItem {
    private String genre;

    public Book(String title, String author, int publicationYear, String itemId, String genre) {
        super(title, author, publicationYear, itemId);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public void borrowItem() {
        if (isAvailable()) {
            setAvailable(false);
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Book is currently unavailable");
        }
    }

    @Override
    public void returnItem() {
        setAvailable(true);
        System.out.println("Book returned successfully");
    }

    @Override
    public String toString() {
        return "Book: " + super.toString() + ", Genre: " + genre;
    }
}
