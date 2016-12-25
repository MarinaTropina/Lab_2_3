package com.company;

/**
 * Created by user on 22.12.2016.
 */
//lab 2.3.1
public class MyWindow {
    double width;
    double height;
    int numberOfGlass;
    String color;
    boolean isOpen;

    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }
    //lab 2.3.2
    public void printFields() {
        System.out.println("Widht=" + width + ", height=" + height + ", numberOfGlass=" + numberOfGlass +
                ", color=" + color + ", isOpen=" + isOpen);
    }
    public MyWindow(){
        this.width = 3.6;
        this.height = 4.5;
        this.color = "black";

    }
    //lab 2.3.3
    public MyWindow(double width, double height){
        this.width = width;
        this.height = height;
    }
    public MyWindow(double width, double height, int numberOfGlass){
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
    }


}

