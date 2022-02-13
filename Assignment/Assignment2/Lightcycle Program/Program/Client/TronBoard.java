package Program.Client;

import Program.Lightcycle;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.image.BufferedImage;

public class TronBoard extends JPanel
{
    private BufferedImage image;
    private ClientGUI client;

    public TronBoard(int x, int y, ClientGUI client)
    {
        // Initialize img here.
        this.client = client;
        image = new BufferedImage(x+40, y+40, BufferedImage.TYPE_INT_ARGB);
        Dimension size = new Dimension(image.getWidth(null), image.getHeight(null));
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setSize(size);
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
        // Draws the image to the canvas
        super.paintComponent(graphic);

        Color black = new Color(0, 0, 0);
        Color border = new Color(110, 147, 147);
        Color back = new Color(0, 0, 40);

        for (int i = 0; i < image.getWidth(); i++) {
            for (int j = 0; j < image.getHeight(); j++) {
                if(((i > 16 && i < 20) || (i > 999+20 && i < 1003+20) ) && j > 16 && j < 1003+20)
                    image.setRGB(i, j, border.getRGB());
                else if(((j > 16 && j < 20) || (j > 999+20 && j < 1003+20) ) && i > 16 && i < 1003+20)
                    image.setRGB(i, j, border.getRGB());
                else {
                    if (i >= 20 && i <= 999 + 20 && j >= 20 && j <= 999 + 20)
                        if ((i-21) % 50 == 0 || (j-21) % 50 == 0)
                            image.setRGB(i, j, black.getRGB());
                        else
                            image.setRGB(i, j, back.getRGB());
                    else
                        image.setRGB(i, j, black.getRGB());
                }
            }
        }

        if(client.lightCycles != null) {
            for (int i = 0; i < client.lightCycles.size(); ++i) {
                client.lightCycles.get(i).draw(image, 20, 20);
            }
        }

        graphic.drawImage(image, 0, 0, getWidth(), getHeight(), this);

        Graphics2D g2 = (Graphics2D)graphic;
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        if(client.gameOver){
            if(client.winner_ind >= 0) {
                g2.setColor(client.lightCycles.get(client.winner_ind).getClr());
                drawCenteredString(g2, client.lightCycles.get(client.winner_ind).getName() + " won the game!", new Rectangle(0, 200, 1040, 50), new Font("TimesRoman", Font.PLAIN, 40));

                for (int i = 0; i < client.leaderBoardScores.size(); ++i) {
                    int y = 300 + i * 40;
                    drawCenteredString(g2, String.format("%s : %d", client.leaderBoardNames.get(i), client.leaderBoardScores.get(i)), new Rectangle(0, y, 1040, 50), new Font("TimesRoman", Font.PLAIN, 30));
                }
            }
        }

        if(client.lightCycles != null){
            int interval = 900 / client.lightCycles.size();
            for (int i = 0; i < client.lightCycles.size(); ++i) {
                int x = 70 + interval * i;
                Lightcycle cycle = client.lightCycles.get(i);
                g2.setColor(cycle.getClr());
                drawCenteredString(g2, String.format("%s : %d", cycle.getName(), cycle.getLength()), new Rectangle(x, 0, interval, 20), new Font("TimesRoman", Font.PLAIN, 16));
            }
        }
    }
}

