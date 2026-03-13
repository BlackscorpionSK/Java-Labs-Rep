public class Lab_5_maxAndMin {

    public static void main(String[] args) {
        // Тест 1: с числами (Integer)
        System.out.println("=== Тест с Integer ===");
        Integer[] numbers = {5, 2, 9, 1, 7, 3};
        Comparable[] result1 = MaxMinFinder.maxAndMin(numbers);
        System.out.println("Исходный массив: " + java.util.Arrays.toString(numbers));
        System.out.println("Результат [max, min]: [" + result1[0] + ", " + result1[1] + "]");

        // Тест 2: со строками (String)
        System.out.println("\n=== Тест с String ===");
        String[] words = {"apple", "zebra", "banana", "cat"};
        Comparable[] result2 = MaxMinFinder.maxAndMin(words);
        System.out.println("Исходный массив: " + java.util.Arrays.toString(words));
        System.out.println("Результат [max, min]: [" + result2[0] + ", " + result2[1] + "]");

        // Тест 3: с Double
        System.out.println("\n=== Тест с Double ===");
        Double[] decimals = {3.14, 2.71, 9.99, 1.41, 5.5};
        Comparable[] result3 = MaxMinFinder.maxAndMin(decimals);
        System.out.println("Исходный массив: " + java.util.Arrays.toString(decimals));
        System.out.println("Результат [max, min]: [" + result3[0] + ", " + result3[1] + "]");

        // Тест 4: с собственным классом Person
        System.out.println("\n=== Тест с классом Person ===");
        Person[] people = {
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 20),
                new Person("David", 35)
        };
        System.out.println("Исходный массив:");
        for (Person p : people) {
            System.out.println("  " + p);
        }
        Comparable[] result4 = MaxMinFinder.maxAndMin(people);
        System.out.println("Результат [max по возрасту, min по возрасту]:");
        System.out.println("  Max: " + result4[0]);
        System.out.println("  Min: " + result4[1]);

        // Тест 5: проверка исключения
        System.out.println("\n=== Тест исключения ===");
        try {
            Integer[] smallArray = {5};
            MaxMinFinder.maxAndMin(smallArray);
        } catch (IllegalArgumentException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }
    }
}

// Собственный класс, реализующий Comparable
class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " (возраст: " + age + ")";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}