import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by branden on 2/11/16 at 11:07.
 */
public class CharacterTest {

    @Test
    public void testBattle() throws Exception {
        //test objects
        Player player = new Player();
        Enemy enemy = new Enemy("Test Enemy", 5, 5);
        player.name = "Test Player";

        player.battle(enemy);

        assertTrue(player.health > 0);
        assertTrue(enemy.health <= 0);

    }
}