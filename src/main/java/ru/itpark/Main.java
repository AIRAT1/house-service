package ru.itpark;

import ru.itpark.model.Area;
import ru.itpark.model.House;
import ru.itpark.service.HouseService;

public class Main {
    public static void main(String[] args) {
        HouseService houseService = new HouseService();
        houseService.initRandom();
        houseService.addHouse(new House(10, 500_000, Area.Brooklyn));

//        houseService.showAll();
//        houseService.searchByPrice(100_000, 500_000);
        houseService.searchByArea(Area.Brooklyn);
    }

}
