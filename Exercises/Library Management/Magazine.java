public class Magazine extends LibraryItem {

    private int issueNumber;

    public Magazine(String title, String author, int publicationYear, String itemId, int issueNumber) {
        super(title, author, publicationYear, itemId);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    @Override
    public void borrowItem() {
        if (isAvailable()) {
            setAvailable(false);
            System.out.println("Magazine borrowed successfully");
        } else {
            System.out.println("Magazine is currently unavailable");
        }
    }

    @Override
    public void returnItem() {
        setAvailable(true);
        System.out.println("Magazine returned successfully");
    }

    @Override
    public String toString() {
        return "Magazine: " + super.toString() + ", Issue Number: " + issueNumber;
    }

}
