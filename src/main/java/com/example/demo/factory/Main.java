package com.example.demo.factory;

public class Main {

    public static void main(String[] args) {


        DoughnutFactory doughnutFactory = new DoughnutFactory();
        doughnutFactory.getDoughnut(DoughnutTypes.CHOCOLATE).eat();
        doughnutFactory.getDoughnut(DoughnutTypes.CHERRY).eat();
        doughnutFactory.getDoughnut(DoughnutTypes.ALMOND).eat();
    }
}
