package homework5.task3;

public class Generics<T> {
    private T[] value;

    public void setValue(T[] value) {
        this.value = value;
    }

    public T getT(int index) {
        return value[index];
    }
}