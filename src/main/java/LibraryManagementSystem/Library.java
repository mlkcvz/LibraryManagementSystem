package LibraryManagementSystem;

import java.util.ArrayList;

public class Library
{
    private ArrayList<Book> books; // Kitapları tutan liste

    public Library() {
        books = new ArrayList<>(); //Kütüphane nesnesi oluşturulduğunda boş bir kitap listesi başlatır.
    }

    public void addBook(String title, String author, String isbn) {
        books.add(new Book(title, author, isbn)); //Yeni bir kitap nesnesi oluşturur, Listeye ekler,Kullanıcıya ekleme mesajı gösterir.
        System.out.println("Kitap eklendi: " + title);
    }

    public void listBooks() {
        if (books.isEmpty()) { //Eğer kütüphane boşsa, kullanıcıya mesaj gösterir,Kitap varsa, tüm kitapları ekrana yazdırır.
            System.out.println("Kütüphanede kitap bulunmamaktadır.");
        } else {
            System.out.println("Kütüphanedeki Kitaplar:");
            for (Book book : books) {
                System.out.println(book.getTitle() + " - " + book.getAuthor() + " (ISBN: " + book.getIsbn() + ") " + (book.isBorrowed() ? "(Ödünç Alınmış)" : "(Mevcut)"));
            }
        }
    }

    public Book findBook(String title) {
        for (Book book : books) { //Kullanıcının girdiği kitap ismini liste içinde arar,Eğer bulursa kitabı döndürür, bulamazsa null döndürür.
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book; //
            }
        }
        return null;
    }
}
