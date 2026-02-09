/*Создайте класс с именем StopWatch для представления секундомера.
Класс StopWatch должен содержать:
    -Скрытые поля данных startTime и endTime с getter-методами.
    -Безаргументный конструктор, который инициализирует startTime с текущим
временем.
    -Метод с именем start(), который сбрасывает startTime до текущего времени.
    -Метод с именем stop(), который присваивает endTime текущее время.
    -Метод с именем getElapsedTime(), который возвращает прошедшее время на
секундомере в миллисекундах.*/

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch()
    {
        this.startTime = System.currentTimeMillis();
    }

    public void start()
    {
        this.startTime = System.currentTimeMillis();
    }

    public void stop()
    {
        this.endTime = System.currentTimeMillis();
    }
    public long getStartTime()
    {
        return startTime;
    }

    public long getEndTime()
    {
        return endTime;
    }


    public long getElapsedTime()
    {
        return this.endTime - this.startTime;
    }

}
