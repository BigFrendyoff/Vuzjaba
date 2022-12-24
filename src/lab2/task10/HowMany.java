package lab2.task10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        while (true){
            String inpt = in.nextLine();
            n += inpt.split(" ").length;
            System.out.println(n);
            if (inpt.equals("stop")){
                break;
            }
        }
        System.out.println(n);
    }
}
