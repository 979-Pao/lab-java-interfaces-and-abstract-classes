package Videostreaming;

public class Movie extends Video {
    double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    @Override
    public String getInfo() {
        return "Movie: Title=" + title + ", Duration=" + duration + ", Rating=" + rating;
    }
}
