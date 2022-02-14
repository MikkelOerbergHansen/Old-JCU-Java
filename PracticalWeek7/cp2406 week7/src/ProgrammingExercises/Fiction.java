package ProgrammingExercises;

/*Child of Book Class
  setPrice() method for fiction returning: 24.99
* */

public class Fiction extends Book {

    public Fiction(String title){

        super(title);
        setPrice();
    }

    public void setPrice(){
        super.price = 24.99;

    }

}
