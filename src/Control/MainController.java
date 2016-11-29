package Control;

import Model.Cards;
import View.MainFrame;

import javax.swing.*;


/**
 * Created by 204g05 on 15.11.2016.
 */
public class MainController {

    private MainFrame frame;
    private Cards cards;
    private JLabel newText;
    private JLabel text;

    public MainController(MainFrame frame){
        this.frame = frame;
        StackHandler newStack = new StackHandler(frame);
        Cards newCard = new Cards("Heart","4",100,100);
        frame.getActiveDrawingPanel().addObject(newCard);
        addText();
    }

    public String getCardsValue(){
        return this.cards.getValue();
    }
    public void addText() {
        text = new JLabel("4");
        newText.add(text);
        newText.setBounds(100, 200, 200, 100);

    }
}