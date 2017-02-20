package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

public class Solution {
    public static void main(String[] args) {
        Cat catVaska = new Cat("Vaska" , 10 , 12 ,10);
        Cat catMasya = new Cat("Masya" , 12 , 14 ,22);
        Cat catPetya = new Cat("Petya" , 15 , 12 ,8);
        System.out.println((catVaska.fight(catMasya)));
        System.out.println((catVaska.fight(catPetya)));
        System.out.println((catMasya.fight(catPetya)));


        //напишите тут ваш код
    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
