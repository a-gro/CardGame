package View;

import java.awt.*;

/**
 * Created by 204g05 on 28.11.2016.
 */
public interface DrawableObject {

    void draw(DrawingPanel dp, Graphics2D g2d);

    void update(double dt);

}
