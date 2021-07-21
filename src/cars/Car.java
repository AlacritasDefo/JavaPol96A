package cars;

public class Car {
    private String mark;
    private String model;
    private int year;

    public void setPrice(double price) {
        this.price = price;
    }

    private double price;

    public Car(String mark, String model, int year, double price) {
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }
}
