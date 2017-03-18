package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String a = "сумма";
        int summa = 0;
        while (true)
        {
            String word = reader.readLine();
            if (word.equals(a)){
                break;}
            int number1 = Integer.parseInt(word);
            summa = summa + number1;

        }
        System.out.println(summa);

        //напишите тут ваш код
    }
}
