public class Game {

    private Situation current;

    public Game() {
        this.current = new Situation(PlayerFactory.initPlayer1(), PlayerFactory.initPlayer2());
    }

    public static Game init() {
        return new Game();
    }

    public void switchTurn() {
        this.current = new Situation(current.opponent(), current.active());
    }

    public void play(Card by) {
        this.current.attack(by);
    }

    public int opponentLife() {
        return this.current.opponent().life();
    }

    public int yourLife() {
        return this.current.active().life();
    }

    public String winner() {
        if (this.current.opponent().life() != 0) {
            return "NO ONE";
        }
        return current.active().name();
    }
}
