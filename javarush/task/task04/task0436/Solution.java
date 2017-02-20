package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number01 = reader.readLine();
        int n = Integer.parseInt(number01);
        String number02 = reader.readLine();
        int m = Integer.parseInt(number02);

        for ( ; n>0  ; n-- ) {
            for ( int i =0; m>i ; i++) {
                System.out.print("8");
            }
            System.out.println("");
        }
        //напишите тут ваш код
    }
}
