class RepairModel {
    private SuitData suitData;

    public RepairModel(SuitData suitData) {
        this.suitData = suitData;
    }

    public void repairSuit(HeroSuit suit) {
        suit.durability = Math.min(100, suit.durability + 25);
        suitData.updateSuit(suit);
        suitData.addLog("Repaired suit " + suit.id + " to durability " + suit.durability);
    }
}