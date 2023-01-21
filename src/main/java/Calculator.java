import java.util.Scanner;

public class Calculator {

    int number;
    String products = "";
    float amount = 0;

    public int numberPeople() {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("На скольки человек необходимо разделить счет?");
            if(scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number == 1)
                    System.out.println("Нет смысла ничего делить");
                else if (number < 1)
                    System.out.println("Введено некорректное количество");
                else
                    break;
            }
            else
                System.out.println("Введите целое положительное число:");
        }
        return number;
    }
    public void addProduct() {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            AddProduct nomenclature = new AddProduct();
            nomenclature.addproduct();
            amount += nomenclature.price;
            products = products +"\n"+ nomenclature.product;
            System.out.println("Вы хотите добавить еще один товар? Если нет, введите завершить");
            String complete = scanner.next();
            if (complete.equalsIgnoreCase("Завершить"))
                break;
        }

    }

    public void totals(){

        String rub;

        System.out.println("Добавленные товары: \n" + products);
        System.out.println("Стоимость товаров: " + amount);

        int lastnumber = (int) (Math.floor(amount/number)%10);
        int ostatok = (int) ((amount/number)%100);

        if (ostatok>=11 && ostatok<=14)
            rub = "рублей";
        else
        {
            int ostatok10 = (int) ((amount/number)%10);

            if (ostatok10==1)
                rub = "рубль";
            else if (ostatok10>=2 && ostatok10<=4)
                rub = "рубля";
            else
                rub = "рублей";
        }

        System.out.println("Каждый должен заплатить: " + String.format("%.2f",amount/number)+" "+rub);

    }

}
