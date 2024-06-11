import java.util.Scanner;

public class Main {
    static int Index = 50;
    static String[][] books = new String[Index][4];
    static String[][] users = new String[Index][4];
    static String[][] transactions = new String[Index][3];
    static int bookQuantity = 0;
    static int transactionQuantity = 0;
    static int userQuantity = 0;


    public static void main(String[] args) {
        int i ;
        String bookName;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the name of the book you want to search");
        bookName = scan.nextLine();

        for(i=0 ; i<=Index ; i++){

            if(bookName.equals("books[i][0]")){
                System.out.println("Book Name = books[i][0]");
                System.out.println("ISBN = books[i][1]");
                System.out.println("Author = books[i][2]");
                System.out.println("Number of Pages = books[i][3]");
            }


            else{}

        }
                System.out.println("The book you are looking for is not registered in the system:");

    }



}