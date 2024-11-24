import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    private Game game;

    @BeforeEach
    void setUp() {
        this.game = Game.init();
    }

    @Test
    @DisplayName("activePlayerは自分のターンに相手にダメージを与えられる")
    public void activePlayerCanAttack() {

        game.play(new Card(1));

        assertEquals(19, game.current().opponent().life());
    }

    @Test
    @DisplayName("activePlayerがターンを終了すると入れ替わる")
    public void changeActivePlayer() {

        game.play(new Card(1));
        game.switchTurn();

        assertEquals(19, game.current().active().life());
    }
    @Nested
    class canJudgeWinner {
        @Test
        @DisplayName("player1はコスト1のカードで20回攻撃すると勝利する")
        public void player1CanWin() {

            for (int i = 0; i < 19; i++) {
                game.play(new Card(1));
                game.switchTurn();
                // game.play(new Card(1));
                game.switchTurn();
            }

            game.play(new Card(1));

            assertEquals(0, game.current().opponent().life());
            assertEquals("Player 1", game.winner());
        }

        @Test
        @DisplayName("player2はコスト1のカードで20回攻撃すると勝利する")
        public void player2CanWin() {

            for (int i = 0; i < 19; i++) {
                // game.play(new Card(1));
                game.switchTurn();
                game.play(new Card(1));
                game.switchTurn();
            }

            // game.play(new Card(1));
            game.switchTurn();
            game.play(new Card(1));

            assertEquals(0, game.current().opponent().life());
            assertEquals("Player 2", game.winner());
        }

        @Test
        @DisplayName("相手のライフがゼロでない時にwinnerはいない")
        public void noOneIsWinner() {
            assertEquals("NO ONE", game.winner());
        }
    }
}