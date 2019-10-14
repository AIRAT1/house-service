package ru.itpark.model;

public class House {
    private long id;
    private int price;
    private Area area;

    public House(long id, int price, Area area) {
        this.id = id;
        this.price = price;
        this.area = area;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", price=" + price +
                ", area=" + area +
                '}';
    }
}
