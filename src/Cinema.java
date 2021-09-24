import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Cinema {
    String movieTitle;
    int day, month, year, hours, minutes;
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

    int currentYear = 2021;

    public void setYear(int year) {
        int trueYear = year;
        if (year > currentYear)
        {
            System.out.println("Некорректное значение года. Кажется, что вы ввели год который ещё не наступил:)");
            System.out.print("Введите год: ");
            trueYear = scan.nextInt();
        }
        else if (year< 0) {
            System.out.println("Некорректное значение года. Кажется, что вы ввели отрицательное значение:)");
            System.out.print("Введите год: ");
            trueYear = scan.nextInt();
        }

        this.year = trueYear;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day){
        int trueDay = day;
        if(trueDay < 0 || trueDay > 31) {
            System.out.print("Ошибка ввода. Попробуйте снова: ");
            trueDay = scan.nextInt();
        }

        this.day = trueDay;
    }

    public int getDay() {
        return day;
    }

    public void setMonth(int month){
        int trueMonth = month;
        if(trueMonth < 0 || trueMonth > 12) {
            System.out.print("Ошибка ввода. Попробуйте снова: ");
            trueMonth = scan.nextInt();
        }

        this.month = trueMonth;
    }

    public int getMonth() {
        return month;
    }

    public void setHours(int hours) {
        int trueHours = hours;
        if(trueHours < 0 || trueHours > 24) {
            System.out.print("Ошибка ввода. Попробуйте снова: ");
            trueHours = scan.nextInt();
        }
        this.hours = trueHours;
    }

    public int getHours() {
        return hours;
    }

    public void setMinutes(int minutes) {
        int trueMinutes = minutes;
        if(trueMinutes < 0 || trueMinutes > 60) {
            System.out.print("Ошибка ввода. Попробуйте снова: ");
            trueMinutes = scan.nextInt();
        }
        this.minutes = trueMinutes;
    }

    public int getMinutes() {
        return minutes;
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

    public void DateAnTimeOfTheSession()
    {
        dateAnTimeOfTheSession = LocalDateTime.of(year, month, day, hours, minutes);

    }

    public void SessionDuration()
    {
        sessionDuration = LocalTime.of(hours, minutes);
    }


    public void OutputInfo() {
        System.out.println("\n");
        System.out.println("Название фильма: " + movieTitle);
        System.out.println("Дата и время сеанса : " + dateAnTimeOfTheSession);
        System.out.println("Продолжительность сеанса : " + sessionDuration);
        System.out.println("Жанр : " + genre);
        System.out.println("Бюджет : " + budget);
        System.out.println();
    }
}
