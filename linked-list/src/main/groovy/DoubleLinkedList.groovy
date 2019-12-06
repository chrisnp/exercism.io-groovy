class DoubleLinkedList<T> {

    private T value
    private DoubleLinkedList<T> prev
    private DoubleLinkedList<T> next

    DoubleLinkedList() {
        this.value = this.prev = this.next = null
    }

    DoubleLinkedList(T value, 
                     DoubleLinkedList<T> prev, 
                     DoubleLinkedList<T> next) {
        this.value = value
        this.prev  = prev
        this.next  = next
    }

    void push(T value) {
        if (next) {
            next.push(value)
        }
        else {
            next = new DoubleLinkedList<T>(value, this, null)
        }
    }

    T pop() {
        if (next)
            return next.pop()
        prev.next = null
        this.value
    }

    T shift() {
        if (next) {
            this.value = next.value
            next = next.next
        }
        this.value
    }

     void unshift(T value) {
         DoubleLinkedList node = new DoubleLinkedList<T>(value, this, next)
         if (next) {
             next.prev = node
             node.next = next
         }
         next = node
     }
}