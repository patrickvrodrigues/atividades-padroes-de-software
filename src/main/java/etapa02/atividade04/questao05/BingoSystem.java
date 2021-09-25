package etapa02.atividade04.questao05;

import java.util.List;
import java.util.Random;

public class BingoSystem {
    private BingoSystem bingoSystem;
    private List<BingoCardObserver> bingoCard;
    private int numberDrawn;
    private boolean gameEnded;


    public BingoSystem getBingoSystem(){
        return this.bingoSystem;
    }

    public void subscribe(BingoCardObserver bingoCardObserver){
        bingoCard.add(bingoCardObserver);
    }

    public int startBingo(int maxNumber){
        Random random = new Random();
        return random.nextInt(maxNumber);

    }

    public void bingo(String message){
        System.out.println(bingoCard);
    }
}
