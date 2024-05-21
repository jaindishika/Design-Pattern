package com.designPattern.state;

public class Canvas {
    public Tool getCurrentToolType() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }

    private Tool currentTool;
    public void mouseDown(){
        currentTool.mouseDown();
    }
    public void mouseUp(){
        currentTool.mouseUp();
    }

}
