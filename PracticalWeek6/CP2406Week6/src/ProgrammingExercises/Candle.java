package PracticalWeek6.CP2406Week6.src.ProgrammingExercises;

public class Candle {
    public int height = 0;
    public String color = "";
    public int price = 0;

    private int PricePerInch = 2;


    public Candle(int candleHeight, String candleColor) {
        height = candleHeight;
        color = candleColor;
        price = height * PricePerInch ;
    }

    public Candle() {
    }

    public void setHeight(int candleHeight) {
        this.height = candleHeight;
        this.price = height * PricePerInch;
    }

    public void setColor(String candleColor) {
        this.color = candleColor;
    }


    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }
}

