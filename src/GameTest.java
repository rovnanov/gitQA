import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    public void checkStatusIfSpeed10() {

        int speed = 10;
        boolean actual = Game.isLose(speed);
        boolean expected = false;

        Assertions.assertEquals(actual, expected, "Должен быть FALSE при скорости 10");
    }

    @Test
    public void checkStatusIfSpeed0() {

        int speed = 0;
        boolean actual = Game.isLose(speed);

        Assertions.assertEquals(true, actual, "Должен быть TRUE при скорости 0");
    }

    @Test
    public void checkStatusIfSpeedNegative() {

        int speed = -5;
        boolean actual = Game.isLose(speed);

        Assertions.assertFalse(actual, "Должен быть FALSE при отрицательной скорости");
    }
}
