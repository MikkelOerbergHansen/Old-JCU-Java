// Some circle statistics
package miscCode.cp2406_farrell8_ch04.DebuggingExercises;

public class FixDebugFour2
{
    public static void main(String args[])
    {
        double radius = 12.6;
        System.out.println("Circle statistics");
        double area = java.lang.Math.PI * radius * radius;
        System.out.println("The area is " + area);
        double diameter = 2 * radius;
        System.out.println("The diameter is " + diameter);
    }
}
