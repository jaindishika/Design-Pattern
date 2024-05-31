package com.designPattern.observer;

public class    DataSource extends Subject{
    public int getValue() {
        return value;
    }

//    public void setValue(int value) {
//        this.value = value;
//        notifyObserver(value);
//    }
    public void setValue(int value) {
        this.value = value;
        notifyObserver();
    }

    private int value;
}
