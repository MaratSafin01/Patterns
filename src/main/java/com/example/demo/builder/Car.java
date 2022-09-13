package com.example.demo.builder;

public class Car {
    private String manufacturer;
    private String color;
    private int year;

    public Car(CarBuilder carBuilder) {
        this.manufacturer = carBuilder.manufacturer;
        this.color= carBuilder.color;
        this.year = carBuilder.year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    public static class CarBuilder {
        private String manufacturer;
        private String color;
        private int year;

        public CarBuilder(String manufacturer, String color, int year) {
            this.manufacturer = manufacturer;
            this.color = color;
            this.year = year;
        }

        public Car build() {
            return new Car(this);
        }
    }
}

class TestCar {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder("BMW", "yellow", 2017).build();
        System.out.println(car);
    }
}
