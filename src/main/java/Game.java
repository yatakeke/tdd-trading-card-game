public class Game {

    private Situation current;

    public Game() {
        this.current = new Situation(Player.init(), Player.init());
    }

    public static Game init() {
        return new Game();
    }

    public Situation current() {
        return current;
    }

    public String winner() {
        return "Player 1";
    }

    public void switchActive() {
        this.current = new Situation(current.opponent(), current.active());
    }
}
