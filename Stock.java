/*
    -Строковое поле данных с именем symbol для обозначения акций.
    -Строковое поле данных с именем name для наименования акций.
    -Поле данных previousClosingPrice типа double, в котором хранится стоимость акций
на момент закрытия предыдущего дня.
    -Поле данных currentPrice типа double, в котором хранится стоимость акций в
настоящий момент.
    -Конструктор, создающий акции с указанными обозначением и наименованием.
    -Метод с именем getChangePercent(), который возвращает процент изменения
стоимости акций с previousClosingPrice на currentPrice.
*/
public class Stock
{
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name)
    {
        this.symbol = symbol;
        this.name = name;
    }

    public void setPreviousClosingPrice(double previousClosingPrice)
    {
        this.previousClosingPrice = previousClosingPrice;
    }

    public void setCurrentPrice(double currentPrice)
    {
        this.currentPrice = currentPrice;
    }

    public String getSymbol()
    {
        return this.symbol;
    }

    public String getName()
    {
        return this.name;
    }

    public double getPreviousClosingPrice()
    {
        return this.previousClosingPrice;
    }

    public double getCurrentPrice ()
    {
        return this.currentPrice;
    }


    public double getChangePercent()
    {
        return (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
    }
}
