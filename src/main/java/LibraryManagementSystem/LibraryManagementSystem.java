package LibraryManagementSystem;

import java.util.Scanner;

public class LibraryManagementSystem
{

    // menü karşılasın
    // menüde seçenekler olsun


    private static Library library = new Library();// Kütüphane nesnesi oluşturuyoruz.
    private static Scanner scanner = new Scanner(System.in);// Kullanıcıdan veri almak için Scanner

    public static void main(String[] args) {
        while (true) {// Sonsuz döngü: Program sürekli çalışacak
            System.out.println("Welcome to the Library Management System ! ");
            System.out.println("\nPlease select an an option");
            System.out.println("1.Add a new book");
            System.out.println("2.Display all books");
            System.out.println("3.Search for a book by title");
            System.out.println("4.Check out a book");//ödünç almak
            System.out.println("5.Return a book");//iade
            System.out.println("6.Exit");
            System.out.println("Enter your choise: ");


            int choice = scanner.nextInt(); // Kullanıcının seçimini al
            scanner.nextLine(); // Buffer temizleme , nextInt()'ten sonra satır atlamasını engellemek için

            switch (choice) {
                case 1:
                    addBook(); // Kitap ekleme metodunu çağır
                    break;
                case 2:
                    library.listBooks(); // Kitapları listele
                    break;
                case 3:
                    searchBook();// Kitap ara
                    break;
                case 4:
                    borrowBook();// Kitap ödünç al
                    break;
                case 5:
                    returnBook(); // Kitap iade et
                    break;
                case 6:
                    System.out.println("Programdan çıkılıyor..."); // Programı sonlandır
                    return;
                default:
                    System.out.println("Geçersiz seçim, tekrar deneyin."); // Hatalı giriş mesajı
            }
        }
    }

    private static void addBook() {
        System.out.print("Kitap adını girin: ");
        String title = scanner.nextLine(); // Kullanıcıdan kitap başlığını al
        System.out.print("Yazar adını girin: ");
        String author = scanner.nextLine(); // Kullanıcıdan yazar adını al
        System.out.print("ISBN numarasını girin: ");
        String isbn = scanner.nextLine(); // Kullanıcıdan ISBN numarasını al
        library.addBook(title, author, isbn); // Kütüphaneye kitabı ekle
    }

    private static void searchBook() {
        System.out.print("Aramak istediğiniz kitabın adını girin: ");
        String title = scanner.nextLine(); // Kullanıcıdan kitap adını al
        Book book = library.findBook(title); // Kütüphanede kitabı ara
        if (book != null) {
            System.out.println("Kitap bulundu: " + book.getTitle() + " - " + book.getAuthor() + " (ISBN: " + book.getIsbn() + ") " + (book.isBorrowed() ? "(Ödünç Alınmış)" : "(Mevcut)"));
        } else {
            System.out.println("Kitap bulunamadı.");
        }
    }

    private static void borrowBook() {
        System.out.print("Ödünç almak istediğiniz kitabın adını girin: ");
        String title = scanner.nextLine();
        Book book = library.findBook(title);
        if (book != null) {
            book.borrowBook();
        } else {
            System.out.println("Kitap bulunamadı.");
        }
    }

    private static void returnBook() {
        System.out.print("İade etmek istediğiniz kitabın adını girin: ");
        String title = scanner.nextLine(); // Kullanıcıdan kitap başlığını al

        Book foundBook = library.findBook(title); // Kütüphanede kitabı ara

        if (foundBook != null) {
            if (foundBook.isBorrowed()) { // Kitap gerçekten ödünç alınmış mı?
                foundBook.returnBook(); // Kitabı iade et
                System.out.println("Kitap başarıyla iade edildi: " + title);
            } else {
                System.out.println("Bu kitap zaten kütüphanede mevcut.");
            }
        } else {
            System.out.println("Kitap bulunamadı.");
        }

    }
}
