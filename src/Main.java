import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
 * Создать множество ноутбуков.
 * Написать метод, который будет запрашивать у пользователя критерий (или критерии)
 * фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map.
 * Например:
 * “Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем ЖД
 * 3 - Операционная система
 * 4 - Цвет …
 * Далее нужно запросить минимальные значения для указанных критериев - сохранить
 * параметры фильтрации можно также в Map.
 */

public class Main {
    public static void main(String[] args) {
        Notebook notebook = new Notebook("Asus", "Black");
        Notebook notebook1 = new Notebook("Samsung", "Yellow");

        Map<Integer, Notebook> results = new HashMap<>();
        results.put(1, notebook);
        results.put(2, notebook1);

        System.out.println(notebook);
        System.out.print("Введите: \n" +
                "1 - Поиск по критерию\n" +
                "2 - Сортировка по параметру\n");

        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("1 - Поиск по бренду\n" +
                        "2 - Поиск по цвету");
                int choice2 = sc.nextInt();

                //поиск по бренду или цвету:
                switch (choice2) {
                    case 1:
                        System.out.println("Введите наименование бренда: ");
                        String brand4search = (sc.next());
                        for (Map.Entry<Integer, Notebook> entry : results.entrySet()) {
                            if (entry.getValue().brand.toLowerCase().equals(brand4search)) {
                                System.out.println(entry.getValue());break;
                            }
                            else System.out.println("Не найдено: бренд");
                            break;
                        }
                    case 2:
                        System.out.println("Введите интересующий цвет: ");
                        String color4search = (sc.next());
                        for (Map.Entry<Integer, Notebook> entry : results.entrySet()) {
                            if (entry.getValue().color.toLowerCase().equals(color4search)) {
                                System.out.println(entry.getValue());break;
                            }
                            else System.out.println("Не найдено: цвет");
                            break;
                        }
                }break;


                //вывод по бренду или цвету:
            case 2:
                System.out.print("Введите цифру категории поиска: \n" +
                        "1 - Бренд\n" +
                        "2 - Цвет\n");
                int choice3 = sc.nextInt();
                switch (choice3) {
                    case 1:
                        System.out.print("Доступные бренды ноутов: \n");
                        for (Map.Entry<Integer, Notebook> entry : results.entrySet()) {
                            System.out.println(entry.getValue().brand);
                        }
                        break;
                    case 2:
                        System.out.print("Доступные цвета ноутов: \n");
                        for (Map.Entry<Integer, Notebook> entry : results.entrySet()) {
                            System.out.println(entry.getValue().color);
                        }
                        break;
                }break;

        }
    }
}

