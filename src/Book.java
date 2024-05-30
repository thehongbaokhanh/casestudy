public abstract class Book {
    private int id;
    private String author;
    private int publicYear;
    private String type;
    private String headline;

    Book(int id, String author, int publicYear, String type, String headline){
        this.id = id;
        this.author = author;
        this.publicYear = publicYear;
        this.type = type;
        this.headline = headline;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicYear() {
        return publicYear;
    }

    public void setPublicYear(int publicYear) {
        this.publicYear = publicYear;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }
    public void setBook(int id, String author, int publicYear, String type, String headline){
        setAuthor(author);
        setId(id);
        setHeadline(headline);
        setPublicYear(publicYear);
        setType(type);
    }

    public abstract void setBook(int id, String author, int publicYear, String type, String headline, int size, String format);

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", publicYear=" + publicYear +
                ", type='" + type + '\'' +
                ", headline='" + headline + '\'';
    }
}
