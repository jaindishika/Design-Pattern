package com.designPattern.state;

public class SelectionTool implements Tool{

    @Override
    public void mouseDown() {
        System.out.println("Selection Icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw rectangle");
    }
}
