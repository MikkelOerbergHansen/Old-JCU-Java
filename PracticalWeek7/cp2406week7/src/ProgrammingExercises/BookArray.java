package ProgrammingExercises;

/*Create an array that holds 10 Books, varying
Use for loop to display all books
* */

public class BookArray {
    //Using main function to run something as a program
    public static void main(String[] args) {

        //variable declaration for Array
        Book BookList[] = new Book[10];

        //add items to an array, starts at zero
        BookList[0] = new Fiction("Fahrenheit 451");
        BookList[1] = new NonFiction("The Theory of Everything");
        BookList[2] = new NonFiction("Java Programming 8th Edition");
        BookList[3] = new Fiction("Deltora Quest");
        BookList[4] = new Fiction("The Grandfather Clock");
        BookList[5] = new Fiction("Stormbreaker");
        BookList[6] = new Fiction("The Chronicles of Narnia");
        BookList[7] = new NonFiction("Sharks of the Reef");
        BookList[8] = new NonFiction("Lean UX");
        BookList[9] = new Fiction("The Hobbit");

        //Print array as a for loop
        for (int x = 0; x < BookList.length; ++x){
            System.out.println("Book: '" + BookList[x].getTitle() + "' | Cost is: $" + BookList[x].getPrice());
            if (x == (BookList.length -1) ){
                System.out.println(" ");
            }
            else {System.out.println("***Next Book***");}
        }

    }
}
