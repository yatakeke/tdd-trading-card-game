import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    @DisplayName("activePlayerは自分のターンに相手にダメージを与えられる")
    public void activePlayerCanAttack() {
        var game = new Game();

        game.current().attack(new Card(1));

        assertEquals(19, game.current().opponent().life());
    }

    @Test
    @DisplayName("activePlayerがターンを終了すると入れ替わる")
    public void changeActivePlayer() {
        var game = new Game();

        game.current().attack(new Card(1));
        game.switchActive();

        assertEquals(19, game.current().active().life());
    }

    @Test
    public void player1CanWin() {
        var game = new Game();

        for (int i = 0; i < 19; i++) {
            game.current().attack(new Card(1));
            game.switchActive();
            game.switchActive();
        }

        game.current().attack(new Card(1));

        assertEquals(0, game.current().opponent().life());
        assertEquals("Player 1", game.winner());
    }
}