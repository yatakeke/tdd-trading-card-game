import org.junit.jupiter.api.Disabled;
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
}