package com.javarush.task.task01.task0130;

/* 
Наш первый конвертер!
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertCelsiumToFahrenheit(40));
    }

    public static double convertCelsiumToFahrenheit(int celsium) {
        double c = celsium;
        double TF = (9 * c / 5) + 32;
        return TF;
        //ишите тут ваш код
    }
}