package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        int a = Integer.parseInt(a1);
        if ((a % 2 == 0) && ( a < 0)){
            System.out.println("отрицательное четное число");
        } else if ((a % 2 != 0) && ( a < 0)){
            System.out.println("отрицательное нечетное число");
        }  else if ((a % 2 == 0) && ( a > 0)){
            System.out.println("положительное четное число");
        } else if ((a % 2 != 0) && ( a > 0)){
            System.out.println("положительное нечетное число");
        } else if (a == 0) {
            System.out.println("ноль");
        }
        //напишите тут ваш код
    }
}
