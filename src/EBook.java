public class EBook extends Book{
 private int size;
 private String format;

 EBook( int id, String author, int publicYear, String type, String headline, int size, String format){
  super(id, author, publicYear, type, headline);
  this.size = size;
  this.format = format;
 }

 @Override
 public void setBook(int id, String author, int publicYear, String type, String headline, int size, String format) {
  super.setBook(id, author, publicYear, type, headline);
  this.size = size;
  this.format = format;
 }

 @Override
 public String toString() {
  return super.toString() +
          ", format='" + format + '\'' +
          ", size=" + size +
          '}';
 }
}

