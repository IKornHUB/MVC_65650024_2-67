public class IncognitoSuit {
    public boolean isValid(HeroSuit suit) {
        return suit.durability % 10 != 3 && suit.durability % 10 != 7;
    }
}
