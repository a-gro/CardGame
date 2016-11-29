package Control;

import View.MainFrame;
import Model.Stack;

/**
 * Created by 204g05 on 28.11.2016.
 */
public class MainController {

    private MainFrame frame;

    public MainController(MainFrame frame){
        this.frame = frame;
        StackHandler newStack = new StackHandler(frame);
    }
}
