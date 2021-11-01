import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class GameTest {

    @Test
    public void CorrectOutPlayersData() {
        int[] test = {3,2,1};

        int actual = Game.OutCount(test);
        int expected = 3;

        Assertions.assertEquals(actual,expected);


    }
    @Test
    public void LoseArrayWorksCorrect() {
        int[] test = {1, 0, 5, 10, -1};

        int[] actual = Game.LoseArray(test);
        int[] expected = {1, 5, 10, -1};

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void WonArrayWorksCorrect() {
        int[] test = {0, 0, 5, 2};

        int[] actual = Game.WonArray(test);
        int[] expected = {0, 0};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void OutNumberNegativeZeroTest() {
        int[] test = {};

        int actual = Game.OutCount(test);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}
