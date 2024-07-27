public interface LibraryOperations {
    public void addItem(LibraryItem item);

    public void removeItem(String itemId);

    public void searchItem(String title);
}
