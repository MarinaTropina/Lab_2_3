package com.company;

public class Main {

    public static void main(String[] args) {
        //lab 2.3.1
        MyWindow o1 = new MyWindow(3.2, 4.5, 2, "red", false);
        MyWindow o2 = new MyWindow(4.1, 1.2, 1, "green", false);
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


    MyWindow[] myWindows = new MyWindow[4];
        myWindows[0]=new MyWindow(1.6,4.5,2,"red",false);
        myWindows[1]=new MyWindow(2.8,4.5, 2 );
        myWindows[2]=new MyWindow(5.4,4.5);
        myWindows[3]=new MyWindow();
        System.out.println("Выведем данные 1 элемента массива:");
        myWindows[0].printFields();
        System.out.println("Выведем данные 2 элемента массива:");
        myWindows[1].printFields();
        System.out.println("Выведем данные 3 элемента массива:");
        myWindows[2].printFields();
        System.out.println("Выведем данные 4 элемента массива:");
        myWindows[3].printFields();

        System.out.println();
        System.out.println("Выведем данные всех элементов массива:");
        for (int i = 0; i < myWindows.length; i++) {
            myWindows[i].printFields();
        }
}
    }
