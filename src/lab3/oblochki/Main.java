package lab3.oblochki;

import lab2.task7.Book;

public class Main {
    public static void main(String[] args) {
        Double db = Double.valueOf("21.5");
        System.out.println(db);
        db = Double.parseDouble("89.9");
        System.out.println(db);
        int i = db.intValue();
        short g = db.shortValue();
        byte b = db.byteValue();
        long l = db.longValue();
        float f = db.floatValue();
        String d = Double.toString(3.14);


    }
}
