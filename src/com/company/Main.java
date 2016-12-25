package com.company;

public class Main {

    public static void main(String[] args) {
	    //lab 2.3.1
        MyWindow o1 = new MyWindow(3.2, 4.5, 2,"red", false);
	    MyWindow o2 = new MyWindow(4.1, 1.2, 1, "green", false );
        MyWindow o3 = new MyWindow(2, 2.2, 4, "yellow", true);
        MyWindow o4 = new MyWindow(1.8, 3.5, 3, "blue", true);
        MyWindow o5 = new MyWindow(1.1, 2, 6, "white", false);
        System.out.println("Выведем данные 1 объекта:");
        o1.printFields();
        System.out.println("Выведем данные 2 объекта:");
        o2.printFields();
        System.out.println("Выведем данные 3 объекта:");
        o3.printFields();
        System.out.println("Выведем данные 4 объекта:");
        o4.printFields();
        System.out.println("Выведем данные 5 объекта:");
        o5.printFields();

        //lab 2.3.2
        MyWindow o6 = new MyWindow();
        System.out.println("Выведем данные 6 объекта:");
        o6.printFields();
    }


}
