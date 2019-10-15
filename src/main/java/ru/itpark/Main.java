package ru.itpark;

import ru.itpark.model.Area;
import ru.itpark.model.House;
import ru.itpark.service.HouseService;

public class Main {
    public static void main(String[] args) {
        HouseService houseService = new HouseService();
        houseService.fillWithRandomData();
        houseService.addHouse(new House(10, 500_000, Area.BROOKLYN));

//        printAll(houseService);
        houseService.searchByPrice(100_000, 500_000);
//        printSearchByArea(houseService);
    }

    private static void printAll(HouseService houseService) {
        houseService.getAll().forEach(System.out::println);
    }

    private static void printSearchByArea(HouseService houseService) {
        houseService.searchByArea(Area.BROOKLYN).forEach(System.out::println);
    }

}
