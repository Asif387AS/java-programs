class Library{
    String[]  Books;
    int no_of_books;
    Library(){
        Books=new String[100];
        no_of_books=0;
    }
    void addBooks(String book){
        this.Books[no_of_books]=book;
        no_of_books ++;
        System.out.println(book+"has beed added");
    }
    void showAvailableBooks(){
        System.out.println("available Books are");
        for ( String book:this.Books) {
            if(book==null){
//                System.out.println("library is empty");
                continue;
            }
            System.out.println("*"+book);
        }
    }
    void isssueBook(String book){
        for (int i=0; i<this.Books.length;i++){
            if (this.Books[i].equals(book)){
                System.out.println("book has been issued");
                this.Books[i]=null;
                return;

            }


        }
        System.out.println("book is not available");
    }
    void returnBook(String book){
        addBooks(book);
        System.out.println("book has been returned");

    }
    }


public class exercise4_Library_books {
    public static void main(String[] args) {
Library li=new Library();
li.addBooks("payam e mashrq");
li.addBooks("Java");

li.addBooks("C#");
li.showAvailableBooks();
li.isssueBook("C#");
        li.showAvailableBooks();
        li.returnBook("C#");
        li.showAvailableBooks();
    }
}
