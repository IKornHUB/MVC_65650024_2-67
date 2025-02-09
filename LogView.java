import java.util.*;
import javax.swing.*;

class LogView extends View {
    private JButton close ;
    public LogView(List<String> logs) {
        super("Repair Log");
        JTextArea logArea = new JTextArea(10, 30);
        for (String log : logs) {
            logArea.append(log + "\n");
        }
        add(new JScrollPane(logArea));
        close = new JButton("close log");
        add(close);
        close.addActionListener(e -> { this.setVisible(false);});
    }
}