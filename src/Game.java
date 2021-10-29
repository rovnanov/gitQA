public class Game {

    public static void svetoFor(boolean isGreenLight) {

        String status1, status2, status3;
        int playerSpeed1, playerSpeed2, playerSpeed3;
        playerSpeed1 = 2; playerSpeed2 = 0; playerSpeed3 = 5;


        if(!isGreenLight) {
            if (playerSpeed1 != 0) {
                System.out.println("Игрок 1 не выжил");
                status1 = "Не выжил";
            }
            else System.out.println("Игрок 1 выжил"); status1 = "Выжил";
            if (playerSpeed2 != 0) {
                System.out.println("Игрок 2 не выжил");
                status2 = "Не выжил";
            }
            else System.out.println("Игрок 2 выжил"); status2 = "Выжил";
            if (playerSpeed3 != 0) {
                System.out.println("Игрок 3 не выжил");
                status3 = "Не выжил";
            }
            else System.out.println("Игрок 3 выжил"); status3 = "Выжил";
        }
        else System.out.println("Все игроки выжили");

    }

    public static void main(String[] args) {
        svetoFor(false);
    }



}
