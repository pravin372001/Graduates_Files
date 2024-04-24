package movie;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();

        Movie actionMovie = new ActionMovie("Mersal", 200, "Atlee");
        Movie comedyMovie = new ComedyMovie("Eli", 150, "Vadivelu");
        Movie dramaMovie = new DramaMovie("Kadhalan", 180, "Shankar");

        movies.add(actionMovie);
        movies.add(comedyMovie);
        movies.add(dramaMovie);

        System.out.println("Tamil Movies:");
        for (Movie movie : movies) {
            System.out.println(movie.getDescription() + " - Duration: " + movie.getDuration() + " mins - Genre: "
                    + movie.getGenre() + " - Price: " + movie.getPrice());
        }
    }
}
