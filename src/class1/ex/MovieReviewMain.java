package class1.ex;

public class MovieReviewMain {

    public static void main(String[] args) {
        MovieReview frozen = new MovieReview();
        frozen.title="겨울왕국";
        frozen.review="재밌네요";

        MovieReview despicableMe = new MovieReview();
        despicableMe.title="슈퍼배드";
        despicableMe.review="귀엽네요";

        System.out.println("제목: "+frozen.title+"\n리뷰: "+frozen.review);
        System.out.println("제목: "+despicableMe.title+"\n리뷰: "+despicableMe.review);

    }
}
