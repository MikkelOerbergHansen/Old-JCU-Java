package ProgrammingExercises;

public class TwelveInts {
    public static void main(String[] args)
    {
        int [] MyIntegers = {1,2,3,4,5,6,7,8,9,10,11,12};

        System.out.println("The twelve numbers from first to last: ");
        for (int integer : MyIntegers){
            System.out.print(integer);
            System.out.print(" ");
        }
        System.out.println("\n" + "The Twelve numbers from last to first: ");
        for(int x = MyIntegers.length; x > 0; --x){
            System.out.print(MyIntegers[x-1]);
            System.out.print(" ");
        }

    }
}
