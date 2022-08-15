//Description:
//Компьютер загадывает число от 1 до 100
//Пользователю необходимо отгадать число за любое колличество попыток.

import java.io.*;
import java.util.*;

public class More_Less {
    public static void main(String[] args) throws Exception {
        System.out.println("Привет, давай поиграем в игру, я загадаю число от 0 до 100, а ты попытаешься отгатдть его. Я буду подсказывать тебе Больше или Меньше\nЯ уже загадал число. Как ты думаешь, какое? Напиши ниже свой вариант:");
        int a = buff();
        int b = random();
        int count =1;

        boolean sravn = (a==b);
        if(sravn==true){
            System.out.println("Вы угадали с первого раза");
        }
        else{
           while (true){
               if(a>b){
                   System.out.println("Меньше");
                   count++;
                   a = buff();
               }
               else if(a<b){
                   System.out.println("Больше");
                   count++;
                   a = buff();
               }
               else {
                   if (count<8) {
                       System.out.println("Урааа, ты отгадал число " + count + " попыток");
                       break;
                   }
                   else{
                       System.out.println("Ты отгадал число за " + count + "!!! попыток, советую тебе прочитать книгу Грокаем Алгоритмы, раздел Бинарный поиск");
                       break;
                   }
               }
           }
       }
  }
    public static int random(){
        Random random = new Random();//создаем объект класса Random
        int rand = random.nextInt(100);//генерируем случайные числа
        return rand;
    }
    public static int buff() throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        try {
            num = Integer.parseInt(bufferedReader.readLine());
        }catch (Exception exception){
            System.out.println("Ты ввел не число!");
        }
        return num;
    }
}
