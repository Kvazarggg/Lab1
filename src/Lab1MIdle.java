/*ВАРИАНТ 3
* Задача: Вывести данные о фильмах начинающихся после 18:00 и с продолжительностью сеанса более 1 часа и 40 минут*/

import java.util.Scanner;

public class Lab1MIdle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите количество фильмов: ");
        int inCountMovie = scan.nextInt();

        Cinema[] movie = new Cinema[inCountMovie];

        for (int i = 0; i < movie.length; i++) {
            movie[i] = new Cinema();
            scan.nextLine();
            System.out.print("Введите название фильма: ");
            movie[i].setMovieTitle(scan.nextLine().trim());
            System.out.print("Введите Дату и время сеанса (Год/Месяц/День/Час/Минуты): ");
//            movie[i].setYear(scan.nextInt());
//            movie[i].setMonth(scan.nextInt());
//            movie[i].setDay(scan.nextInt());
//            movie[i].setHours(scan.nextInt());
//            movie[i].setMinutes(scan.nextInt());
            movie[i].DateAnTimeOfTheSession(scan.nextInt(), scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt());
            System.out.print("Введите продолжительность сеанса (Час/Минуты): ");
//            movie[i].setHours(scan.nextInt());
//            movie[i].setMinutes(scan.nextInt());
            movie[i].SessionDuration(scan.nextInt(),scan.nextInt());
            scan.nextLine();
            System.out.print("Введите жанр: ");
            movie[i].setGenre(scan.nextLine());
            System.out.print("Введите бюджет: ");
            movie[i].setBudget(scan.nextInt());
        }

        System.out.print("\nФильмы начинающиеся после 18:00 и с продолжительностью сеанса более 1 часа и 40 минут:");

        for (int i = 0; i < movie.length; i++)
        {
            if (movie[i].dateAnTimeOfTheSession.getHour() > 18 && movie[i].sessionDuration.getHour() > 1 || (movie[i].sessionDuration.getHour() == 1 && movie[i].sessionDuration.getMinute() > 40))
            {
                // movie[i].OutputInfo();
                System.out.println(movie[i].toString());
            }
        }
    }
}
