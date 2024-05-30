import java.util.Arrays;
import java.util.Comparator;

public class Library {
     EBook[] listLibrary = new EBook[0];
    public void addListLibrary(EBook eBook){
        EBook[] newListLibrary = new EBook[listLibrary.length + 1 ];
        newListLibrary[newListLibrary.length - 1] = eBook;
        System.arraycopy(listLibrary, 0, newListLibrary, 0, listLibrary.length);
        listLibrary = newListLibrary;
    }
    public EBook[] displayList(){
        return listLibrary;
    }
    public EBook findTheEbook(int id){
        for(EBook eBook : listLibrary){
            if (eBook.getId() == id){
                return eBook;
            }
        }
        return null;
    }

    public boolean check(int id){
        for (int x = 0; x < listLibrary.length; x++){
            if (id == listLibrary[x].getId()){
                return true;
            }
        }
        return false;
    }

    public EBook[] findBookListLibrarybyId( int id) {
        EBook[] newListLibrary = new EBook[1];
        int count = 0;
        for (int x = 0, y = 0; x < listLibrary.length; x++){
            if (id == listLibrary[x].getId()){
                newListLibrary[y] = listLibrary[x];
                y++;
            }
        }
        return newListLibrary;
    }

    public int getsize() {
        return listLibrary.length;
    }


    public EBook[] findBookListLibrarybyHeadline(String headLine) {
        EBook[] newListLibrary = new EBook[1];
        for (int x = 0, y = 0; x < listLibrary.length; x++){
            if (headLine.equalsIgnoreCase(listLibrary[x].getHeadline())){
                newListLibrary[y] = listLibrary[x];
                y++;
            }
        }
        return newListLibrary;
    }

    public void sortListLibraryByAuthor(boolean type){
        Comparator<EBook> comparator = Comparator.comparing(EBook::getAuthor);
        if (!type) {
            comparator = comparator.reversed();
        }
        Arrays.sort(listLibrary, comparator);
    }
    public void sortListLibraryByPublicYear(boolean type){
        Comparator<EBook> comparator = Comparator.comparing(EBook::getPublicYear);
        if (!type) {
            comparator = comparator.reversed();
        }
        Arrays.sort(listLibrary, comparator);
    }
    public void sortListLibraryByHeadLine(boolean type){
        Comparator<EBook> comparator = Comparator.comparing(EBook::getHeadline);
        if (!type) {
            comparator = comparator.reversed();
        }
        Arrays.sort(listLibrary, comparator);
    }
    public void DeleteListLibrary(int id){
        EBook[] newListLibrary = new EBook[listLibrary.length - 1];
        for ( int x = 0, y = 0; x < listLibrary.length;x++){
            if (listLibrary[x].getId() != id){
            newListLibrary[y] = listLibrary[x];
            y++;
            }
        }
        listLibrary = newListLibrary;
    }

}
