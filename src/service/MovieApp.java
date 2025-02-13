package service;


import model.Movie;
import repository.MovieDatabase;

import java.util.List;
import java.util.Scanner;

public class MovieApp {
    private static final Scanner scanner = new Scanner(System.in);
    private static final MovieDatabase movieDatabase = new MovieDatabase();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nMovie Application");
            System.out.println("1. Search Movie");
            System.out.println("2. Add Movie");
            System.out.println("3. View All Movies");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    searchMovie();
                    break;
                case 2:
                    addMovie();
                    break;
                case 3:
                    viewAllMovies();
                    break;
                case 4:
                    System.out.println("Exiting application...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void searchMovie() {
        System.out.print("Enter movie name to search: ");
        String title = scanner.nextLine();
        List<Movie> results = movieDatabase.searchMovies(title);
        if (results.isEmpty()) {
            System.out.println("No movies found.");
        } else {
            results.forEach(System.out::println);
        }
    }

    public static void addMovie() {
        System.out.print("Enter Movie Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Movie Genre: ");
        String genre = scanner.nextLine();
        System.out.print("Enter Movie Rating: ");
        double rating = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter Movie Review: ");
        String review = scanner.nextLine();
        System.out.print("Enter Release Date (YYYY-MM-DD): ");
        String releaseDate = scanner.nextLine();

        Movie newMovie = new Movie(movieDatabase.getAllMovies().size() + 1, title, genre, rating, review, releaseDate);
        movieDatabase.addMovie(newMovie);
        System.out.println("Movie added successfully!");
    }

    public static void viewAllMovies() {
        List<Movie> movies = movieDatabase.getAllMovies();
        if (movies.isEmpty()) {
            System.out.println("No movies available.");
        } else {
            movies.forEach(System.out::println);
        }
    }
}

