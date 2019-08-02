package com.fizzli.spring.boot.hello.world.entity;

public class Phone {
    private String name;
    private String size;
    double money;


    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", money=" + money +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
