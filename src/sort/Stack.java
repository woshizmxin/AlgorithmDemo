package sort;

import java.util.ArrayList;

public class Stack {
    ArrayList<Object> arrayList = new ArrayList<>();

    public void push(Object object) {
        arrayList.add(object);
    }

    public Object pop() {
        Object object = arrayList.get(arrayList.size() - 1);
        arrayList.remove(object);
        return object;
    }
}
