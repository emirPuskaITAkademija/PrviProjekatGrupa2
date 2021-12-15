package five.oo;

/**
 * Definicija:
 * deklaracija paketa, modifikator vidljivost class ImeKlase
 *
 * <li>1. public</li>
 * <li>2. protected</li>
 * <li>3. bez ključne riječi-> paketno vidljiva</li>
 * <li>4. private</li>
 *
 * <h1>Sadržaj</h1>
 *  Klasa može imati:
 *  <ol>
 *      <li> POLJA ili Properties ili atribute </li>
 *         STATIC ili NESTATIC(instancna)
 *      <li>KONSTRUKTOR</li>
 *      <li>FUNKCIJE ILI METODE</li>
 *      STATIC ILI NESTATIC(objektne ili instancne)
 *  </ol>
 */
public class Movie{
    public static int counter = 0;
    private String title;
    private String director;
    private int review;
    private String comment;

    public Movie(){
        super();
        counter++;
        System.out.println("Još jedan film...");
    }

    public Movie(String title, String director){
        this.title = title;
        this.director = director;
    }

    public Movie(String title, int review){
        this.title = title;
        this.review = review;
    }

    public void setReview(int ocjena){
        if(ocjena>=1 && ocjena<=10){
            this.review = ocjena;
        }
    }

    public int getReview(){
        return review;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }
}
