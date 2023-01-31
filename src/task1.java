//1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.ArrayDeque;
import java.util.Random;

public class task1 {

    public static ArrayDeque<Integer> getReversDeque(int count) {
        ArrayDeque<Integer> list = new ArrayDeque<>();
        ArrayDeque<Integer> reversList = new ArrayDeque<>();
        Random random = new Random();

        for (int i = 0; i < count; i++) {

            int rand = random.nextInt(100);
            list.addFirst(rand);
        }
        System.out.println(list);

        for (int i = 0; i < count; i++) {

            reversList.addFirst(list.getFirst());
            list.removeFirst();
        }
        return reversList;
    }

    public static void main(String[] args) {

        System.out.println(getReversDeque(10));

    }

}