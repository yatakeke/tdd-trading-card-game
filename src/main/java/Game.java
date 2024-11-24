public class Game {

    private Situation current;

    public Game() {
        this.current = new Situation(Player.init(), Player.init());
    }

    public Situation current() {
        return current;
    }

    public String winner() {
        return null;
    }

    public void switchActive() {
        this.current = new Situation(current.opponent(), current.active());
    }
}
