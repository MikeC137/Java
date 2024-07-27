import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
    private String memberId;
    private String name;
    private List<LibraryItem> borrowedItems;

    public LibraryMember(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedItems = new ArrayList<>();
    }

    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public List<LibraryItem> getBorrowedItems() {
        return borrowedItems;
    }

    public void borrowItem(LibraryItem item) {
        if (item.isAvailable()) {
            item.setAvailable(false);
            item.borrowItem();
            borrowedItems.add(item);
        } else {
            System.out.println("Item is currently anavailable");
        }

    }

    public void returnItem(LibraryItem item) {
        item.setAvailable(true);
        System.out.println("Item returned successfully");
    }

    public String toString() {
        return "Library Member = " + "Member Id: " + memberId + ", Name: " + name + ", Borrowed Items: "
                + borrowedItems;
    }
}
