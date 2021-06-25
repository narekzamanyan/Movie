import java.util.Comparator;

public class Movie implements Comparable<Movie>{
    private String title;
    private int rating;

    public Movie(String title) {
        this.title = title;
    }

    public Movie(String title, int rating) {
        this.title = title;
        this.rating = rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public int getRating() {
        return rating;
    }


    @Override
    public int compareTo(Movie o) {
        return this.rating - o.getRating();
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                '}';
    }
}
