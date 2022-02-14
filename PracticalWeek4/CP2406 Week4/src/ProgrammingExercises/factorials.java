package ProgrammingExercises;

public class factorials {
    public static void main(String[] args) {
        int start = 1;
        int end = 10;
        String output;
        int y;
        int result;

        for (int x = start; x <= end; ++x) {
            output = "\n";
            output = output + "factorial(" + x + ") = " + x;
            y = x - 1;
            result = x;
            while (y > 0){
                output = output + " * " + y;
                result = result * y;
                y = y - 1;
            }
            output = output + " = " + result;
            System.out.println(output);
        }
    }
}
