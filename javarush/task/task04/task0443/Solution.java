package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String number01 = reader.readLine();
        int y = Integer.parseInt(number01);
        String number02 = reader.readLine();
        int m = Integer.parseInt(number02);
        String number03 = reader.readLine();
        int d = Integer.parseInt(number03);
        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + d + "." + m + "." + y);

        //напишите тут ваш код
    }
}
