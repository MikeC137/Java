public abstract class LibraryItem {
    private String title;
    private String author;
    private int publicationYear;
    private String itemId;
    private boolean available;

    public LibraryItem(String title, String author, int publicationYear, String itemId) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.itemId = itemId;
        available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getItemId() {
        return itemId;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public abstract void borrowItem();

    public abstract void returnItem();

    public boolean isAvailable() {
        return available;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Publication Year: " + publicationYear + ", Item Id: "
                + itemId;
    }
}