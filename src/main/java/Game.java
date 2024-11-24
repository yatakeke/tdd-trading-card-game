public class Game {

    private Situation current;

    public Game() {
        this.current = new Situation(PlayerFactory.initPlayer1(), PlayerFactory.initPlayer2());
    }

    public static Game init() {
        return new Game();
    }

    public Situation current() {
        return current;
    }

    public String winner() {
        if (this.current.opponent().life() != 0) {
            return "NO ONE";
        }
        return current.active().name();
    }

    public void switchTurn() {
        this.current = new Situation(current.opponent(), current.active());
    }
}
