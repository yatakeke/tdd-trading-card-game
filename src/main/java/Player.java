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
        return List.of(
                new Card(0),
                new Card(1),
                new Card(2)
                );
    }

    public void attack(Card by, Player opponent) {
        opponent.damage(by.cost());
    }

    private void damage(int cost) {
        this.life -= cost;
    }
}
