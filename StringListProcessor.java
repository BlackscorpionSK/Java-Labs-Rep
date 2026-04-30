import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StringListProcessor {
    private ArrayList<String> stringList;
    private boolean isRunning;
    private final Object listLock = new Object();

    public StringListProcessor() {
        this.stringList = new ArrayList<>();
        this.isRunning = true;
    }

    // Синхронизированный метод добавления строки
    private synchronized void addString(String str) {
        if (str.length() > 80) {
            // Разбиваем длинную строку на части по 80 символов
            int startIndex = 0;
            while (startIndex < str.length()) {
                int endIndex = Math.min(startIndex + 80, str.length());
                stringList.add(str.substring(startIndex, endIndex));
                startIndex = endIndex;
            }
        } else {
            stringList.add(str);
        }
        System.out.println("Добавлена строка. Всего строк в списке: " + stringList.size());
    }

    // Синхронизированный метод получения копии списка
    private synchronized ArrayList<String> getListCopy() {
        return new ArrayList<>(stringList);
    }

    // Синхронизированный метод сортировки
    private synchronized void sortList() {
        Collections.sort(stringList);
        System.out.println("\n>>> Список отсортирован (лексикографический порядок)");
        System.out.println(">>> Количество строк: " + stringList.size());
    }

    // Синхронизированный метод вывода списка
    private synchronized void printList() {
        System.out.println("\n=== Текущее состояние списка ===");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println((i + 1) + ": " + stringList.get(i));
        }
        System.out.println("================================\n");
    }

    // Метод остановки программы
    private synchronized void stop() {
        isRunning = false;
    }

    // Синхронизированный метод проверки состояния
    private synchronized boolean isRunning() {
        return isRunning;
    }

    // Дочерний поток для сортировки
    private class SorterThread implements Runnable {
        @Override
        public void run() {
            while (isRunning()) {
                try {
                    Thread.sleep(5000); // Ждем 5 секунд
                    if (isRunning()) {
                        sortList();
                    }
                } catch (InterruptedException e) {
                    System.out.println("Поток сортировки прерван");
                    break;
                }
            }
        }
    }

    public void start() {
        // Запуск дочернего потока сортировки
        Thread sorterThread = new Thread(new SorterThread());
        sorterThread.setDaemon(true);
        sorterThread.start();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводите строки (пустая строка для завершения):");

        while (isRunning()) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                stop();
                printList();
                System.out.println("Программа завершена.");
                break;
            } else {
                addString(input);
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        StringListProcessor processor = new StringListProcessor();
        processor.start();
    }
}