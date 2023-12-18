package class1.ex;

public class MovieReviewMain2 {

    public static void main(String[] args) {
        MovieReview frozen = new MovieReview();
        frozen.title="겨울왕국";
        frozen.review="재밌네요";

        MovieReview despicableMe = new MovieReview();
        despicableMe.title="슈퍼배드";
        despicableMe.review="귀엽네요";

        MovieReview[] movieReviews = {frozen,despicableMe};

//        System.out.println("제목: "+movieReviews[0].title+"\n리뷰: "+movieReviews[0].review);
//        System.out.println("제목: "+movieReviews[1].title+"\n리뷰: "+movieReviews[1].review);
//        그냥 배열 출력


//        for(int i=0; i<movieReviews.length; i++){
//            System.out.println("제목: "+movieReviews[i].title+"\n리뷰: "+movieReviews[i].review);
//        }
//        일반 반복문으로 배열 출력

        for(MovieReview r: movieReviews){
            System.out.println("제목: "+r.title+"\n리뷰: "+r.review);
        }

        //향상된 for문으로 출력
    }
}
