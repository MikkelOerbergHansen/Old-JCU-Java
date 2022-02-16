package Assignment.cp2406ProjectMikkelOerberg2.src.Tron;

public class LightcycleStep
{
    private int x;
    private int y;
    private boolean on;

    public LightcycleStep(int x, int y, boolean on)
    {
        this.x = x;
        this.y = y;
        this.on = on;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}

