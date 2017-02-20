package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number01 = reader.readLine();
        int number1 = Integer.parseInt(number01);
        String number02 = reader.readLine();
        int number2 = Integer.parseInt(number02);
        String number03 = reader.readLine();
        int number3 = Integer.parseInt(number03);

        int a = 0;
        int b = 0;

        if (number1>=1){
            b = b +1;
        } else if (number1<=-1){
            a = a +1;
        }

        if (number2>=1){
            b = b +1;
        } else if (number2<=-1) {
            a = a +1;
        }

        if (number3>=1){
            b = b +1;
        } else if (number3<=-1) {
            a = a +1;
        }

        System.out.println("количество отрицательных чисел: " + a);
        System.out.println("количество положительных чисел: " + b);



        //напишите тут ваш код

    }
}
