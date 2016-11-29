package Model;

import View.DrawingPanel;
import View.InteractableObject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;

/**
 * Created by 204g04 on 28.11.2016.
 */
public class Cards implements InteractableObject {

    private boolean flipped;
    private String suit;
    private String value;
    private double xPos;
    private double yPos;
    private Rectangle2D rectangle;

    public Cards(String suit, String value, double xPos, double yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.suit = suit;
        this.value = value;
        flipped = false;
        createGraphics();
    }

    private void createGraphics() {
        rectangle = new Rectangle2D.Double(xPos, yPos, 300, 500);
    }

    @Override
    public void draw(DrawingPanel dp, Graphics2D g2d) {
        g2d.setColor(new Color(0, 0, 0));
        g2d.draw(rectangle);
        if ("Heart".equals(suit) && flipped == true) {
            g2d.setColor(new Color(255, 0, 0));
            g2d.fill(rectangle);
        }
        if ("Diamond".equals(suit) && flipped == true) {
            g2d.setColor(new Color(255, 0, 0));
            g2d.fill(rectangle);
        }
        if ("Club".equals(suit) && flipped == true) {
            g2d.setColor(new Color(0, 0, 0));
            g2d.fill(rectangle);
        }
        if ("Spade".equals(suit) && flipped == true) {
            g2d.setColor(new Color(0, 0, 0));
            g2d.fill(rectangle);
        }
        if (flipped == false) {
            g2d.setColor(new Color(0, 255, 150));
            g2d.fill(rectangle);
        }
        if (flipped == true) {
            g2d.setColor(new Color(0, 0, 0));
            g2d.drawString(value, 250, 300);
        }

    }

    @Override
    public void update(double dt) {

    }

    @Override
    public void keyPressed(int key) {

    }

    @Override
    public void keyReleased(int key) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    public String getValue(){
        return value;
    }

}