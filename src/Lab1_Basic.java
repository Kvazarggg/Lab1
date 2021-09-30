import java.util.Scanner;

public class Lab1_Basic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество книг: ");
        int inCountBook = scan.nextInt();


        Book[] library = new Book[inCountBook];
        for (int i = 0; i < library.length; i++)
        {
            library[i] = new Book();
            scan.nextLine();
            System.out.print("Введите автора книги: ");
            library[i].setAuthor(scan.nextLine());
            System.out.print("Введите количество страниц: ");
            library[i].setNumberOfPages(scan.nextInt());
            System.out.print("Введите тираж: ");
            library[i].setEdition(scan.nextInt());
            System.out.print("Введите год издания: ");
            library[i].setYearPublishing(scan.nextInt());
        }

        System.out.print("\nСведения о книгах в библиотеке, в которых количество страниц больше 150: ");

        for (int i = 0; i < inCountBook; i++)
        {
            if (library[i].numberOfPages > 150)
            {
                library[i].OutputInfo();
            }
        }

    }
}