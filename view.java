import javax.swing.*;
import java.awt.*;

abstract class View extends JFrame {
    public View(String title) {
        setTitle(title);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
    }
}