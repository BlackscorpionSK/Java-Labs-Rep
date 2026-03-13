public class Lab_3_MyString {
    public static void main(String[] args) {
        char[] chars1 = {'H', 'e', 'l', 'l', 'o'};
        char[] chars2 = {'W', 'o', 'r', 'l', 'd'};
        char[] chars3 = {'H', 'e', 'l', 'l', 'o'};

        MyString2 str1 = new MyString2(chars1);
        MyString2 str2 = new MyString2(chars2);
        MyString2 str3 = new MyString2(chars3);

        MyString2 sub1 = str1.substring(1, 4);
        MyString2 sub2 = str1.substring(2);

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("substring(1, 4): " + sub1);
        System.out.println("substring(2): " + sub2);

        System.out.println("\nstr1.equals(str2): " + str1.equals(str2));
        System.out.println("str1.equals(str3): " + str1.equals(str3));

        System.out.println("\nstr1.compareTo(str2): " + str1.compareTo(str2));
        System.out.println("str2.compareTo(str1): " + str2.compareTo(str1));
        System.out.println("str1.compareTo(str3): " + str1.compareTo(str3));

        char[] array = str1.toChars();
        System.out.print("\ntoChars(): ");
        for (char c : array) {
            System.out.print(c + " ");
        }

        MyString2 boolTrue = MyString2.valueOf(true);
        MyString2 boolFalse = MyString2.valueOf(false);
        System.out.println("\n\nvalueOf(true): " + boolTrue);
        System.out.println("valueOf(false): " + boolFalse);
    }
}