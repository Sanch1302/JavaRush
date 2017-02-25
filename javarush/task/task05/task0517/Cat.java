package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    private String name;
    private  int age;
    private int weight;
    private String address;
    private String color;

    public Cat(String name){
        this.name = name;
        this.age = 5;
        this.weight = 3;
        this.color = "black";
    }

    public Cat(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "black";
    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 3;
        this.color = "black";
    }

    public Cat(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.age = 5;
    }

    public Cat(int weight, String color, String address){
        this.address = address;
        this.weight = weight;
        this.color = color;
        this.age = 5;
    }






    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
