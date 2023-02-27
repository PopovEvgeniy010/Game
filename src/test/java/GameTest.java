import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.Game;
import ru.netology.javaqa.NotRegisteredException;
import ru.netology.javaqa.Player;

public class GameTest {
    @Test
    public void test() {
        Game game = new Game();
        Player player = new Player(1, "Vasy", 55);
        Player player1 = new Player(2, "Pety", 33);
        game.register(player);
        game.register(player1);
        int actual = game.round("Vasy", "Pety");
        int expeted = 1;
        Assertions.assertEquals(expeted, actual);
    }

    @Test
    public void test2() {
        Game game = new Game();
        Player player = new Player(1, "Vasy", 55);
        Player player1 = new Player(2, "Pety", 33);
        game.register(player);
        game.register(player1);
        int actual = game.round("Pety", "Vasy");
        int expeted = 2;
        Assertions.assertEquals(expeted, actual);
    }

    @Test
    public void test3() {
        Game game = new Game();
        Player player = new Player(1, "Vasy", 55);
        Player player1 = new Player(2, "Pety", 55);
        game.register(player);
        game.register(player1);
        int actual = game.round("Pety", "Vasy");
        int expeted = 0;
        Assertions.assertEquals(expeted, actual);
    }

    @Test
    public void test4() {
        Game game = new Game();
        Player player = new Player(1, "Vasy", 55);
        Player player1 = new Player(2, "Pety", 55);
        game.register(player);
        game.register(player1);
        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Koly", "Pety");
        });
    }

    @Test
    public void test5() {
        Game game = new Game();
        Player player = new Player(1, "Vasy", 55);
        Player player1 = new Player(2, "Pety", 55);
        game.register(player);
        game.register(player1);
        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Vasy", "Geny");
        });
    }
}

