package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = -1;
        int summa = 0;
        while (true)
        {
            String number01 = reader.readLine();
            int number1 = Integer.parseInt(number01);
            if (number1 == a){
                summa = summa + number1;
                break;}
            summa = summa + number1;


        }
        System.out.println(summa);








        //напишите тут ваш код
    }
}
