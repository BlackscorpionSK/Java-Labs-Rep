/*Напишите клиент этого класса – программу, которая вычисляет время выполнения
сортировки 100 000 (или более) чисел методом пузырька.*/

public class Lab_2_StopWatch {
    public static void main(String[] args)
    {
        StopWatch ST = new StopWatch();
        int[] numbers = new int[100000];
        for (int i = 0; i<numbers.length; i++)
            numbers[i] = (int) (Math.random() * 10000);
        ST.start();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        ST.stop();
        System.out.println(ST.getElapsedTime());
    }
}
