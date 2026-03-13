public class Lab_4_MyStack {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        System.out.println("=== Тест с Integer ===");
        stack.push(5);
        stack.push(2);
        stack.push(8);
        stack.push(1);
        stack.push(9);

        System.out.println("До сортировки: " + stack);
        stack.sort();
        System.out.println("После сортировки: " + stack);

        System.out.println("\n=== Тест с String ===");
        MyStack stringStack = new MyStack();
        stringStack.push("Orange");
        stringStack.push("Apple");
        stringStack.push("Banana");
        stringStack.push("Cherry");

        System.out.println("До сортировки: " + stringStack);
        stringStack.sort();
        System.out.println("После сортировки: " + stringStack);

        System.out.println("\n=== Тест с Double ===");
        MyStack doubleStack = new MyStack();
        doubleStack.push(3.14);
        doubleStack.push(2.71);
        doubleStack.push(1.41);
        doubleStack.push(9.99);

        System.out.println("До сортировки: " + doubleStack);
        doubleStack.sort();
        System.out.println("После сортировки: " + doubleStack);

        System.out.println("\n=== Проверка методов стека ===");
        System.out.println("Верхний элемент: " + doubleStack.peek());
        System.out.println("Извлечённый элемент: " + doubleStack.pop());
        System.out.println("После pop: " + doubleStack);
        System.out.println("Размер стека: " + doubleStack.getSize());
        System.out.println("Стек пуст? " + doubleStack.isEmpty());
    }
}
