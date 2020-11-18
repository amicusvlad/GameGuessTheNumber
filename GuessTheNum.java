import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in); //функция ввода
        Random rand = new Random(); //функция рандома
        int ent; //переменная ввода
        int upperbound = 11; //переменная максимума рандома
        //int i = 1; //переменная счетчика попыток
        boolean isTrue = false; //переменная результата игры

        for(int i = 1; isTrue != true; i++){
            int int_random = rand.nextInt(upperbound); //переменная результата рандома и запись результата в нее
            System.out.println("Попытка #"+i);
            System.out.print("Введи любое число от 0 до 10: ");
            ent = num.nextInt();
            isTrue = ent==int_random;
            if (isTrue)
                System.out.println("Поздравляю! Ты угадал c "+i+" попытки!");
            else {
                for (int clr=0; clr < 100; clr++){
                    System.out.println("-----------------------------");
                }
                System.out.println("Лошара, правильный ответ: "+int_random+". Попробуй еще раз =)");
            }
            //System.out.println("Проверка бул "+isTrue);
            //System.out.println("Загаданное число "+int_random);
        }

    }
}
