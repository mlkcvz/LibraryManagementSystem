Book Class :
-Bu class aynı model claas ı gibi davranıp , içerisinde programda yer alacak olan fieldları , metodları yazdım . Projede kullanıcıdan title , author ve isbn alınması istendiği için burada private classa ait değişkenler olarak yazdım , birde iade ve ödünç verme , ödünç alma metodları için ödünç alındı mı isminde değişken tuttum ve başlangıçta kitabın ödünç alınmadığını varsayarak false değer atadım.
public Book() isminde Book sınıfından nesne üretince kullanacağım ve title , author, isbn , isBorrowed değişkenlerini alan metod oluşturdum. Tüm private değişkenleri dışarıya getter metodları ile açtım , böylelikle gönderilen değerler alınabildin diye yaptım . borrowBook() isimli metod eğer kitap ödünç alınmamış ise ödünç alır , isBorrowed a true atar ve ekrana basarak kullanıcıyı bilgilendirir. returnBook() metodu eğer kitap ödünç alınmış ise iade edilir.İade alınacağı için isBorrowed false olur.Kullanıcıyı bilgilendiren mesaj ekrana yazılır.

Library Class :
Book sınıfından liste tutar.
addBook() metodu : Yeni bir kitap nesnesi oluşturur, Listeye ekler,Kullanıcıya ekleme mesajı gösterir.
listBooks() metodu : Eğer kütüphane boşsa, kullanıcıya mesaj gösterir,Kitap varsa, tüm kitapları ekrana yazdırır.
findBook() metodu : Kullanıcının girdiği kitap ismini liste içinde arar,Eğer bulursa kitabı döndürür, bulamazsa null döndür.

LibraryManagementSystem Class :
-Ana program buradadır. 
-Her program çalıştığında menü çalışır ve 1 den 6 ya kadar seçenekler yer alır. Kullanıcıdan menüye göre seçim alır. Seçime göre işlemleri yapar.
Kitap ekleme, listeleme, başlığa göre arama, ödünç alma ve iade işlemlerini yönetir. Kullanıcı çıkış seçeneği seçene kadar program çalışır.
Programın Çalışma Mantığı: Kullanıcı bir seçenek girer (örneğin: 1 yani kitap ekleme) , Programla ilgili işlem yapar ,
Ana menü tekrar gösterilir , Kullanıcı 6 (Çıkış) seçeneği seçene kadar program çalışmaya devam eder. 
Class a özgü olacak şekilde Library clasından library nesnesi oluşturuyoruz.
switch şartıyla gelen menüden eğer kullanıcı 1 i seçerse addBook() metodu çalışır. addBook() metodu kullanıcıdan sırayla kitap adı , yazar adı ve isbn numarası alır ve birer değişkene atar. 

