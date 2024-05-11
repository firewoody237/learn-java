package basic.class1.question;

public class MoviewReviewMain {

    public static void main(String[] args) {
        MovieReview[] movieReview = new MovieReview[]{
                new MovieReview("오펜하이머", "실화 바탕 과학 영화"),
                new MovieReview("타이타닉", "실화 바탕 영화")
        };

        for (MovieReview review : movieReview) {
            System.out.println(review);
        }
    }
}
