package ru.itpark.service;

import ru.itpark.model.Area;
import ru.itpark.model.Constants;
import ru.itpark.model.House;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class HouseService {
    private List<House> houses = new ArrayList<>();

    public void addHouse(House house) {
        houses.add(house);
    }

    public List<House> searchByPrice(int min, int max) {
        return houses.stream().filter(x -> x.getPrice() >= min)
                .filter(x -> x.getPrice() <= max)
                .collect(Collectors.toList());
    }

    public List<House> searchByArea(Area area) {
        return houses.stream().filter(x -> x.getArea()
                .equals(area))
                .collect(Collectors.toList());
    }

    public void fillWithRandomData() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int price = random.nextInt((Constants.MAX_PRICE - Constants.MIN_PRICE) + 1) + Constants.MIN_PRICE;
            Area area = Area.values()[random.nextInt(Area.values().length)];
            houses.add(new House(i, price, area));
        }
    }

    public List<House> getAll() {
        return houses;
    }
}
