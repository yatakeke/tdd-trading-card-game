public class Game {

    private Situation current;

    public Game() {
        this.current = new Situation(Player.initPlayer1(), Player.initPlayer2());
    }

    public static Game init() {
        return new Game();
    }

    public Situation current() {
        return current;
    }

    public String winner() {
        return current.active().name();
    }

    public void switchActive() {
        this.current = new Situation(current.opponent(), current.active());
    }
}
