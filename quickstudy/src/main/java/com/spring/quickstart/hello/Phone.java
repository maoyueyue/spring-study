package com.spring.quickstart.hello;

public class Phone {
    private String bName;
    private int money;
    private String size;

    public Phone() {
    }

    public Phone(String bName, int money, String size) {
        this.bName = bName;
        this.money = money;
        this.size = size;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "bName='" + bName + '\'' +
                ", money=" + money +
                ", size='" + size + '\'' +
                '}';
    }
}
