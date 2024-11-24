import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    @DisplayName("1のコストを持つカードで相手を攻撃すると相手のライフが１減る")
    public void playerCanAttackBy1CostCard() {
        var active = new Player();
        var opponent = new Player();

        var card = new Card();
        active.attack(card, opponent);

        assertEquals(1, opponent.life());
    }
}