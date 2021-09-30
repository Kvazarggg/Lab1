import java.util.Scanner;

public class Book {
    String author;
    int numberOfPages;
    int edition;
    int yearPublishing;

    Scanner scan = new Scanner(System.in);

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setNumberOfPages(int numberOfPages) {
        int trueNumberOfPages = numberOfPages;
        if (numberOfPages < 0)
        {
            System.out.println("Некорректное значение года. Количество страниц не может быть отрицательным числом");
            System.out.print("Введите количество страниц: ");
            trueNumberOfPages = scan.nextInt();
        }
        this.numberOfPages = trueNumberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setEdition(int edition) {
        int trueEdition = edition;
        if (edition < 0)
        {
            System.out.println("Некорректное значение года. Тираж не может быть отрицательным числом");
            System.out.print("Введите тираж: ");
            trueEdition = scan.nextInt();
        }
        this.edition = trueEdition;
    }

    public int getEdition() {
        return edition;
    }

    int currentYear = 2021;

    public void setYearPublishing(int yearPublishing) {
        int trueYearPublishing = yearPublishing;
        if (yearPublishing > currentYear)
        {
            System.out.println("Некорректное значение года. Кажется, что вы ввели книгу из будущего:)");
            System.out.print("Введите год издания: ");
            trueYearPublishing = scan.nextInt();
        }
        else if (yearPublishing < 0) {
            System.out.println("Некорректное значение года. Кажется, что вы ввели отрицательное значение:)");
            System.out.print("Введите год издания: ");
            trueYearPublishing = scan.nextInt();
        }

        this.yearPublishing = trueYearPublishing;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void OutputInfo(){
        System.out.println("\n");
        System.out.println("Автор : " + author);
        System.out.println("Количество страниц : " + numberOfPages);
        System.out.println("Тираж : " + edition);
        System.out.println("Год издания : " + yearPublishing);
    }
}
