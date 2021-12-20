package kg.itacademy.fv21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AeroflotStore store = new AeroflotStore();

        int point;
        do {
            System.out.println("1. Добавить новый самолет");
            System.out.println("2. Показать все самолеты по типу самолета");
            System.out.println("3. Сортировать по номеру рейса");
            System.out.println("4. Вывести весь список");
            System.out.println("0. Завершить программу");
            point = scanner.nextInt();
            switch (point) {
                case 1:
                    Aeroflot newAeroflot = new Aeroflot();
                    System.out.println("Введите пункт назначения: ");
                    String dest = scanner.next();
                    newAeroflot.setDestionation(dest);
                    System.out.println("Введите номер рейса: ");
                    int number = scanner.nextInt();
                    newAeroflot.setFlightNumber(number);
                    System.out.println("Введите тип самолета: ");
                    String type = scanner.next();
                    newAeroflot.setAircraftType(type);
                    store.setSingleAeroflot(newAeroflot);
                    break;
                case 2:
                    System.out.println("Введите тип самолета: ");
                    String searchByType = scanner.next();
                    Aeroflot exist = store.searchAeroflotByType(searchByType);
                    if (exist != null) {
                        System.out.println("Не найдено");
                    }
                    break;
                case 3:
                    store.sortByBubble();
                    store.showAll();
                    break;
                case 4:
                    store.showAll();
            }
        } while (point != 0);

    }
}
