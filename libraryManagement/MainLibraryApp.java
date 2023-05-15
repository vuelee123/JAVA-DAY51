package libraryManagement;

public class MainLibraryApp {
    public static void main(String[] args) {
        Book book1 = new Book("Green Eggs and Ham", 1960, "Dr. Seuss", "0545002850");
        Book book2 = new Book("Dragons Love Farts", 2021, "Hollywood Kay", "1951696077");
        Book book3 = new Book("How to Catch a Dinosaur", 2019, "Adam Wallace", "1492680524");

        DVD dvd1 = new DVD("Thor: Love and Thunder", 2022, "Taika Waititi", 158);
        DVD dvd2 = new DVD("Marvel's The Avengers", 2012, "Joss Whedon", 143);
        DVD dvd3 = new DVD("Frozen", 2014, "Chris Buck and Jennifer Lee", 102);

        LibraryManager<LibraryItem> libraryManager = new LibraryManager<>();

        // add books
        libraryManager.addItem(book1);
        libraryManager.addItem(book2);
        libraryManager.addItem(book3);

        // add dvd
        libraryManager.addItem(dvd1);
        libraryManager.addItem(dvd2);
        libraryManager.addItem(dvd3);

        // remove item
        libraryManager.removeItem(dvd2);

        // display items
        libraryManager.displayItems();
    }
}
