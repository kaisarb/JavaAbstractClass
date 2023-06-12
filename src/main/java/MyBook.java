public class MyBook extends Book {
    String title;
    @Override
    void setTitle(String s) {
        this.title = s;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
