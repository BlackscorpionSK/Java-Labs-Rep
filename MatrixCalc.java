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
        System.out.println("Введенная матрица:");
        for(int i = 0; i < str1; i++)
        {
            for (int j = 0; j < clm1; j++)
            {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.println("Введите количество строк второй матрицы: ");
        int str2 = scanner.nextInt();
        System.out.println("Введите количество столбцов второй матрицы: ");
        int clm2 = scanner.nextInt();
        int[][] arr2 = new int[str2][clm2];
        for(int i = 0; i < str2; i++)
            for(int j = 0; j < clm2; j++)
            {
                System.out.println("Введите значение элемента " + i + j);
                arr2[i][j] = scanner.nextInt();
            }
        System.out.println("Введенная матрица:");
        for(int i = 0; i < str2; i++)
        {
            for (int j = 0; j < clm2; j++)
            {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.println("Выбирите действия с матрицами");
        System.out.println("Цифра 1 - складывание матриц");
        System.out.println("Цифра 2 - вычитание матриц");
        System.out.println("Цифра 3 - умножение матриц");
        System.out.println("Цифра 4 - умножение на транспонированую матрицу");
        int str3 = 0;
        int clm3 = 0;
        int[][] res = new int[str3][clm3];

        String action = scanner.nextLine();
        action = scanner.nextLine();

        switch (action)
            {
                case "1":
                    if(str1 == str2 && clm1 == clm2)
                    {
                        str3 = str1;
                        clm3 = clm1;
                        for(int i = 0; i < str2; i++)
                            for(int j = 0; j < clm2; j++)
                            {
                                res[i][j] = arr1[i][j] + arr2[i][j];
                            }
                    } else
                        System.out.println("Матрицы должны быть одной размерности!");
                    break;

                case "2":
                    if(str1 == str2 && clm1 == clm2)
                    {
                        str3 = str1; clm3 = clm1;
                        for(int i = 0; i < str2; i++)
                            for(int j = 0; j < clm2; j++)
                            {
                                res[i][j] = arr1[i][j] - arr2[i][j];
                            }
                    } else
                        System.out.println("Матрицы должны быть одной размерности!");
                    break;

                case "3":
                    res = new int[str1][clm2];
                    if(clm1 == str2)
                    {
                        for(int i = 0; i < str1; i++)
                            for(int j = 0; j < clm2; j++)
                            {
                                int sum = 0;
                                for (int k = 0; k < clm1; k++)
                                {
                                    sum += arr1[i][k] * arr2[k][j];
                                }
                                res[i][j] = sum;
                            }
                    } else
                        System.out.println("Неправильная размерность матриц");
                    break;

                case "4":

                    break;
            }

        System.out.println("Результирующая матрица:");
        for(int i = 0; i < str3; i++)
        {
            for (int j = 0; j < clm3; j++)
            {
                System.out.print(res[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}