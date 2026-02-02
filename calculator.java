import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short repeat = 0;

        do{
            System.out.println("Введите первое число: ");
            int num1 = scanner.nextInt();
            System.out.println("Введите второе число: ");
            int num2 = scanner.nextInt();
            System.out.println("Действие: ");
            String action = scanner.nextLine();
            action = scanner.nextLine();

            switch(action) {
                case "+":
                    System.out.println(num1 + num2);
                    break;
                case "-":
                    System.out.println(num1 - num2);
                    break;
                case "*":
                    System.out.println(num1 * num2);
                    break;
                case "/":
                    if (num2 != 0) {
                        System.out.println(num1 / num2);
                        break;
                    } else
                        System.out.println("Нельзя делить на 0");
                default:
                    System.out.println("Вы ввели неправильную команду!");
                    break;
            }
            System.out.println("если хотите продолжить - напишите 1");
            repeat = scanner.nextShort();

        } while(repeat == 1);

    }
}