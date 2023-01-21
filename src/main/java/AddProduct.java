import java.util.Scanner;

public class AddProduct {

    String product;
    float price;

    public void addproduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название товара");
        this.product = scanner.next();
        while (true) {
            System.out.println("Введите цену товара");
            scanner = new Scanner(System.in);
            if (scanner.hasNextFloat()) {
                this.price = scanner.nextFloat();
                if (this.price > 0) {
                    System.out.println("Товар успешно добавлен");
                    break;
                } else {
                    System.out.println("Введите число больше 0");
                    scanner = new Scanner(System.in);
                }

            } else {
                System.out.println("Введите положительное число");
                scanner = new Scanner(System.in);
            }
        }

    }
}
