/**
 * Created by paschall on 28/09/14.
 */

import javax.swing.*;
import java.awt.*;

public class HelloComponent extends JComponent {
    public void paintComponent( Graphics g) {
        g.drawString("Hello Averie Bean", 125,95);

    }
}
