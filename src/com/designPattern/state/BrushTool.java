package com.designPattern.state;

public class BrushTool implements Tool{
    @Override
    public void mouseDown() {
        System.out.println("Brush Icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Print Cylainder");
    }
}
