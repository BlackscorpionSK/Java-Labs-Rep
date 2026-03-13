public class Lab_3_MyCharacter {
    public static void main(String[] args) {
        MyCharacter ch1 = new MyCharacter('A');
        MyCharacter ch2 = new MyCharacter('5');
        MyCharacter ch3 = new MyCharacter('A');

        System.out.println("Символ: " + ch1.charValue());

        System.out.println("ch1 это буква? " + MyCharacter.isLetter(ch1));
        System.out.println("ch2 это цифра? " + ch2.isDigit());

        System.out.println("ch1 равен ch3? " + ch1.equals(ch3));
        System.out.println("Сравнение ch1 и ch2: " + ch1.compareTo(ch2));

    }
}
