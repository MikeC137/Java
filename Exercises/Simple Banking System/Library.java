import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library implements LibraryOperations {

    private List<LibraryItem> items;
    private List<LibraryMember> members;

    public Library() {
        this.items = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addMember(LibraryMember member) {
        members.add(member);
        System.out.println("Member added to the library");
    }

    public void removeMember(LibraryMember member) {
        members.remove(member);
        System.out.println("Member removed from the library");
    }

    public void displayItems() {
        for (LibraryItem libraryItem : items) {
            System.out.println(libraryItem);
        }
    }

    public void displayMembers() {
        for (LibraryMember libraryMember : members) {
            System.out.println(libraryMember);
        }
    }

    @Override
    public void addItem(LibraryItem item) {
        items.add(item);
        System.out.println("Item added to the library");
    }

    @Override
    public void removeItem(String itemId) {
        Iterator<LibraryItem> iterator = items.iterator();
        while (iterator.hasNext()) {
            LibraryItem libraryItem = iterator.next();
            if (libraryItem.getItemId().equals(itemId)) {
                iterator.remove();
                break;
            }
        }
    }

    @Override
    public void searchItem(String title) {
        for (LibraryItem libraryItem : items) {
            if (libraryItem.getTitle().equals(title)) {
                System.out.println(libraryItem);
            }
        }
    }
}