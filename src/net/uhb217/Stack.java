package net.uhb217;

public class Stack<T> {
    private Node<T> data;

    public Stack() {
        this.data = null;
    }

    public boolean isEmpty() {
        return this.data == null;
    }

    public void push(T data) {
        Node<T> p = new Node<>(data);
        if (this.data == null)
            this.data = p;
        else {
            p.setNext(this.data);
            this.data = p;
        }
    }

    public T pop() {
        T value = this.data.getValue();
        this.data = this.data.getNext();
        return value;
    }

    public T top() {
        return this.data.getValue();
    }

    public String toString(){
        Node<T> pos = this.data;

        String str = "[";
        while (pos != null){
            str = str + pos.getValue().toString();
            if (pos.getNext() != null)
                str = str + ",";
            pos = pos.getNext();
        }
        return str + "]";
    }
}
