package com.inheritance;

public class UIControl {
    private boolean isEnabled = true;

//    public UIControl(boolean isEnabled){
//        this.isEnabled = isEnabled;
//        System.out.println("UI Controls");
//    }

    public void render(){
    }

    public void enable(){
        isEnabled = true;
    }

    public void disable(){
        isEnabled = false;
    }

    public boolean isEnabled(){
        return isEnabled;
    }

}
