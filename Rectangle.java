/*
    -Два поля данных типа double с именами width и height, задающими ширину и
высоту прямоугольника. Значение по умолчанию: -1 как для ширины, так и для
высоты.
    -Безаргументный конструктор, создающий прямоугольник с указанными по
умолчанию значениями.
    -Конструктор, создающий прямоугольник с указанными шириной и высотой.
    -Метод с именем getArea(), возвращающий площадь этого прямоугольника.
    -Метод с именем getPerimeter(), возвращающий периметр.
*/

public class Rectangle
{
    private double width;
    private double height;

    public Rectangle()
    {
        this.width = -1;
        this.height = -1;
    }

    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    public double getWidth()
    {
        return this.width;
    }
    public double getHeight()
    {
        return this.height;
    }

    public double getArea()
    {
        return this.width * this.height;
    }
    public double getPerimeter()
    {
        return 2 * (this.width + this.height);
    }
}
