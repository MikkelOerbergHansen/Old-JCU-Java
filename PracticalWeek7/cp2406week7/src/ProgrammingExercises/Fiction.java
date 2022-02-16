package PracticalWeek7.cp2406week7.src.ProgrammingExercises;

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
