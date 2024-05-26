package book;

public class Application {
    public static void main(String[] args) {

        Book book = new Book();

        book.setWriter("Joshua Bloch");
        book.setName("Effective Java");
        book.setPage(416);
        book.setKind("하드");

        System.out.println(book.getInfo());
    }
}
