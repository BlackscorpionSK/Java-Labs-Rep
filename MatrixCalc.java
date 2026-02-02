import java.util.Scanner;

class MatrixCalc {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк первой матрицы: ");
        int str1 = scanner.nextInt();
        System.out.println("Введите количество столбцов первой матрицы: ");
        int clm1 = scanner.nextInt();

        int[][] arr1 = new int[str1][clm1];
        for(int i = 0; i < str1; i++)
            for(int j = 0; j < clm1; j++)
            {
                System.out.println("Введите значение элемента " + i + j);
                arr1[i][j] = scanner.nextInt();
            }
    }
    }