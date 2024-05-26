package book;

public class Book {

    private String writer;
    private String bookName;
    private int page;
    private String kind;

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setName(String bookName) {
        this.bookName = bookName;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getInfo() {
        return this.writer + "는 [" + this.bookName + "] 책을 썼고 이 책의 페이지는 " + this.page + "이며 " + this.kind + "커버로 되어있다.";
    }
}
