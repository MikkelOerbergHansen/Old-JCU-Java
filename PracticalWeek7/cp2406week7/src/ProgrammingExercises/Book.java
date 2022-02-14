package ProgrammingExercises;

//Parent abstract class
/*Include a String field for book's title
  Double for book's price

  Two get methods, one that returns title, other: price
  Include abstract method = setPrice()
* */

public abstract class Book {

    //variable declaration
    String title;
    double price;

    //Public class Book:
    public Book(String name){

        title = name;
    }

    //abstract set method
    public abstract void setPrice();

    // get methods
    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}

