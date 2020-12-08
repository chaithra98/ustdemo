package com.objects;

public class MainTextBack {

    public static void main(String[] args) {
	// write your code here
        var textBox1 = new TextBox();
        textBox1.setText("Mobiles");

        var textBox2 = new TextBox();
        textBox2.setText("Laptops");

        System.out.println(textBox2.text.toUpperCase());
    }
}
