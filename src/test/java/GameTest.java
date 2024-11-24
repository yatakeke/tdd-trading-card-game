import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    @Disabled
    @DisplayName("コスト1のカードでライフ1の相手プレイヤーを攻撃すると勝利する")
    public void activePlayerCanWin() {
        var game = new Game();

        game.current().attack(new Card(1));

        assertEquals("Player 1", game.winner());
    }

}