package kg.itacademy.fv21.mypackage;

public class Book {
    /**
     * Свойства
     */
    public String author;
    public String title;
    public int pageCount;
    public String giftedBy;
    public String pressmark;
    public boolean needsRepair;

    /**
     * Конструктор
     * @param author
     * @param title
     */
    public Book(){

    }
    public Book(String author, String title, int pageCount,
                String giftedBy, String pressmark, boolean needsRepair) {
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
        this.giftedBy = giftedBy;
        this.pressmark = pressmark;
        this.needsRepair = needsRepair;
    }

    /**
     * Методы
     */
    public void print(){
        System.out.println(author + " " + title);
    }
}
