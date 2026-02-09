/*Напишите клиент этого класса — программу, которая создает три объекта
типа MyTime (с помощью new MyTime(), new MyTime(555550000) и new MyTime(5, 23,
55)) и отображает значениях их полей данных hour, minute и second в
формате часы:минуты:секунды.
(Подсказка: первые два конструктора извлекут значения hour, minute и second из
прошедшего времени. Для безаргументного конструктора текущее время может быть
получено с помощью метода System.currentTimeMillis())*/

public class Lab_2_MyTime {
    public static void main(String[] args)
    {
        MyTime MT1 = new MyTime();
        MyTime MT2 = new MyTime(555550000);
        MyTime MT3 = new MyTime(5, 23, 55);

        System.out.println(MT1.getHour() + ":" + MT1.getMinute() + ":" + MT1.getSecond());
        System.out.println(MT2.getHour() + ":" + MT2.getMinute() + ":" + MT2.getSecond());
        System.out.println(MT3.getHour() + ":" + MT3.getMinute() + ":" + MT3.getSecond());
    }

}