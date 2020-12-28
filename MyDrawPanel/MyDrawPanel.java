import java.awt.*;
import javax.swing.*;

class MyDrawPanel extends JPanel {

    public void paintComponent(Graphics g){
        Image image = new ImageIcon(getClass().getResource("rick.jpeg")).getImage();
        g.drawImage(image, 0, 0, this);
    }
}