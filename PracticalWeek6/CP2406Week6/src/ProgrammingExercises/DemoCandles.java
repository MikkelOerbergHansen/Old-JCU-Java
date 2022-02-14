package ProgrammingExercises;

public class DemoCandles {
    public static void main(String args[])
    {
        Candle candle1 = new Candle();
        ScentedCandle candle2 = new ScentedCandle();
        candle1.setHeight(5);
        candle1.setColor("pink");
        candle2.setHeight(5);
        candle2.setColor("white");
        candle2.setScent("lavender");
        ScentedCandle candle3 = new ScentedCandle(6, "Black", "peach");
        System.out.println("first candle is " + candle1.getHeight() + " inches, and have " +
               candle1.getColor() + " color. The price is $" + candle1.getPrice());

        System.out.println("second candle is " + candle2.getHeight() + " inches, the color is " +
                candle2.getColor() + " and, it has a " + candle2.getScent() + " scent." +
                " The price is $" + candle2.getPrice());

        System.out.println("third candle is " + candle3.getHeight() + " inches, the color is " +
                candle3.getColor() + " and, it has a " + candle3.getScent() + " scent." +
                " The price is $" + candle3.getPrice());

    }
}
