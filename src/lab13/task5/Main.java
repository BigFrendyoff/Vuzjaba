package lab13.task5;

public class Main {
    public static void main(String[] args) {
        PhoneNumber phoneNumber1 = new PhoneNumber("+79175655655");
        PhoneNumber phoneNumber2 = new PhoneNumber("+10428965221");
        PhoneNumber phoneNumber3 = new PhoneNumber("89175655655");

        System.out.println(phoneNumber1.toString());
        System.out.println(phoneNumber2.toString());
        System.out.println(phoneNumber3.toString());
    }
}
