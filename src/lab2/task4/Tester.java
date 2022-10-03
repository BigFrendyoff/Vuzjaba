package lab2.task4;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        String motherboard;
        String CPU;
        int ram;

        Shop shop = new Shop();
        Scanner in = new Scanner(System.in);

        shop.addComputer(new Computer("Avrora", "ASUS", "Intel I5 5500", 4));

        System.out.println("Enter your desired motherboard: ");
        motherboard = in.nextLine();
        System.out.println("Enter your desired CPU: ");
        CPU = in.nextLine();
        System.out.println("Enter your desired amount of ram: ");
        ram =  in.nextInt();

        System.out.println(shop.findComputer(motherboard, CPU, ram));
    }
}
