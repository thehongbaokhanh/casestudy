import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        EBook[] listEBooks = new EBook[0];
        LibraryConsole console = new LibraryConsole();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
//        do {
//            int choice = console.menu();
//        System.out.println(choice);
//        switch (choice) {
//            case 1:
//                console.addEBook(library);
//                break;
//            case 2:
//                console.displayAllEBooks(library);
//                break;
//            case 3:
//                console.deleteBook(library);
//                break;
//            case 4:
//                console.sortEBooks(library);
//                break;
//            case 5:
//                console.updateEBook(library);
//                break;
//            case 6:
//                    quit = true;
//            }
//        }while (!quit);

        EBook eBook = new EBook(1, "khanh", 1, "Khanh", "khanh", 1,"Khanh");
        EBook eBook2 = new EBook(2, "nhan", 1, "nhan", "nhan", 1,"nhan");
        EBook eBook3 = new EBook(3, "sam", 1, "sam", "sam", 1,"sam");
        EBook eBook4 = new EBook(4, "tam", 1, "tam", "tam", 1,"tam");
        EBook eBook5 = new EBook(5, "chanh", 1, "chanh", "chanh", 1,"chanh");
        library.addListLibrary(eBook);
        library.addListLibrary(eBook2);
        library.addListLibrary(eBook3);
        library.addListLibrary(eBook4);
        library.addListLibrary(eBook5);
        console.displayAllEBooks(library);
        console.updateEBook(library,console);
        console.displayAllEBooks(library);

    }
}