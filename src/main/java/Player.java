public class Player {

    private int life;
    public Player(int life) {
        this.life = life;
    }

    public int life() {
        return life;
    }

    public void attack(Card by, Player opponent) {
        opponent.damage(by.cost());
    }

    private void damage(int cost) {
        this.life -= cost;
    }
}
