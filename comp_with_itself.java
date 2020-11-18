import java.util.Random;
import java.util.Scanner;

public class comp_with_itself {
    public static void main(String[] args) throws InterruptedException {
        long time_start = System.currentTimeMillis();
        Thread.sleep(2000);
        Scanner num = new Scanner(System.in); //функция ввода
        Random rand = new Random(); //функция рандома
        int ent; //переменная ввода
        int upperbound = 2147483647; //переменная максимума рандома
        //int i = 1; //переменная счетчика попыток
        boolean isTrue = false; //переменная результата игры

        for(long i = 1; isTrue != true; i++){
            int int_random = rand.nextInt(upperbound);//переменная результата рандома и запись результата в нее
            ent = rand.nextInt(upperbound);
            isTrue = ent==int_random;
            if (isTrue){
                System.out.println("Попытка #"+i+". Успех. Загадано: "+ent);
                long time = System.currentTimeMillis() - time_start;
                System.out.println("Программа выполнялась "+time/1000+" сек.");
            }
            else {
                System.out.println("Попытка #"+i+". Неудача. Загадано: "+int_random+". Введено: "+ent);
            }
            //System.out.println("Проверка бул "+isTrue);
            //System.out.println("Загаданное число "+int_random);
            //Thread.sleep(200);

        }

    }
}
