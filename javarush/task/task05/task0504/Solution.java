package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

import java.util.concurrent.Callable;

public class Solution {
    public static void main(String[] args) {
        Cat catVaska = new Cat("Vaska" , 10 , 12 ,10);
        Cat catMasya = new Cat("Masya" , 12 , 14 ,22);
        Cat catPetya = new Cat("Petya" , 15 , 12 ,8);



        //напишите тут ваш код
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}