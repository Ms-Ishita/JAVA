
public class Book {

    public static boolean Palindrome(String str, int s, int e){
       
        if(s>=e){
            return true;
        }
        if(str.charAt(s)!=str.charAt(e)){
            return false;
        }
        return Palindrome(str, s+1, e-1);
    }
    public static void main(String[] args) {
        String str = "abcba";
        int s = 0;
        int e = str.length()-1;
        System.out.println(Palindrome(str, s, e));
    }
}// public class Book {
//     private String title;
//     private String author;
//     private int publicationYear;

//     // Constructor for manual entry
//     public Book(String title, String author, int publicationYear) {
//         this.title = title;
//         this.author = author;
//         this.publicationYear = publicationYear;
//     }

//     // Copy constructor
//     public Book(Book other) {
//         this.title = other.title;
//         this.author = other.author;
//         this.publicationYear = other.publicationYear;
//     }

//     public void display() {
//         System.out.println("Title: " + title + ", Author: " + author + ", Publication Year: " + publicationYear);
//     }

//     public static void main(String[] args) {
//         // Manual entry
//         Book book1 = new Book("1984", "George Orwell", 1949);

//         // Copying from another book object
//         Book book2 = new Book(book1);

//         book1.display();
//         book2.display();
//     }
// }
/*public class Player {
    private static int nextID = 1;
    private int playerID;

    public Player() {
        this.playerID = nextID++;
    }

    public int getPlayerID() {
        return playerID;
    }

    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();

        System.out.println("Player 1 ID: " + player1.getPlayerID());
        System.out.println("Player 2 ID: " + player2.getPlayerID());
        System.out.println("Player 3 ID: " + player3.getPlayerID());
    }
}*/
