package kg.itacademy.fv21.mypackage;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Gerbert",
                "How to learn Java",
                12,
                "by me",
                "02-0554",
                true
        );

        book.author = "Абракадабра";
        book.pageCount = 10000000;
        book.print();
        if(book.needsRepair){
            System.out.println("Нужен ремонт");
        }

    }
}
