/*
    Unlike the TreeMultiList, this implementation does not just "wrap" an
    underlying tree, it is instead a custom LinkedList implementation, which
    only provides the necessary MultiSet methods.

    Representation Invariant:
    this._front is None represents an empty MultiSet
 */
public class LinkedListMultiSet extends MultiSet{

    private Node front;
    private int size;

    public LinkedListMultiSet() {

    }

    public void add(Integer item) {
        Node newNode = new Node(item);

        newNode.setNext(this.front);
        this.front = newNode;
        this.size += 1;
    }

    public void remove(int item) {
        Node cur = this.front;
        Node prev = null;
        while(cur != null) {
            if (cur.getItem() == item) {
                this.size -= 1;
                if (prev != null) {
                    prev.setNext(cur.getNext());
                }
                //First item
                else {
                    this.front = cur.getNext();
                }
                return;
            }
            prev = cur;
            cur = cur.getNext();
        }
        //if here, item not found
    }

    public boolean contains(int item) {
        Node cur = this.front;
        while(cur != null) {
            if (cur.getItem() == item)
                return true;
            cur = cur.getNext();
        }
        return false;
    }

    public boolean is_empty() {
        return this.front == null;
    }

    public int count(int item) {
        int num_seen = 0;
        Node cur = this.front;
        while(cur != null) {
            if (cur.getItem() == item)
                num_seen += 1;
            cur = cur.getNext();
        }
        return num_seen;
    }

    public int size() {
        return this.size;
    }

    //Internal node structure used by the LinkedListMultiSet above.
    static class Node {
        private int item;
        private Node next;

        public Node(int item) {
            this.item = item;
        }

        public int getItem(){
            return this.item;
        }

        public Node getNext(){
            return this.next;
        }

        public void setItem(int item){
            this.item = item;
        }

        public void setNext(Node next){
            this.next = next;
        }
    }
}
