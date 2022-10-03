package lab2.task8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringArrayReverse {
    public static void main(String[] args) {
        String[] strings = new String[5];

        strings[0] = "A";
        strings[1] = "B";
        strings[2] = "C";
        strings[3] = "D";
        strings[4] = "E";

        for (String str: strings) {
            System.out.println(str);
        }

        int g = strings.length - 1;

        for (int i = 0; i < ((strings.length - 1) / 2); i++){
            String temp = strings[i];
            strings[i] = strings[g];
            strings[g] = temp;
            g--;
        }

        System.out.println("-".repeat(50));

        for (String str: strings) {
            System.out.println(str);
        }




    }
}
