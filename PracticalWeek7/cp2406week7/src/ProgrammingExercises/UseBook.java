package ProgrammingExercises;

//This class contains function to run the program as a demonstration
public class UseBook {
    public static void main(String[] args) {

        //Instantiate new objects by using 'new' keyword
        Book FictionBook = new Fiction("The Lord Of The Rings");
        Book NonFictionBook = new NonFiction("Fast Food Nation");

        //Print statements for each
        System.out.println("Fictional Book: '" + FictionBook.getTitle() +
                "' | Costs: $" + FictionBook.getPrice());
        System.out.println("**************************");
        System.out.println("Non Fictional Book: '" + NonFictionBook.getTitle() +
                "' | Costs: $" + NonFictionBook.getPrice());
        System.out.println("**************************");
    }
}
