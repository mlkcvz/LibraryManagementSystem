package LibraryManagementSystem;

public class Book
{
    private String title; // Kitabın adı
    private String author; // Kitabın yazarı
    private String isbn; // Kitabın ISBN numarası
    private boolean isBorrowed; // Kitap ödünç alındı mı?

    public Book(String title, String author, String isbn) {
        this.title = title; //title → Kitabın adını saklıyor,author → Kitabın yazarını saklıyor, isbn → Kitabın benzersiz numarasını saklıyor.
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false; // kitap ödünç alınmamış başlangıçta
    }

    public String getTitle() {
        return title; //getTitle() → Kitabın adını verir, getAuthor() → Kitabın yazarını verir
        // getIsbn() → Kitabın ISBN numarasını verir.
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowBook() {
        if (!isBorrowed) { //eğer ödünç alınmamışsa
            isBorrowed = true; // ödünç al , true ata , true = ödünç alındı
            System.out.println("Kitap ödünç aldın: " + title);
        } else {
            System.out.println("Bu kitap zaten ödünç alınmış: " + title);
        }
    }

    public void returnBook() { // kitap iade
        if (isBorrowed) { // ödünç alınmış ise
            isBorrowed = false; // iade et , iade etmek için false oldu
            System.out.println("Kitap iade edildi: " + title);
        } else {
            System.out.println("Bu kitap zaten kütüphanede mevcut.");
        }
    }


}
