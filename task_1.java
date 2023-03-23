/*1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
Реализовать в java.
2. Создать множество ноутбуков (ArrayList).
3. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
Выводить только те ноутбуки, что соответствуют условию.*/

import java.util.List;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Notebook ChuwiAH401 = new Notebook("Chuwi", "AH-401", "Black", 15.6, "LCD", 8, 256, "SSD", "Linux");
        Notebook SamsungS101 = new Notebook("Samsung", "S-101", "Black", 15.6, "LCD", 8, 512, "SSD", "Windows");
        Notebook SamsungS150 = new Notebook("Samsung", "S-150", "Green", 17.0, "TFT", 16, 512, "SSD", "Windows");
        Notebook AsusTUF504 = new Notebook("ASUS", "TUF-504", "Red", 15.6, "OLED", 32, 2048, "HDD 2.0", "Windows");
        Notebook AsusTUF555 = new Notebook("ASUS", "TUF-555", "White", 15.6, "TFT", 16, 1024, "SSD", "Windows");

        List<Notebook> notebookList = List.of(ChuwiAH401, SamsungS101, SamsungS150, AsusTUF504, AsusTUF555);

        Scanner scannerUser = new Scanner(System.in);
        System.out.println("Выберите параметр для поиска, где:\n1 - по цвету\n2 - по бренду\n3 - по объёму ОЗУ\n4 - по объёму диска\n5 - по ОС");
        int choiceUserSearch = scannerUser.nextInt();
        Scanner scannerRequestUserForSearch = new Scanner(System.in);
        System.out.println("Напишите интересующий параметр: ");
        String requestUserForSearch = scannerRequestUserForSearch.nextLine();

        switch (choiceUserSearch) {
            case 1:
                for (Notebook color : notebookList) {
                    if (color.getColor().equalsIgnoreCase(requestUserForSearch)) {
                        System.out.println(color.toString());
                    }
                }
                break;
            case 2:
                for (Notebook brand : notebookList) {
                    if (brand.getBrand().equalsIgnoreCase(requestUserForSearch)) {
                        System.out.println(brand.toString());
                    }
                }
                break;
            case 3:
                for (Notebook ram : notebookList) {
                    if (Integer.toString(ram.getRam()).equalsIgnoreCase(requestUserForSearch)) {
                        System.out.println(ram.toString());
                    }
                }
                break;
            case 4:
                for (Notebook rom : notebookList) {
                    if (Integer.toString(rom.getRom()).equalsIgnoreCase(requestUserForSearch)) {
                        System.out.println(rom.toString());
                    }
                }
                break;
            case 5:
                for (Notebook OS : notebookList) {
                    if (OS.getOS().equalsIgnoreCase(requestUserForSearch)) {
                        System.out.println(OS.toString());
                    }
                }
                break;
            default:
                System.out.println("Ошибка.\nВыберите параметр для поиска, где:\n1 - по цвету\n2 - по бренду\n3 - по объёму ОЗУ\n4 - по объёму диска\n5 - по ОС");
                break;
        }

        scannerUser.close();
        scannerRequestUserForSearch.close();

    }


}
