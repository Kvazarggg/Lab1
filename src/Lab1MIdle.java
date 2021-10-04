/*ВАРИАНТ 3
 * Задача: Вывести данные о фильмах начинающихся после 18:00 и с продолжительностью сеанса более 1 часа и 40 минут*/

import java.util.Scanner;

public class Lab1MIdle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите количество фильмов: ");
        int inCountMovie = scan.nextInt();

        Movie[] cinema = new Movie[inCountMovie];

        for (int i = 0; i < cinema.length; i++) {
            cinema[i] = new Movie();
            scan.nextLine();
            System.out.print("Введите название фильма: ");
            cinema[i].setMovieTitle(scan.nextLine().trim());
            System.out.print("Введите Дату и время сеанса (Год/Месяц/День/Час/Минуты): ");
            cinema[i].DateAnTimeOfTheSession(scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt());
            System.out.print("Введите продолжительность сеанса (Час/Минуты): ");
            cinema[i].SessionDuration(scan.nextInt(), scan.nextInt());
            scan.nextLine();
            System.out.print("Введите жанр: ");
            cinema[i].setGenre(scan.nextLine());
            System.out.print("Введите бюджет: ");
            cinema[i].setBudget(scan.nextInt());
        }

        System.out.println("\nФильмы начинающиеся после 18:00 и с продолжительностью сеанса более 1 часа и 40 минут:");

        for (int i = 0; i < cinema.length; i++) {
            if (cinema[i].dateAnTimeOfTheSession.getHour() > 18 && cinema[i].sessionDuration.getHour() > 1 || (cinema[i].sessionDuration.getHour() == 1 && cinema[i].sessionDuration.getMinute() > 40)) {
                System.out.println(cinema[i].toString());
            }
        }
    }
}
