import org.postgresql.Driver;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver();


        Scanner scanner = new Scanner(System.in);

        while (true) {
            Menu.menu();
            String i = scanner.nextLine();
            if (i.equals("1") | i.equals("продажа")  | i.equals("Продажа")) {
                Menu.menuSale();
            }
            else if (i.equals("2") | i.equals("покупка")  | i.equals("Покупка")) {
                Menu.menuBuyer();
            }
            else if (i.equals("3") | i.equals("номенклатура")  | i.equals("Номенклатура")) {
            }
            else if (i.equals("4") | i.equals("контрагенты")  | i.equals("Контрагенты")) {
            }
            else if (i.equals("5") | i.equals("финансы")  | i.equals("Финансы")) {
            }
            else if (i.equals("6") | i.equals("отчеты")  | i.equals("Отчеты")) {
            }
            else if (i.equals("0") | i.equals("выход")  | i.equals("Выход")) {
                break;
            }
            else {
                System.out.println("Неверная команда!");
            }
        }
    }
}