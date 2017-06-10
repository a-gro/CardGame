package Control;

import Model.Cards;
import Model.Stack;
import Model.Suits;
import Model.Values;
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

    private Stack<Cards> concealedCards; //verdeckt
    private Stack<Cards> revealedCards; //aufgedeckt
    private int cSize = 52;
    private int rSize = 0;

    public StackHandler (MainFrame frame) {
        concealedCards = new Stack<>();
        frame.getActiveDrawingPanel().addObject(this);
        revealedCards = new Stack<>();
        frame.getActiveDrawingPanel().addObject(this);
        for (int i = 0; i < cSize; i++) {
            Cards newCard = new Cards(Suits.getRandom(), Values.getRandom(),100,100);
            /*for (int j = 0; j < i; j++) {
                if (newCard.getValue() == concealedCards.) {
                    ANTI-GLEICHE-KARTEN-SYSTEM GEHT NICHT EINFACH, WEIL STACK. DAURCH AKTUELLE KARTE NICHT MIT ALLEN ABGLEICHBAR (AUSSER MAN ERSTELLT EIN PAAE HILFSSTACKS ODER EINEN HILFSARRAY, KOPIERT NACHEINANDER ALLE KARTEN RÜBER UND BEIM EINZELNEN KOPIEREN GLEICHT MAN MIT NEWCARD AB).
                }
            }*/
            concealedCards.push(newCard);
            frame.getActiveDrawingPanel().addObject(newCard);
        }
        /*for (int i = 0; i < rSize; i++) {
            Cards newCard = new Cards(concealedCards.top().getSuit(),concealedCards.top().getValue(),700,100);
            revealedCards.push(newCard);
            frame.getActiveDrawingPanel().addObject(newCard);
        }*/
    }

    public void keyPressed(int key) {
        if(key == KeyEvent.VK_SPACE) {
            flipConcealed();
        }
        /*if(key == KeyEvent.VK_BACK_SPACE) {
            flipRevealed();
        }*/
    }

    public void keyReleased(int key) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void draw(DrawingPanel dp, Graphics2D g2d) {

    }

    public void update(double dt) {

    }

    public void flipConcealed() {
        if(!concealedCards.isEmpty()) {
            revealedCards.push(concealedCards.top());
            rSize++;
            concealedCards.pop();
            cSize--;
            revealedCards.top().flip();
        }
    }

    /*public void flipRevealed() { FUNKTIONIERT NOCH NICHT, DA FOR-SCHLEIFE DES VERDECKTEN STAPELS IM KONSTRUKTOR.
        if(!revealedCards.isEmpty()) {
            concealedCards.push(revealedCards.top());
            cSize++;
            revealedCards.pop();
            rSize--;
            concealedCards.top().flip();
        }
    }*/
}
