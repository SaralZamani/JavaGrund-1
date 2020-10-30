package bookarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Book> books = new ArrayList<>();

    public static void addBook() {
        System.out.println("Enter name for book:");
        String name = sc.nextLine();

        System.out.println("Enter name for Author:");
        String author = sc.nextLine();

        Book book = new Book(name, author);
        books.add(book);
        System.out.println("Book is created");
    }
    
    public static void removeBookById() {

        System.out.println("Enter Id of book to be removed");
        int id = sc.nextInt();
        sc.nextLine();

        for (int i = books.size() - 1; i >= 0; i--) {

            if (books.get(i).getId() == id) {
                books.remove(books.get(i));
            }
        }
    }
    
    public static void removeBookByName() {

        System.out.println("Enter name for book");
        String name = sc.nextLine();

        for (int i = books.size() - 1; i >= 0; i--) {

            if (books.get(i).getName().equalsIgnoreCase(name)) {
                books.remove(books.get(i));
            }
        }
    }

    public static void showBookById() {
        System.out.println("Enter ID for Book:");
        int bookId = sc.nextInt();
        sc.nextLine();

        for (Book book : books) {

            if (book.getId() == bookId) {
                System.out.println(book);
                break;
            } else {
                System.out.println("Book is not found");
            }
        }
    }

    public static void showAllBooks() {

        System.out.println(books);
    }

    public static void updateBookName() {

        System.out.println("Enter Id for book:");
        int id = sc.nextInt();
        sc.nextLine();
        for (Book book : books) {

            if (book.getId() == id) {
                System.out.println("Enter name for book:");
                String name = sc.nextLine();
                book.setName(name);
                System.out.println("Book name is updated");
            }
        }
    }

    public static int numberOfBooks() {

        return books.size();
    }
}
