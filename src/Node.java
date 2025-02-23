public class Node<T>{
    private T value;
    private Node<T> next;

    public Node(T value){
        this.value = value;
    }

    public Node(T value, Node<T> next){
        this.value = value;
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
    public boolean hasNext(){
        return this.next != null;
    }

    public String toString() {
        return hasNext()? value + " -> " + next: value + " -> |||";
    }
}
