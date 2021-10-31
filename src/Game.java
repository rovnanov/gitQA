public class Game {
    public static boolean isGreen;

    public static boolean isLose(int speed) {

        boolean result;

        if (isGreen == false) {
            if (speed != 0) {
                result = false;
            } else {
                result = true;
            }
        } else {
            result = true;
        }
        return result;

    }

    public static void main(String[] args) {

        boolean status = isLose(0);
        System.out.println("Статус игрока = " + status);

    }
}