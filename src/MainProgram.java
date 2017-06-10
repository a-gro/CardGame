import Control.MainController;
import View.MainFrame;

import java.awt.*;

/**
 * Created by 204g05 on 28.11.2016.
 */
public class MainProgram {

    public static void main (String[] args){
        EventQueue.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        MainProgram.setup();
                    }
                });
    }

    private static void setup(){
        new MainController(new MainFrame("Kartenspiel",50,50,1100,900));
    }
}
//test