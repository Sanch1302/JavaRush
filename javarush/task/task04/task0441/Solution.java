package com.javarush.task.task04.task0441;


/* 
Как-то средненько
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

        if (( number1 >= number2 ) && ( number3 >= number2 )) {
            if ( number1 >= number3 ){
                System.out.println(number3);}
            else {System.out.println(number1);}
        } else if (( number1 >= number3 ) && ( number2 >= number3 )) {
            if ( number1 >= number2 ){
                System.out.println(number2);}
            else {System.out.println(number1);}
        } else if (( number3 >= number1 ) && ( number2 >= number1 )) {
            if ( number3 >= number2 ){
                System.out.println(number2);}
            else {System.out.println(number3);}
        }

        //напишите тут ваш код
    }
}
