public class Cartoon implements Comparable<Cartoon>{
    private String title;
    private int rating;

    public Cartoon(String title) {
        this.title = title;
    }

    public Cartoon(String title, int rating) {
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
    public int compareTo(Cartoon o) {
        return this.rating - o.getRating();
    }

    @Override
    public String toString() {
        return "Cartoon{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                '}';
    }
}
