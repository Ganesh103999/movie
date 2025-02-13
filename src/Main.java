import repository.MovieDatabase;
import java.util.Scanner;
import static service.MovieApp.*;

public class Main {
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
}