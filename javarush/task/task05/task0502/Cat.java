package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {

    }



    public boolean fight(Cat anotherCat) {
        if ((this.age+this.weight+this.strength)>(anotherCat.age+anotherCat.weight+anotherCat.strength))
        return true;
        else return false;


        //напишите тут ваш код
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Vaska";
        cat1.age = 10;
        cat1.weight = 8;

        Cat cat2 = new Cat();
        cat2.name = "Masya";
        cat2.age = 10;
        cat2.weight = 8;

        cat1.fight(cat2);


    }
}
