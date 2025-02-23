public class Queue<T> {
    private Node<T> first;
    private Node<T> last;

    public Queue() {
        this.first = null;
        this.last = null;
    }

    public void insert(T value) {
        Node<T> newNode = new Node<T>(value);
        if (this.first == null)
            this.first = newNode;
        else
            this.last.setNext(newNode);
        this.last = newNode;
    }

    public T remove() {
        T value = this.first.getValue();
        this.first = this.first.getNext();
        if (this.first == null)
            this.last = null;
        return value;
    }

    public T head() {
        return this.first.getValue();
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "first=" + first +
                ", last=" + last +
                '}';
    }
}