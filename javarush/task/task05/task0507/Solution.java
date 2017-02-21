package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = -1;
        double summa = 0;
        double kolichestvoRaz = 0;
        while (true)
        {
            String number01 = reader.readLine();
            int number1 = Integer.parseInt(number01);
            if (number1 == a){
                break;}
            summa = summa + number1;
            kolichestvoRaz++;
        }
        double sredneeZnachenie;
        System.out.println(sredneeZnachenie = summa / kolichestvoRaz);




        //напишите тут ваш код
    }
}

