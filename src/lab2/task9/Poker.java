package lab2.task9;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        String[] suit = {"Ч", "Б", "П", "К"};
        String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "В", "Д", "К", "Т"};
        ArrayList<String> allCards = new ArrayList<>();
        ArrayList<String> mixedCards = new ArrayList<>();
        int n;


        for (String card : cards) {
            for (String s : suit) {
                allCards.add(card + s);
            }
        }


        Random random = new Random();

        while (true){
            int a = random.nextInt(allCards.size());
            mixedCards.add(allCards.get(a));
            allCards.remove(a);
            if (allCards.size() == 0){
                break;
            }
        }

        Scanner in = new Scanner(System.in);

        n = in.nextInt();

        for (int i = 0; i < n * 4; i++){
            System.out.print(mixedCards.get(i) + " ");
            if ((i + 1) % 4 == 0){
                System.out.println();
                System.out.println("-".repeat(50));
            }
        }

    }
}
