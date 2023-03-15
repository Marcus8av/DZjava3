import java.util.ArrayList;
import java.util.Random;

public class dz2 { //Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(0, 100);
            newList.add(val);
        }
        System.out.printf("Задаем рандомные числа: %s\n", newList);
        int maxItem = newList.get(0);
        int minItem = newList.get(0);
        int sumItems = 0;
        for (int item : newList) {
            if (item > maxItem) {
                maxItem = item;
            }
            if (item < minItem) {
                minItem = item;
            }
            sumItems += item;
        }
        float average = (float)sumItems/newList.size();
       
        System.out.printf("Максимальное число: %s\n", maxItem);
        System.out.printf("Минимальное число: %s\n", minItem);
        System.out.printf("Сумма всех элементов: %s\n", sumItems);
        System.out.printf("Среднее арифметическое всех элементов: %s\n", average);
    }
}