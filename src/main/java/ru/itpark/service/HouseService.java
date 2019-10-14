package ru.itpark.service;

import ru.itpark.model.Area;
import ru.itpark.model.Constants;
import ru.itpark.model.House;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HouseService {
    private List<House> houses;
    private Stream<House> stream;

    public HouseService() {
        houses = new ArrayList<>();
    }

    public void addHouse(House house) {
        houses.add(house);
    }

    public void searchByPrice(int min, int max) {
        stream = houses.stream();
        stream.filter(x -> x.getPrice() >= min)
                .filter(x -> x.getPrice() < max)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public void searchByArea(Area area) {
        stream = houses.stream();
        stream.filter(x -> x.getArea().equals(area))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public void initRandom() {
        Random random = new Random();
        Area area;
        int price;
        for (int i = 0; i < 10; i++) {
            price = random.nextInt((Constants.MAX_PRICE - Constants.MIN_PRICE) + 1) + Constants.MIN_PRICE;
            area = Area.values()[random.nextInt(Area.values().length)];
            houses.add(new House(i, price, area));
        }
    }

    public void showAll() {
        for (House house : houses) {
            System.out.println(house);
        }
    }
}
