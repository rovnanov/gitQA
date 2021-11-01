public class Game {
    public static boolean isGreen;

    public static int OutCount(int[] speed) {
        int count = 0;
        for (int i = 0; i < speed.length; i++) {
            if (!isGreen) {
                if (speed[i] != 0) {
                    count = count + 1;
                }
            }
        }
        return count;

    }

    public static int[] LoseArray(int[] speed) {
        int LoseNumber = 0;
        for (int i = 0; i < speed.length; i++) {
            if (!isGreen) {
                if (speed[i] != 0) {
                    LoseNumber = LoseNumber + 1;
                }
            }
        }

        int[] LoseCountArray = new int[LoseNumber];
        int o = 0;
        for (int i = 0; i < speed.length; i++) {
            if (!isGreen) {
                if (speed[i] != 0) {
                    LoseCountArray[o] = speed[i];
                    o = o + 1;
                } else {
                    LoseCountArray[i] = speed[i + 1];
                    i = i + 1;
                    o = o + 1;
                }
            }
        }
        return LoseCountArray;
    }

    public static int[] WonArray(int[] speed) {
        int WonNumber = 0;
        for (int i = 0; i < speed.length; i++) {
            if (!isGreen) {
                if (speed[i] == 0) {
                    WonNumber = WonNumber + 1;
                }
            } else {
                WonNumber = WonNumber + 1;
            }
        }

        int[] WonCountArray = new int[WonNumber];
        int o = 0;
        for (int i = 0; i < speed.length; i++) {
            if (!isGreen) {
                if (speed[i] == 0) {
                    WonCountArray[o] = speed[i];
                    o = o + 1;
                }
            } else {
                WonCountArray[i] = speed[i];
            }
        }
        return WonCountArray;

    }

    public static void main(String[] args) {
        isGreen = false;
        int[] speeds = {1, 0, 5, 10, -1};
        int losecount = OutCount(speeds);
        int[] lose = LoseArray(speeds);
        int[] won = WonArray(speeds);
        System.out.println("Количество выбывших = " + losecount);
        System.out.println();
        System.out.println("Массив из скоростей выбывающих: ");
        for (int i = 0; i < lose.length; i++) {
            System.out.println(lose[i]);
        }
        System.out.println();
        System.out.println("Массив из скоростей не выбывающих: ");
        for (int i = 0; i < won.length; i++) {
            System.out.println(won[i]);
        }


    }
}