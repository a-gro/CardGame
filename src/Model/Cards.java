package Model;

import View.DrawingPanel;
import View.InteractableObject;
import Model.Suits;
import Model.Values;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;

/**
 * Created by 204g04 on 28.11.2016.
 */
public class Cards implements InteractableObject {

    private boolean flipped;
    private Suits suit;
    private Values value;
    private double xPos;
    private double yPos;
    private Rectangle2D rectangle;

    public Cards(Suits suit, Values value, double xPos, double yPos) {
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
        if (Suits.HEART.equals(suit) && flipped) {
            g2d.setColor(new Color(255, 255, 255));
            g2d.fill(rectangle);
            g2d.setColor(new Color(255, 0, 0));
            g2d.drawString("♥",(int)xPos+149, (int)yPos+50);
            g2d.drawString("♥",(int)xPos+149, (int)yPos+450);
        }
        if (Suits.DIAMOND.equals(suit) && flipped) {
            g2d.setColor(new Color(255, 255, 255));
            g2d.fill(rectangle);
            g2d.setColor(new Color(255, 0, 0));
            g2d.drawString("♦",(int)xPos+149, (int)yPos+50);
            g2d.drawString("♦",(int)xPos+149, (int)yPos+450);
        }
        if (Suits.CLUB.equals(suit) && flipped) {
            g2d.setColor(new Color(255, 255, 255));
            g2d.fill(rectangle);
            g2d.setColor(new Color(0, 0, 0));
            g2d.drawString("♣",(int)xPos+149, (int)yPos+50);
            g2d.drawString("♣",(int)xPos+149, (int)yPos+450);
        }
        if (Suits.SPADE.equals(suit) && flipped) {
            g2d.setColor(new Color(255, 255, 255));
            g2d.fill(rectangle);
            g2d.setColor(new Color(0, 0, 0));
            g2d.drawString("♠",(int)xPos+149, (int)yPos+50);
            g2d.drawString("♠",(int)xPos+149, (int)yPos+450);
        }
        if (!flipped) {
            g2d.setColor(new Color(0, 255, 150));
            g2d.fill(rectangle);
        }
        if (flipped) {
            g2d.setColor(new Color(0, 0, 0));
            g2d.drawString(value.toString(), (int)xPos+140, (int)yPos+250);
        }
    }

    public void flip() {
        this.xPos = xPos+600;
        rectangle.setFrame(xPos, yPos, 300,500);
        flipped = true;
    }

    public Values getValue(){
        return value;
    }

    public Suits getSuit(){
        return suit;
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
}