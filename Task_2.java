package Homeworks.Homework_3;

import java.util.ArrayList;
import java.util.List;

/**
 * 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
 */
public class Task_2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) numbers.add(i);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int middle = 0;
        for (int number : numbers) {
            if (number > max) max = number;
            if (number < min) min = number;
            middle += number;
        }
        System.out.println("min: " + min
                       + "\nmax: " + max
                       + "\nmiddle: " + middle / numbers.size());
    }
}
