package etapa02.atividade04.questao05;

import java.util.Random;

public class BingoCard {
    private int cardId;
    private int[] numbers;
    private BingoSystem bingoSystem;

    public BingoCard(int cardId, int numberOfSlots, int maxNumber){
        this.cardId = cardId;
        Random random = new Random();
        numbers[numberOfSlots] = random.nextInt(maxNumber);
    }





}
