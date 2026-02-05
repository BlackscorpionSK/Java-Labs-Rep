/*
Напишите клиент этого класса — программу, которая создает объект типа Stock с
обозначением SBER, именем ПАО Сбербанк, стоимостью акций на момент закрытия
предыдущего дня, равной 281.50. Задайте новую стоимость акций в настоящий момент,
равную 282.87, и отобразите процент изменения стоимости акций.
*/
public class Lab_1_Stock
{
    public static void main(String[] args)
    {
        Stock stock1 = new Stock("SBER","ПАО Сбербанк");
        stock1.setPreviousClosingPrice(281.50);
        stock1.setCurrentPrice(282.87);

        System.out.println("обозначение акции: " + stock1.getSymbol());
        System.out.println("имя: " + stock1.getName());
        System.out.println("стоимость акции на момент закрытия предыдущего дня: " + stock1.getPreviousClosingPrice());
        System.out.println("стоимость акций в настоящий момент: " + stock1.getCurrentPrice());
        System.out.println("процент изменения стоимости акций: " + stock1.getChangePercent() + "%");
    }
}
