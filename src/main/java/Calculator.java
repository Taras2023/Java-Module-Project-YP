import java.util.Scanner;

public class Calculator {

    Scanner scanner = new Scanner(System.in);
    int number;
    String products = "";
    float amount = 0;

    Calculator(){
        numberPeople();
        addProduct();
        totals();
    }

    public void numberPeople() {

        while (true) {
            System.out.println("На скольки человек необходимо разделить счет?");
            number = scanner.nextInt();
            if (number == 1)
                System.out.println("Нет смысла ничего делить");
            else if (number < 1)
                System.out.println("Введено некорректное количество");
            else
                break;
        }
    }
    public void addProduct() {

        while (true) {
            AddProduct nomenclature = new AddProduct();
            amount += nomenclature.price;
            products = products +"\n"+ nomenclature.product;
            System.out.println("Вы хотите добавить еще один товар?");
            String complete = scanner.next();
            if (complete.equalsIgnoreCase("Завершить"))
                break;
        }

    }

    public void totals(){

        System.out.println("Добавленные товары: \n" + products);
        System.out.println("Стоимость товаров: " + amount);//String.format("%.2f",amount));
        int lastnumber = (int) (Math.floor(amount/number)%10);
        String rub;
        if (lastnumber==0 || lastnumber>4)
            rub = "рублей";
        else if (lastnumber==1)
            rub = "рубль";
        else
            rub = "рубля";

        System.out.println("Каждый должен заплатить: " + String.format("%.2f",amount/number)+" "+rub);

    }

}
