package ProgrammingExercises;

public class DiagonalOs {
    public static void main (String args[])
    {
        String TheO = "O";
        String Space = " ";
        int NumberOfSpaces = 0;
        String Output = "";
        for (int x = 0; x < 10;){
            for (int y = 0; y < NumberOfSpaces;){
                Output = Output + Space;
                y = y + 1;
            }
            Output = Output + TheO + "\n";
            NumberOfSpaces = NumberOfSpaces + 1;
            x = x +1;
        }
        System.out.println(Output);

    }
}
