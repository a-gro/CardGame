package Control;

import Model.Cards;
import View.MainFrame;

import javax.swing.*;


/**
 * Created by 204g05 on 15.11.2016.
 */
public class MainController {

    private MainFrame frame;

    public MainController(MainFrame frame){
        this.frame = frame;
        StackHandler concealedCards = new StackHandler(frame);
        StackHandler revealedCards = new StackHandler(frame);
        //frame.repaint();
    }

}