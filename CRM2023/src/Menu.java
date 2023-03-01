import java.util.Scanner;
import java.util.Date;

class Menu {
    static Date date = new Date();
    static Scanner scanner = new Scanner(System.in);

    static void menu() {
        System.out.println("===============================");
        System.out.println("|         CRM2023v0.1b        |");
        System.out.println("|---------++++++++++++--------|");
        System.out.println("|" + date + "|");
        System.out.println("===============================");
        System.out.println("| 1 | Продажа                 |");
        System.out.println("| 2 | Покупка                 |");
        System.out.println("| 3 | Номенклатура            |");
        System.out.println("| 4 | Контрагенты             |");
        System.out.println("| 5 | Финансы                 |");
        System.out.println("| 6 | Отчеты                  |");
        System.out.println("|-----------------------------|");
        System.out.println("| 0 | Выход                   |");
        System.out.println("===============================");
        System.out.print("Ввод:");
    }

    static void menuSale() {
        System.out.println("        Выбор покупателя       ");
        System.out.println("===============================");
        System.out.println("| 1 | Розничный покупатель    |");
        System.out.println("| 2 | Выбор...                |");
        System.out.println("|-----------------------------|");
        System.out.println("| 0 | Отмена                  |");
        System.out.println("===============================");
        System.out.print("Ввод:");
        String i = scanner.nextLine();
    }

    static void menuBuyer() {
        System.out.println("Укажите поставщика");
        String i = scanner.nextLine();
        System.out.print("Ввод:");
    }
}