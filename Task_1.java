package Homeworks.Homework_3;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. Пусть дан произвольный список целых чисел, удалить из него четные числа
 * 3. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
 * В этот телефонный справочник с помощью метода add() можно добавлять записи.
 * С помощью метода get() искать номер телефона по фамилии. Следует учесть,
 * что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
 * тогда при запросе такой фамилии должны выводиться все телефоны.
 */
public class Task_1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) numbers.add(i);

        for (int i = numbers.size() - 1; i > 0; i--)
            if (numbers.get(i) % 2 == 0) numbers.remove(i);

        numbers.forEach(System.out::println);
    }
}
