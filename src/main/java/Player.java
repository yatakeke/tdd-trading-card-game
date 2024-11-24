import java.util.List;

public class Player {

    private int life;
    private String name;

    public static Player init(String name) {
        return new Player(20, name);
    }

    public static Player initPlayer1() {
        return new Player(20, "Player 1");
    }

    public static Player initPlayer2() {
        return new Player(20, "Player 2");
    }

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
