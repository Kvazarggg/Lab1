import java.util.Scanner;

public class Lab1_Basic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество книг: ");
        int inCountBook = scan.nextInt();


        Library[] book = new Library[inCountBook];
        for (int i = 0; i < book.length; i++)
        {
            book[i] = new Library();
            scan.nextLine();
            System.out.print("Введите автора книги: ");
            book[i].setAuthor(scan.nextLine());
            System.out.print("Введите количество страниц: ");
            book[i].setNumberOfPages(scan.nextInt());
            System.out.print("Введите тираж: ");
            book[i].setEdition(scan.nextInt());
            System.out.print("Введите год издания: ");
            book[i].setYearPublishing(scan.nextInt());
        }

        System.out.print("\nСведения о книгах в библиотеке, в которых количество страниц больше 150: ");

        for (int i = 0; i < inCountBook; i++)
        {
            if (book[i].numberOfPages > 150)
            {
                book[i].OutputInfo();
            }
        }

    }
}