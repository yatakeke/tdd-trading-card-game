import java.util.List;

public class Player {

    private int life;
    private final String name;

    public Player(int life, String name) {
        this.life = life;
        this.name = name;
    }

    public int life() {
        return life;
    }

    public String name() {
        return name;
    }

    public List<Card> hands() {
        // FIXME: fake it で実装している
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
