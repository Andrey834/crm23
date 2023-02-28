import java.util.Scanner;

class Menu {
    static Scanner scanner = new Scanner(System.in);

    static void menu() {
        System.out.println("======================");
        System.out.println("| 1 | Продажа        |");
        System.out.println("| 2 | Покупка        |");
        System.out.println("| 3 | Номенклатура   |");
        System.out.println("| 4 | Контрагенты    |");
        System.out.println("| 5 | Финансы        |");
        System.out.println("| 6 | Отчеты         |");
        System.out.println("|--------------------|");
        System.out.println("| 7 | Выход          |");
        System.out.println("======================");
        System.out.print("Ввод:");
    }

    static void menuSale() {
        System.out.println("Укажите покупателя");
        String i = scanner.nextLine();
        System.out.print("Ввод:");
    }

    static void menuBuyer() {
        System.out.println("Укажите поставщика");
        String i = scanner.nextLine();
        System.out.print("Ввод:");
    }


}