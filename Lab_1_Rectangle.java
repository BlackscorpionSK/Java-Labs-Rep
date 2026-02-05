/*
Напишите клиент этого класса - программу, которая создает два объекта типа Rectangle:
первый - с шириной 4 и высотой 40, а второй - с шириной 3.5 и высотой 35.9. Программа
также должна отображать ширину, высоту, площадь и периметр каждого прямоугольника
в указанном порядке.
*/

public class Lab_1_Rectangle
{
    public static void main(String[] args)
    {
       Rectangle rect1 = new Rectangle(4, 40);
       Rectangle rect2 = new Rectangle(3.5, 35.9);

        System.out.println("ширина 1 прямоугольника равна " + rect1.getWidth());
        System.out.println("высота 1 прямоугольника равна " + rect1.getHeight());
        System.out.println("площадь 1 прямоугольника равна " + rect1.getArea());
        System.out.println("периметр 1 прямоугольника равна " + rect1.getPerimeter());

        System.out.println();

        System.out.println("ширина 2 прямоугольника равна " + rect2.getWidth());
        System.out.println("высота 2 прямоугольника равна " + rect2.getHeight());
        System.out.println("площадь 2 прямоугольника равна " + rect2.getArea());
        System.out.println("периметр 2 прямоугольника равна " + rect2.getPerimeter());
    }
}
