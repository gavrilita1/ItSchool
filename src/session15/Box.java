package session15;

public class Box<T> {
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}

class BoxMain{
    public static void main(String[] args) {

        Box<String> stringBox = new Box<>();
        stringBox.setObj("Hello");
        System.out.println(  stringBox.getObj()  );

        Box<Integer> integerBox = new Box<>();
        integerBox.setObj(31);
        System.out.println(  integerBox.getObj()  );

    }
}
