package basic.class1.question;

public class MovieReview {
    private final String title;
    private final String review;

    public MovieReview(String title, String review) {
        this.title = title;
        this.review = review;
    }

    @Override
    public String toString() {
        return "title: " + title + ", review: " + review;
    }
}
