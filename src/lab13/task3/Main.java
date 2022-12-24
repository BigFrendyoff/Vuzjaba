package lab13.task3;

public class Main {
    public static void main(String[] args) {
        Addresses addresses = new Addresses();
        addresses.setAddressWithSplit("Россия, Московская область, Москва, Первомайская, 4, 2, 68");
        addresses.printFields();
        System.out.println("-".repeat(50));
        addresses.setAddressWithSplit("Россия, Ярославская область, Ярославль, Пушкинская, 13, 1, 89");
        addresses.printFields();
        System.out.println("-".repeat(50));
        addresses.setAddressWithToken("Россия. Калужская область. Калуга. Вишневского. 65. 1. 4");
        addresses.printFields();
        System.out.println("-".repeat(50));
        addresses.setAddressWithToken("Россия; Нижегородская область; Нижний Новгород; Ленина; 17; 3; 24");
        addresses.printFields();
    }
}
