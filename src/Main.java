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
        do {
            int choice = console.menu();
        System.out.println(choice);
        switch (choice) {
            case 1:
                console.addEBook(library);
                break;
            case 2:
                console.displayAllEBooks(library);
                break;
            case 3:
                console.deleteBook(library);
                break;
            case 4:
                console.sortEBooks(library);
                break;
            case 5:
                console.updateEBook(library,console);
                break;
            case 6:
                console.findBookById(library);
            case 7:
                console.findBookByHeadLine(library);
            case 8:
                quit = true;
            }
        }while (!quit);
    }
}