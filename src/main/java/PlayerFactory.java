public class PlayerFactory {

    public static Player init(String name) {
        return new Player(20, name);
    }

    public static Player initPlayer1() {
        return new Player(20, "Player 1");
    }

    public static Player initPlayer2() {
        return new Player(20, "Player 2");
    }
}
