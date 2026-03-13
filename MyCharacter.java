public class MyCharacter implements Comparable<MyCharacter> {
    private char value;

    public MyCharacter(char value) {
        this.value = value;
    }

    public char charValue() {
        return this.value;
    }


    public int compareTo(MyCharacter anotherCharacter) {
        return Character.compare(this.value, anotherCharacter.value);
    }


    public boolean equals(Object anotherCharacter) {
        if (this == anotherCharacter) {
            return true;
        }
        if (anotherCharacter instanceof MyCharacter) {
            return this.value == ((MyCharacter) anotherCharacter).value;
        }
        return false;
    }

    public boolean isDigit() {
        return Character.isDigit(this.value);
    }


    public static boolean isDigit(MyCharacter ch) {
        return Character.isDigit(ch.value);
    }


    public static boolean isLetter(MyCharacter ch) {
        return Character.isLetter(ch.value);
    }


    public static boolean isLetterOrDigit(MyCharacter ch) {
        return Character.isLetterOrDigit(ch.value);
    }


    @Override
    public int hashCode() {
        return Character.hashCode(this.value);
    }


    @Override
    public String toString() {
        return String.valueOf(this.value);
    }
}