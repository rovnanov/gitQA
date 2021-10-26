class Main {
    public static void main(String[] args) {
        boolean isGreenLight = false;

        int speedOfPlayer1 = 5;
        int speedOfPlayer2 = 4;
        int speedOfPlayer3 = 3;


        // Допишите здесь логику так, что будет подсчитано и выведено
        // количество игроков, которые выбывают.
        // Если свет зелёный, то проходят все игроки (0 выбывают).
        // Если свет красный, то выбывает каждый, чья скорость не 0.

        int outPlayers = 0;

        if(!isGreenLight){
            if(speedOfPlayer1 != 0){
                outPlayers = outPlayers + 1;
            }
            if(speedOfPlayer2 != 0){
                outPlayers = outPlayers + 1;
            }
            if(speedOfPlayer3 != 0){
                outPlayers = outPlayers + 1;
            }
        }
        else outPlayers = 0;

        System.out.print("Количество выбывших игроков: ");
        System.out.print(outPlayers);

    }
}
