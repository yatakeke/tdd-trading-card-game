public record Situation(Player active, Player opponent) {
    public void attack(Card card) {
        active.attack(card, opponent);
    }
}
