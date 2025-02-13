package model;

public class Movie {

    private String title;
    private String genre;
    private double rating;
    private int id;
    private String review;
    private String releaseDate;

    public Movie(int id, String title, String genre, double rating, String review, String releaseDate) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.review = review;
        this.releaseDate = releaseDate;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    public String getReview() {
        return review;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Movie: " + title + " | Genre: " + genre + " | Rating: " + rating +
                " | Review: " + review + " | Release Date: " + releaseDate;
    }
}

