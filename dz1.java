import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class dz1 { //Дан произвольный список целых чисел, удалить из него чётные числа
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            newList.add(rnd.nextInt(10));
        }
        System.out.println(newList);
        for (Iterator<Integer> iterator = newList.iterator(); iterator.hasNext();){
            Integer num = iterator.next();
            if(num % 2 == 0){
                System.out.println("Это четное число так что его убираем: "+num);
                iterator.remove();
            }
        }
        System.out.println(newList);
    }
}