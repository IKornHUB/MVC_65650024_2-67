class SuitController {
    private SuitData suitData;
    private SuitCheckerModel suitCheckerModel;
    private RepairModel repairModel;

    public SuitController() {
        suitData = new SuitData();
        suitCheckerModel = new SuitCheckerModel(suitData);
        repairModel = new RepairModel(suitData);
        new InputView(this).setVisible(true);
    }

    public void checkSuit(String id) {
        HeroSuit suit = suitCheckerModel.checkSuit(id);
        if (suit == null) {
            new ResponseView("Suit not found.").setVisible(true);
            return;
        }
        if (!suitCheckerModel.isValid(suit)) {
            new RepairView(this, suit).setVisible(true);
        } else {
            new ResponseView("Suit is valid.").setVisible(true);
        }
    }

    public void repairSuit(HeroSuit suit) {
        repairModel.repairSuit(suit);
        new ResponseView("Suit repaired.").setVisible(true);
        new LogView(suitData.getLogs()).setVisible(true);
    }
}