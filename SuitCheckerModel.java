class SuitCheckerModel {
    private SuitData suitData;
    private PowerSuit powerSuit;
    private StealthSuit stealthSuit;
    private IncognitoSuit incognitoSuit;

    public SuitCheckerModel(SuitData suitData) {
        this.suitData = suitData;
        this.powerSuit = new PowerSuit();
        this.stealthSuit = new StealthSuit();
        this.incognitoSuit = new IncognitoSuit();
    }

    public HeroSuit checkSuit(String id) {
        return suitData.findSuit(id);
    }

    public boolean isValid(HeroSuit suit) {
        if (suit == null) return false;
        switch (suit.type) {
            case "Power Suit":
                return powerSuit.isValid(suit);
            case "Stealth Suit":
                return stealthSuit.isValid(suit);
            case "Incognito Suit":
                return incognitoSuit.isValid(suit);
            default:
                return false;
        }
    }
}