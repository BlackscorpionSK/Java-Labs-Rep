public class MyString2 implements Comparable<MyString2> {
    private char[] chars;

    public MyString2(char[] chars) {
        this.chars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            this.chars[i] = chars[i];
        }
    }

    public MyString2 substring(int begin) {
        return substring(begin, chars.length);
    }

    public MyString2 substring(int begin, int end) {
        if (begin < 0 || end > chars.length || begin > end) {
            throw new StringIndexOutOfBoundsException("Неверные границы");
        }

        int newLength = end - begin;
        char[] newChars = new char[newLength];

        for (int i = 0; i < newLength; i++) {
            newChars[i] = chars[begin + i];
        }

        return new MyString2(newChars);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (!(obj instanceof MyString2)) {
            return false;
        }

        MyString2 other = (MyString2) obj;

        if (this.chars.length != other.chars.length) {
            return false;
        }

        for (int i = 0; i < chars.length; i++) {
            if (this.chars[i] != other.chars[i]) {
                return false;
            }
        }

        return true;
    }

    public int compareTo(MyString2 obj) {
        int len1 = this.chars.length;
        int len2 = obj.chars.length;

        int minLength = Math.min(len1, len2);

        for (int i = 0; i < minLength; i++) {
            char c1 = this.chars[i];
            char c2 = obj.chars[i];

            if (c1 != c2) {
                return c1 - c2;
            }
        }

        return len1 - len2;
    }

    public char[] toChars() {
        char[] copy = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            copy[i] = chars[i];
        }
        return copy;
    }

    public static MyString2 valueOf(boolean b) {
        if (b) {
            return new MyString2(new char[]{'t', 'r', 'u', 'e'});
        } else {
            return new MyString2(new char[]{'f', 'a', 'l', 's', 'e'});
        }
    }

    public String toString() {
        return new String(chars);
    }
}