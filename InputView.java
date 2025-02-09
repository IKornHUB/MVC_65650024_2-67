import javax.swing.*;

class InputView extends View {
    private JTextField suitIdField;
    private JButton checkButton;
    private SuitController controller;

    public InputView(SuitController controller) {
        super("Enter Suit ID");
        this.controller = controller;
        suitIdField = new JTextField(10);
        checkButton = new JButton("Check");
        add(new JLabel("Enter Suit ID:"));
        add(suitIdField);
        add(checkButton);
        checkButton.addActionListener(e -> controller.checkSuit(suitIdField.getText()));
    }
}