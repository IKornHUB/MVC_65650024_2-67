import java.util.*;
class SuitData {
    private List<HeroSuit> suits;
    private List<String> logs;

    public SuitData() {
        suits = new ArrayList<>();
        logs = new ArrayList<>();
        generateSampleData();
    }

    private void generateSampleData() {
        String[] types = {"Power Suit", "Stealth Suit", "Incognito Suit"};
        Random rand = new Random();
        for (int i = 1; i <= 50; i++) {
            suits.add(new HeroSuit(String.format("%06d", i), types[i % 3], rand.nextInt(101)));
        }
        suits.add(new HeroSuit("111100", "Power Suit", 99));
        suits.add(new HeroSuit("111101", "Power Suit", 20));
        suits.add(new HeroSuit("111110", "Stealth Suit", 99));
        suits.add(new HeroSuit("111111", "Stealth Suit", 20));
        suits.add(new HeroSuit("111120", "Incognito Suit", 99));
        suits.add(new HeroSuit("111121", "Incognito Suit", 20));
    }

    public HeroSuit findSuit(String id) {
        return suits.stream().filter(s -> s.id.equals(id)).findFirst().orElse(null);
    }

    public void updateSuit(HeroSuit suit) {
        for (int i = 0; i < suits.size(); i++) {
            if (suits.get(i).id.equals(suit.id)) {
                suits.set(i, suit);
                return;
            }
        }
    }

    public void addLog(String log) {
        logs.add(log);
    }

    public List<String> getLogs() {
        return logs;
    }
}