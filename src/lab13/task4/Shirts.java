package lab13.task4;

public class Shirts {
    private String number;
    private String product;
    private String color;
    private String size;

    public Shirts(String number, String product, String color, String size) {
        this.number = number;
        this.product = product;
        this.color = color;
        this.size = size;
    }

    public String toString(){
        return "Артикул: " + number + ", Наименование: " + product + ", Цвет: " + color + ", Размер: " + size;
    }

}
