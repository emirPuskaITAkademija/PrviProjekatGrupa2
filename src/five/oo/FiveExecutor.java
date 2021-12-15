package five.oo;

public class FiveExecutor {
    public static void main(String[] args) {
        char slovo = '!';
        slovo = 'a';
        int number = 23;
        number = 13;

        //svi unutar svakog polja moraju biti tipa int
        int[] numbers = new int[8];
        numbers[0] = 23;
        numbers[1] = 13;
        String[] names = new String[3];
        names[0] = "Semra";
        names[1] = "Ena";
        names[2] = "Teodora";


        System.out.println(Movie.counter); // 0

        Movie firstMovie = new Movie();
        System.out.println(Movie.counter);//1
        firstMovie.setTitle("Notebook");
        firstMovie.setDirector("Nicolas Spark");
        firstMovie.setReview(10);

        Movie movie2 = new Movie();
        System.out.println(Movie.counter);// 2
        System.out.println(Movie.counter);// 2
        movie2.setTitle("Ocean's eleven");
        movie2.setDirector("Steven Spielberg");
        movie2.setReview(7);


        Movie movie3 = new Movie();
        System.out.println(Movie.counter);// 3
        System.out.println(Movie.counter);// 3
        System.out.println(Movie.counter);// 3
        movie3.setTitle("Invisible guest");
        movie3.setDirector("Paulo");
        movie3.setReview(10);
        int ocjena ;
        System.out.println("Review : "  + movie3.getReview());

        Movie movie4 = new Movie("Spiderman", "Marvel");
        movie4.setReview(8);
        System.out.println(movie4.getTitle());
        movie4.setTitle("No Way Home");
        System.out.println(movie4.getTitle());

    }
}
