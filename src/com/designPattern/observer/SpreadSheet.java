package com.designPattern.observer;

public class SpreadSheet implements Observer{
    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    private DataSource dataSource;

    @Override
    public void update() {
        System.out.println("Spreadsheet got notified : " + dataSource.getValue());
    }
//    @Override
//    public void update(int value) {
//        System.out.println("Spreadsheet got notified!!" + value);
//    }
}
