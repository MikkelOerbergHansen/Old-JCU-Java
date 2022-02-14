package ProgrammingExercises;

public class DemoBlankets
{
    public static void main(String[] args)
    {
        Blanket b = new Blanket();
        System.out.println(b.toString());
        b.setMaterial("wool");
        System.out.println(b.toString());
        b.setSize("Queen");
        System.out.println(b.toString());
        b.setMaterial("Fleece");
        System.out.println(b.toString()); // Fleece is not a material - so default is set
        b.setSize("King");
        System.out.println(b.toString());
        b.setSize("Extra large");
        System.out.println(b.toString()); // Extra large is nt a size - so default is set
//------------------------------
        System.out.println();
        ElectricBlanket e = new ElectricBlanket();
        System.out.println(e.toString());
        e.setMaterial("cashmere");
        System.out.println(e.toString());
        e.setSettings(3);
        e.setMaterial("wool");
        System.out.println(e.toString());
        e.setSize("Double");
        System.out.println(e.toString());
        e.setHasAutoShutoff(true);
        System.out.println(e.toString());
        e.setSettings(10);
        System.out.println(e.toString());         // number is to high - settings is set to default
        e.setHasAutoShutoff(false);
        System.out.println(e.toString());
    }
}
