package Program;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Lightcycle
{

    public static int DOWN=0;
    public static int LEFT=1;
    public static int UP=2;
    public static int RIGHT=3;
    private ArrayList<LightcycleStep> steps;
    private int lastBroadCastStep = 0;
    private int dir;
    private int length;
    private int speed;
    private boolean jetWall;
    private String name;
    private String color;
    private Color clr;
    private boolean alive;

    public ArrayList<LightcycleStep> getSteps() {
        return steps;
    }

    public void setSteps(ArrayList<LightcycleStep> steps) {
        this.steps = steps;
    }

    public int getLastBroadCastStep() {
        return lastBroadCastStep;
    }

    public void setLastBroadCastStep(int lastBroadCastStep) {
        this.lastBroadCastStep = lastBroadCastStep;
    }

    public int getDir() {
        return dir;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isJetWall() {
        return jetWall;
    }

    public void setJetWall(boolean jetWall) {
        this.jetWall = jetWall;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Color getClr() {
        return clr;
    }

    public void setClr(Color clr) {
        this.clr = clr;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public Lightcycle(String name, String color, int speed, int dir, boolean jetWall) {
        this.name = name;
        this.color = color;
        this.lastBroadCastStep = 0;
        this.speed = speed;
        this.dir = dir;
        this.jetWall = jetWall;
        this.steps = new ArrayList<>();
        this.alive = true;
        this.length = 0;

        clr = new Color(0, 0, 0);
        if(color.equals("red"))
            clr = new Color(255, 0, 0);
        else if(color.equals("blue"))
            clr = new Color(0, 0, 255);
        else if(color.equals("green"))
            clr = new Color(0, 155, 0);
        else if(color.equals("yellow"))
            clr = new Color(255, 255, 0);
        else if(color.equals("cyan"))
            clr = new Color(0, 255, 255);
        else if(color.equals("magenta"))
            clr = new Color(255, 0, 255);
        else if(color.equals("gray"))
            clr = new Color(80, 80, 80);
        else if(color.equals("white"))
            clr = new Color(255, 255, 255);
        else if(color.equals("purple"))
            clr = new Color(80, 0, 80);
        else if(color.equals("orange"))
            clr = new Color(255, 80, 0);
    }

    public String getStepString(int ind) {
        LightcycleStep step = steps.get(ind);
        return name+","+String.valueOf(step.getX())+","+String.valueOf(step.getY())+","+(step.isOn()?"on":"off");
    }

    public void moveOneStep(BufferedImage image) {
        if(steps.size() == 0)
            return;
        LightcycleStep lastStep = steps.get(steps.size()-1);
        Color white = new Color(255, 255, 255);
        for (int i = 0; i < speed; ++i) {
            int x, y;
            if (dir == UP) {
                x = lastStep.getX();
                y = lastStep.getY() - i - 1;
            } else if (dir == DOWN) {
                x = lastStep.getX();
                y = lastStep.getY() + i + 1;
            } else if (dir == LEFT) {
                x = lastStep.getX() - i - 1;
                y = lastStep.getY();
            } else{
                x = lastStep.getX() + i + 1;
                y = lastStep.getY();
            }
            if(x < 0 || y < 0 || x >= 1000 || y >= 1000) {
                alive = false;
                break;
            }
            int pos_clr = image.getRGB(x, y);
            if (pos_clr == 0) {
                addStep(x, y, jetWall);
                if(jetWall)
                    image.setRGB(x, y, white.getRGB());
            } else {
                alive = false;
                break;
            }
        }
    }

    synchronized public void addStep(int x, int y, boolean jetWall){
        steps.add(new LightcycleStep(x, y, jetWall));
        if(jetWall) {
            length++;
        }
    }

    public void speedUp() {
        if (speed < 10)
            ++speed;
    }

    public void speedDown() {
        if (speed > 1)
            --speed;
    }

    public void turnClockwise() {
        if (dir == UP)
            dir = RIGHT;
        else if(dir == DOWN)
            dir = LEFT;
        else if(dir == LEFT)
            dir = UP;
        else
            dir = DOWN;
    }

    public void turnAnticlockwise() {
        if (dir == UP)
            dir = LEFT;
        else if(dir == DOWN)
            dir = RIGHT;
        else if(dir == LEFT)
            dir = DOWN;
        else
            dir = UP;
    }

    public void draw(BufferedImage image, int off_x, int off_y) {
        for(int i = 0; i < steps.size(); ++i) {
            LightcycleStep step = steps.get(i);
            if(step.isOn() || i == steps.size() - 1) {
                image.setRGB(step.getX() + off_x, step.getY() + off_y, clr.getRGB());
            }else{
                image.setRGB(step.getX()+off_x, step.getY()+off_y, Color.white.getRGB());
            }
        }
    }
}

