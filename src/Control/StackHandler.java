package Control;

import Model.Card;
import Model.Stack;
import View.DrawingPanel;
import View.InteractableObject;
import View.MainFrame;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 * Created by 204g05 on 28.11.2016.
 */
public class StackHandler implements InteractableObject {

    private Stack<Card> concealedCards; //verdeckt
    private Stack<Card> revealedCards; //aufgedeckt

    public StackHandler (MainFrame frame) {
        concealedCards = new Stack<>();
        frame.getActiveDrawingPanel().addObject(this);
        revealedCards = new Stack<>();
        frame.getActiveDrawingPanel().addObject(this);
    }

    public void keyPressed(int key) {
        if(key == KeyEvent.VK_SPACE) {
            flipConcealed();
        }
    }

    public void keyReleased(int key) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void draw(DrawingPanel dp, Graphics2D g2d) {

    }

    public void update(double dt) {

    }

    public String flipConcealed() {
        if(!concealedCards.isEmpty()) {
            revealedCards.push(concealedCards.top());
            concealedCards.pop();
            return "Siehe da, eine neue Karte wurde geöffnet!";
        }
        return "Stapel leer!";
    }
}
