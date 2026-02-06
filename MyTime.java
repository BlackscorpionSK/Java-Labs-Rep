/*
Создайте класс MyTime для представления времени. Класс MyTime должен содержать:
Поля данных hour, minute и second, которые представляют время.
Безаргументный конструктор, который создает объект типа MyTime для текущего
времени. (Значения полей данных этого объекта представляют текущее время.)
Конструктор, который создает объект типа MyTime с указанным временем в
миллисекундах, прошедших с 00:00, 1 января 1970 г. (Значения полей данных этого
объекта будут представлять это время.)
Конструктор, который создает объект типа MyTime с указанными часами,
минутами и секундами.
Три getter-метода для полей данных hour, minute и second соответственно.
Метод с именем setTime(long elapseTime), который присваивает объекту новое
время с помощью прошедшего времени. Например, если прошедшее время
равно 555550000 миллисекундам, то hour равно 10, minute равно 19,
а second равно 10.
*/

public class MyTime
{
    private int hour;
    private int minute;
    private int second;

    public MyTime()
    {
        long currentTimeMillis = System.currentTimeMillis();
        setTime(currentTimeMillis);
    }

    public MyTime(long elapseTime)
    {
        setTime(elapseTime);
    }

    public MyTime(int hour, int minute, int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(long elapseTime)
    {
        long TotalSecond = currentTimeMillis / 1000;
        this.second = (int) TotalSecond % 60;
        long TotalMinute = TotalSecond / 60;
        this.minute = (int) TotalMinute % 60;

    }
}
