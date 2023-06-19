import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        //Создать структуру ArrayDeque, элементы которой - столицы.
        // Используя методы addFirst() и addLast(), добавьте некоторое количество элементов.
        // Используя методы getLast() и getFirst(), выведите последний
        // и первый элемент соответственно, а также длину коллекции.

        ArrayDeque<String> capitals = new ArrayDeque<>();
        capitals.addFirst("Minsk");
        capitals.addFirst("Moscow");
        capitals.addLast("London");
        capitals.addLast("Berlin");
        capitals.addFirst("Washington");
        capitals.addFirst("Warshaw");
        capitals.addLast("Madrid");


        String capFirst = capitals.getFirst();
        System.out.println("First capital: " + capFirst);

        String capLast = capitals.getLast();
        System.out.println("Last capital: " + capLast);

        System.out.println("Size: " + capitals.size() + " capitals");

    }
}