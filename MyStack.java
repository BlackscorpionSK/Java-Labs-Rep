import java.util.ArrayList;
import java.util.Collections;

public class MyStack {
    private ArrayList<Comparable> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Comparable peek() {
        return list.get(getSize() - 1);
    }

    public Comparable pop() {
        Comparable o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Comparable o) {
        list.add(o);
    }

    public void sort() {
        Collections.sort(list);
    }

    @Override
    public String toString() {
        return "стек: " + list.toString();
    }
}