package com.inheritance;

public class TextBox extends UIControl{
    private String text = "";

//    public TextBox(){
//        super(true);
//        System.out.println("Text Box");
//    }

    @Override
    public void render(){
        System.out.println("Render TextBox");
    }

    @Override
    public String toString(){
        return text;
    }

    public void setText(String txt){
        this.text = txt;
    }

    public void clear() { text = ""; }
}
