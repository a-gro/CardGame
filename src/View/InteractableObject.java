package View;

import java.awt.event.MouseEvent;

/**
 * Created by 204g05 on 28.11.2016.
 */
public interface InteractableObject extends DrawableObject{

    void keyPressed(int key);

    void keyReleased(int key);

    void mouseReleased(MouseEvent e);


}
