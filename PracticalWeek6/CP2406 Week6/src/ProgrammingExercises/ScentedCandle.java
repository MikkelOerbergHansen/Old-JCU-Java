package ProgrammingExercises;

public class ScentedCandle extends Candle {
    public String Scent = "";
    private int PricePerInch = 3;

    public ScentedCandle(int CandleHeight, String CandleColor, String CandleScent) {

        super(CandleHeight, CandleColor);
        Scent = CandleScent;
        price = height * PricePerInch;
    }

    public ScentedCandle() {
    }

    public String getScent ()
    {
        return Scent;
    }
    public void setScent (String CandleScent)
    {
        Scent = CandleScent;
    }

    @Override
    public void setHeight(int CandleHeight)
    {
        this.height = CandleHeight;
        this.price = height * PricePerInch;
    }

}
