public class Main {
    static int Index = 50;
    static String[][] books = new String[Index][4];
    static String[][] users = new String[Index][4];
    static String[][] transactions = new String[Index][3];
    static int bookQuantity = 0;
    static int transactionQuantity = 0;
    static int userQuantity = 0;


    public static void main(String[] args) {

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

   
}