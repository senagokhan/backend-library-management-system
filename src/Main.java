import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    static int Index = 50;
    static String[][] books = new String[Index][4]; // title , author , id , additional doc.
    static String[][] users = new String[Index][4];
    static String[][] transactions = new String[Index][3];
    static int bookQuantity = 0;
    static int transactionQuantity = 0;
    static int userQuantity = 0;


    public static void main(String[] args) {

    }
    
    public static void addBook(String title, String author, String id, String additionalDoc){
        if(bookQuantity < Index){
            books[bookQuantity][0] = title;
            books[bookQuantity][1] = author;
            books[bookQuantity][2] = id;
            books[bookQuantity][3] = additionalDoc;
            bookQuantity++;
            System.out.println("Kitap başarıyla eklendi");
        }else {
            System.out.println("raflar dolu kitap ekleyemiyoruz!");
        }
    }

    public static void viewAvailableBooks() {
        
        if (bookQuantity == 0) {
            System.out.println("There isn't available books!");
        } else {
            System.out.println("Available books:");
            for (int i = 0; i < bookQuantity; i++) {
                printBooks(books[i][0], books[i][1], books[i][2], books[i][3]);
            }
        }
    }

    private static void printBooks(String title, String author, String bookId, String pageNumber) {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Page Number: " + pageNumber);
    }
   
    //Total number of books
    public static void countTotalBooks() {
        System.out.println("Total number of books :" + bookQuantity);
    }

    
    public static void checkOutBook(String userId, String bookId){
        if(checkBooks(bookId)){
            LocalDate currentDate = LocalDate.now();
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String formattedDate = currentDate.format(dateFormatter);

            transactions[transactionQuantity][0] = userId;
            transactions[transactionQuantity][1] = bookId;
            transactions[transactionQuantity][2] = formattedDate;
            transactionQuantity++;

            System.out.println("Transaction successful");
        }
        else {
            System.out.println("Transaction failed");
}}


    public static boolean checkBooks(String bookId){  
        boolean found = false;
        for (int i = 0; i < bookQuantity; i++) {
                if (books[i][2].equals(bookId)) {
                    System.out.println("The book is found!");
                    found = true;
                    break;}
        if (!found) {
            System.out.println("The book is not found.");
            
            }
            
    }
    return found;
}
}