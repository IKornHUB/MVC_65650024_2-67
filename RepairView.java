import javax.swing.*;

class RepairView extends View {
    private JButton repairButton;
    private SuitController controller;

    public RepairView(SuitController controller, HeroSuit suit) {
        super("Repair Suit");
        this.controller = controller;
        add(new JLabel("Suit ID: " + suit.id));
        add(new JLabel("Type: " + suit.type));
        add(new JLabel("Durability: " + suit.durability));
        repairButton = new JButton("Repair");
        add(repairButton);
        repairButton.addActionListener(e -> {controller.repairSuit(suit); this.setVisible(false);});
    }
}
