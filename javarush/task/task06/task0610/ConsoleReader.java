package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();
        return word;

        //напишите тут ваш код
    }

    public static int readInt() throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        int number = Integer.parseInt(a1);
        return number;

        //напишите тут ваш код
    }

    public static double readDouble() throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        double numberDouble = Double.parseDouble(a1);
        return numberDouble;

        //напишите тут ваш код
    }

    public static boolean readBoolean() throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        boolean  valueBoolean = Boolean.parseBoolean(a1);
        return valueBoolean;

        //напишите тут ваш код
    }

    public static void main(String[] args) {

    }
}
