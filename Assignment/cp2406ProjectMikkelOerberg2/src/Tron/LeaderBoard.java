package Assignment.cp2406ProjectMikkelOerberg2.src.Tron;


import javax.swing.JPanel;
import java.awt.*;
import java.awt.image.BufferedImage;



public class LeaderBoard extends JPanel {

    private BufferedImage image;
    private ClientGUI client;
    private final static int BOARD_SIZE = 600;

    public LeaderBoard(int x, int y, ClientGUI client)
    {
        // Initialize img here.
        this.client = client;
        image = new BufferedImage(x+40, y, BufferedImage.TYPE_INT_ARGB);
        Dimension size = new Dimension(image.getWidth(null), image.getHeight(null));
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setSize(size);
        setBackground(Color.BLACK);

    }


    public void drawCenteredString(Graphics g, String text, Rectangle rect, Font font) {
        // Get the FontMetrics
        FontMetrics metrics = g.getFontMetrics(font);
        // Determine the X coordinate for the text
        int x = rect.x + (rect.width - metrics.stringWidth(text)) / 2;
        // Determine the Y coordinate for the text (note we add the ascent, as in java 2d 0 is top of the screen)
        int y = rect.y + ((rect.height - metrics.getHeight()) / 2) + metrics.getAscent();
        // Set the font
        g.setFont(font);
        // Draw the String
        g.drawString(text, x, y);
    }


    public void paintComponent(Graphics graphic)
    {
        super.paintComponent(graphic);


        graphic.drawImage(image, 0, 0, getWidth(), getHeight(), this);

        Graphics2D g2 = (Graphics2D)graphic;
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        if(client.lightCycles != null){
            int interval = (BOARD_SIZE-BOARD_SIZE/10) / client.lightCycles.size();
            for (int i = 0; i < client.lightCycles.size(); ++i) {
                int x = 40 + (BOARD_SIZE/100*3) + interval * i;
                Lightcycle cycle = client.lightCycles.get(i);
                g2.setColor(cycle.getClr());
                drawCenteredString(g2, String.format("%s : %d", cycle.getName(), cycle.getLength()),
                        new Rectangle(x, 0, interval, 20), new Font("TimesRoman", Font.PLAIN, 16));
            }
        }

    }



}
