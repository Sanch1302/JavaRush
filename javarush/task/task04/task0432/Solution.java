package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String number01 = reader.readLine();
        int number = Integer.parseInt(number01);
        while (number>0){
            System.out.println(line);
            number--;
        }




        //напишите тут ваш код

    }
}
