package lab13.task6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = "";
        String fileName = "C:\\Users\\BigFrendy\\IdeaProjects\\Vuz JABA\\src\\lab13\\task6\\" + scanner.nextLine() + ".txt";
        try {
            FileReader fileReader = new FileReader(fileName);
            int c;
            while ((c = fileReader.read()) != -1){
                string += (char) c;
            }
            System.out.println(getLine(string));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getLine(String string){
        StringBuilder stringBuilder = new StringBuilder();
        String elements[] = string.split(" ");
        System.out.println(elements[2]);
        stringBuilder.append(elements[0]);
        String currentWord = elements[0];
        ArrayList<String> usedWords = new ArrayList<>();
        usedWords.add(elements[0]);
        for (int i = 0; i < elements.length - 1; i++){
            for (int j = 1; j < elements.length; j++){
                if ((currentWord.toLowerCase(Locale.ROOT).charAt(currentWord.length() - 1)) == elements[j].toLowerCase(Locale.ROOT).charAt(0)
                && !usedWords.contains(elements[j])) {
                    usedWords.add(elements[j]);
                    currentWord = elements[j];
                    stringBuilder.append(" ");
                    stringBuilder.append(elements[j]);
                }
            }

        }
        return stringBuilder.toString();

    }

}
