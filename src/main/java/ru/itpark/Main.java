package ru.itpark;

import ru.itpark.model.Area;
import ru.itpark.model.House;
import ru.itpark.service.HouseService;

import java.util.List;
import java.util.Observable;

public class Main {
    public static void main(String[] args) {
        HouseService houseService = new HouseService();
        houseService.initRandom();
        houseService.addHouse(new House(10, 500_000, Area.BROOKLYN));

//        houseService.showAll();
//        houseService.searchByPrice(100_000, 500_000);
        printSearchByArea(houseService);
    }

    private static void printSearchByArea(HouseService houseService) {
        houseService.searchByArea(Area.BROOKLYN).forEach(System.out::println);
    }

}
