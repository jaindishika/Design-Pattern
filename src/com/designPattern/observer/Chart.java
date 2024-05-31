package com.designPattern.observer;

public class Chart implements Observer{
    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    private DataSource dataSource;

    @Override
    public void update() {
        System.out.println("Chart got updated: " + dataSource.getValue());
    }
//    @Override
//    public void update(int value) {
//        System.out.println("Chart got updated!!" + value);
//    }
}
