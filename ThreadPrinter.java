public class ThreadPrinter implements Runnable {
    private String text;
    private static final Object lock = new Object();

    public ThreadPrinter(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        printText();
    }

    // Синхронизированный метод для вывода текста
    private synchronized void printText() {
        System.out.println("Thread ID: " + Thread.currentThread().getId());
        System.out.println(text);
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        // Отрывки из классических произведений русской литературы
        String[] texts = {
                "А.С. Пушкин, «Евгений Онегин»:\nМой дядя самых честных правил,\nКогда не в шутку занемог,\nОн уважать себя заставил\nИ лучше выдумать не мог...",

                "М.Ю. Лермонтов, «Герой нашего времени»:\nПечорин: «Я иногда себя презираю... не оттого ли я презираю и других? Я стал неспособен к дружбе: из двух друзей всегда один раб другого...",

                "Н.В. Гоголь, «Мёртвые души»:\nРусь, куда ж несёшься ты? Дай ответ. Не даёт ответа. Чудным звоном заливается колокольчик; гремит и становится ветром разорванный в куски воздух...",

                "Ф.М. Достоевский, «Преступление и наказание»:\nВ начале июля, в чрезвычайно жаркое время, под вечер, один молодой человек вышел из своей каморки, которую нанимал от жильцов...",

                "Л.Н. Толстой, «Анна Каренина»:\nВсе счастливые семьи похожи друг на друга, каждая несчастливая семья несчастлива по-своему. Всё смешалось в доме Облонских...",

                "И.С. Тургенев, «Отцы и дети»:\n— Что за прелесть эта деревня! — подумал Базаров, глядя на окрестности. — И воздух-то какой! И пахнет-то как!.."
        };

        Thread[] threads = new Thread[texts.length];

        // Создание и запуск потоков
        for (int i = 0; i < texts.length; i++) {
            threads[i] = new Thread(new ThreadPrinter(texts[i]));
            threads[i].start();
        }

        // Ожидание завершения всех потоков
        for (int i = 0; i < texts.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Все потоки завершили работу.");
    }
}