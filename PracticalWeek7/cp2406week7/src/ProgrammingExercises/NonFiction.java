package ProgrammingExercises;

/*Child of Book Class
    Requires setPrice method of returning 37.99
* */

public class NonFiction extends Book {

    public NonFiction(String title){

        //Parent class called in relation to a variable to be added in UseBook Class via an object
        super(title);
        setPrice();
    }

    public void setPrice() {
        super.price = 37.99;
    }
}
