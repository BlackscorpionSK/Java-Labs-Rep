public class Lab_4_ShapesLab {
    public static void main(String[] args) {
        Ball ball1 = new Ball(5);
        Ball ball2 = new Ball(3);
        Cylinder cylinder = new Cylinder(4, 10);
        Pyramid pyramid = new Pyramid(25, 12);

        System.out.println("=== Объёмы фигур ===");
        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(cylinder);
        System.out.println(pyramid);

        System.out.println("\n=== Создание коробки объёмом 1000 ===");
        Box box = new Box(1000);
        System.out.println(box);

        System.out.println("\n=== Добавление фигур в коробку ===");
        System.out.println("Добавляем ball1: " + box.add(ball1));
        System.out.println(box);

        System.out.println("Добавляем cylinder: " + box.add(cylinder));
        System.out.println(box);

        System.out.println("Добавляем pyramid: " + box.add(pyramid));
        System.out.println(box);

        System.out.println("Добавляем ball2: " + box.add(ball2));
        System.out.println(box);
    }
}