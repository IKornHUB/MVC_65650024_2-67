import javax.swing.*;

class ResponseView extends View {
    private JButton close;
    public ResponseView(String message) {
        super("Suit Status");
        add(new JLabel(message));
        close = new JButton("Ok!");
        add(close);
        close.addActionListener(e -> { this.setVisible(false);});
    }
}