import java.util.Scanner;

public class AddProduct {

    String product;
    float price;

    AddProduct()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название товара");
        this.product = scanner.next();
        System.out.println("Введите цену товара");
        this.price = scanner.nextFloat();
        System.out.println("Товар успешно добавлен");
    }

}
