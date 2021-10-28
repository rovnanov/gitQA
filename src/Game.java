public class Game {

    public static void svetoFor(boolean isGreenLight, int speedOfPlayer1, int speedOfPlayer2, int speedOfPlayer3) {
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
        System.out.println("Количество выбывающих игроков " + outPlayers);

    }
    public static void main(String[] args) {
        svetoFor(false,2,0,5);

    }

}
