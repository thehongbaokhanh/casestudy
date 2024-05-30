import java.util.Arrays;
import java.util.Scanner;

public class LibraryConsole {
    public int menu(){
        Scanner scanner = new Scanner(System.in);
            int choice = 0;
        do {
            System.out.println("-----------------------------------");
            System.out.println("Menu:");
            System.out.println("1. Add a book to the list");
            System.out.println("2. Display all EBook");
            System.out.println("3. Delete a book from the list");
            System.out.println("4. Sort the Ebooks ");
            System.out.println("5. Update the books in the list");
            System.out.println("6. Find book by id");
            System.out.println("7. Find book by headline");
            System.out.println("8. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
        }while(choice < 1 || choice > 6);
        return choice;
    }

    public void displayAllEBooks(Library library){
       for(int i = 0; i < library.getsize(); i++){
           System.out.println(library.displayList()[i]);
       }
    }
    public void findBookById(Library library){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the book id you want to search: ");
        int bookId = scanner.nextInt();
        System.out.println(Arrays.toString(library.findBookListLibrarybyId(bookId)));
    }
    public void findBookByHeadLine(Library library){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the book id you want to search: ");
        String headline = scanner.nextLine();
        System.out.println(Arrays.toString(library.findBookListLibrarybyHeadline(headline)));
    }
    public void updateBookById(Library library){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the book id you want to update: ");
        int bookId = scanner.nextInt();
        do {
            System.out.println("Please enter the book id again cause its don't have in the list: ");
            bookId = scanner.nextInt();
        }while (!library.check(bookId));
        if (library.check(bookId)){

        }
    }
    public void deleteBook(Library library){
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("Please enter the id of the book you would like to delete");
        choice = scanner.nextInt();
        library.DeleteListLibrary(choice);
    }
    public void sortEBooks(Library  library){
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("-------------------------------------------");
            System.out.println("1. to sort the list by Author (descending order) : ");
            System.out.println("2. to sort the list by Public year (descending order): ");
            System.out.println("3. to sort the list by Headline (descending order): ");
            System.out.println("4. to sort the list by Author (ascending order): ");
            System.out.println("5. to sort the list by Public year (ascending order): ");
            System.out.println("6. to sort the list by Headline (ascending order): ");
            choice = scanner.nextInt();
        }while (choice < 1 || choice > 6);
        switch (choice) {
            case 1:
                library.sortListLibraryByAuthor(false);
                break;
            case 2:
                library.sortListLibraryByPublicYear(false);
                break;
            case 3:
                library.sortListLibraryByHeadLine(false);
                break;
            case 4:
                library.sortListLibraryByAuthor(true);
                break;
            case 5:
                library.sortListLibraryByPublicYear(true);
                break;
            case 6:
                library.sortListLibraryByHeadLine(true);
                break;
        }
    }
    public void updateEBook(Library library, LibraryConsole console){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the id of the book you would like to update: ");
        int bookId = scanner.nextInt();
        while (!library.check(bookId)){
            System.out.println("Can't find the id of the book in the id; please try again: ");
            bookId = scanner.nextInt();
        }
        console.ebookToUpdate(library,bookId);
    }
    public void ebookToUpdate(Library library , int id){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the book id you want to update: ");
        int BookId = scanner.nextInt();
        System.out.println("Please enter the book author you want to update: ");
        String author = new Scanner(System.in).nextLine();
        System.out.println("Enter public year you want to update: ");
        int year = scanner.nextInt();
        System.out.println("Enter type of book to update: ");
        String type = new Scanner(System.in).nextLine();
        System.out.println("Enter the headline to update: ");
        String headline = new Scanner(System.in).nextLine();
        System.out.println("Enter the size of eBook to update: ");
        int size= scanner.nextInt();
        System.out.println("Enter the format of the eBook to update: ");
        String format = new Scanner(System.in).nextLine();
        library.findTheEbook(id).setBook(BookId,author,year,type,headline,size,format);
    }
    public void addEBook(Library library){
        Scanner scanner = new Scanner(System.in);
        int id;
        System.out.println("Please enter information of the book to add to the list:");
        System.out.println("Enter id: ");
        id = scanner.nextInt();
        while (library.check(id)){
            System.out.println("The id is already in the library: ");
            System.out.println("Please try the another id: ");
            id = scanner.nextInt();
        };
        System.out.println("Enter the name of author: ");
        String author = new Scanner(System.in).nextLine();
        System.out.println("Enter public year: ");
        int year = scanner.nextInt();
        System.out.println("Enter type: ");
        String type = new Scanner(System.in).nextLine();
        System.out.println("Enter the headline: ");
        String headline = new Scanner(System.in).nextLine();
        System.out.println("Enter the size: ");
        int size= scanner.nextInt();
        System.out.println("Enter the format: ");
        String format = new Scanner(System.in).nextLine();
        library.addListLibrary(new EBook(id,author,year,type,headline,size,format));
    }
}
