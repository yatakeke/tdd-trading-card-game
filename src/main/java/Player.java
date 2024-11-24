import java.util.List;

public class Player {

    private int life;

    public static Player init() {
        return new Player(20);
    }
    public Player(int life) {
        this.life = life;
    }

    public int life() {
        return life;
    }

    public List<Card> hands() {
        return null;
    }

    public void attack(Card by, Player opponent) {
        opponent.damage(by.cost());
    }

    private void damage(int cost) {
        this.life -= cost;
    }
}
