package lab13.task2;

public class Main {
    public static void main(String[] args) {
        Person myFullName = new Person("Golanov", "Andrey", "Anatolecich");
        Person somebody = new Person("Ivanov", "", "");

        System.out.println(myFullName.getFullName());
        System.out.println(somebody.getFullName());
    }
}
