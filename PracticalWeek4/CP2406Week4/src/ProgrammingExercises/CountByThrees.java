package ProgrammingExercises;

public class CountByThrees {
    public static void main(String[] args)
    {
        int start = 3;
        int end = 300;
        int increment = 3;
        String out = "This is the counting by threes \n";

        out = out + " 3";
        for (int x = start; x < end;){
            x = x + increment;
            if (x % 30 == 0){
                out = out + " " + x + "\n";
            }
            else
                out = out + " " + x;
        }
        System.out.println(out);

    }
}
