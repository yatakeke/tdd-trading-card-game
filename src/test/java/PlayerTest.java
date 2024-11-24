import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    @DisplayName("プレイヤーが初期化できる")
    public void canInitialize() {

        var player = Player.initPlayer1();
        assertEquals(3, player.hands().size());
        assertEquals(20, player.life());
    }

    @Nested
    class AttackTest {

        private Player active;
        private Player opponent;

        @BeforeEach
        public void setUp() {
            active = Player.initPlayer1();
            opponent = Player.initPlayer1();
        }

        @Test
        @DisplayName("1のコストを持つカードで相手を攻撃すると相手のライフを1減らせる")
        public void playerCanAttackBy1CostCard() {
            var card = new Card(1);

            active.attack(card, opponent);
            assertEquals(19, opponent.life());

            active.attack(card, opponent);
            assertEquals(18, opponent.life());
        }

        @Test
        @DisplayName("2のコストを持つカードで相手を攻撃すると相手のライフを2減らせる")
        public void playerCanAttackBy2CostCard() {
            var card = new Card(2);

            active.attack(card, opponent);
            assertEquals(18, opponent.life());
        }
    }
}