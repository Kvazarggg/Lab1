import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Movie {
    String movieTitle;
    LocalDateTime dateAnTimeOfTheSession;
    LocalTime sessionDuration;
    String genre;
    int budget;

    Scanner scan = new Scanner(System.in);

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getBudget() {
        return budget;
    }

    public void DateAnTimeOfTheSession(int year, int month, int day, int hours, int minutes) {
        dateAnTimeOfTheSession = LocalDateTime.of(year, month, day, hours, minutes);
    }

    public void SessionDuration(int hours, int minutes) {
        sessionDuration = LocalTime.of(hours, minutes);
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "movieTitle='" + movieTitle + '\'' +
                ", dateAnTimeOfTheSession=" + dateAnTimeOfTheSession +
                ", sessionDuration=" + sessionDuration +
                ", genre='" + genre + '\'' +
                ", budget=" + budget +
                '}';
    }

}
