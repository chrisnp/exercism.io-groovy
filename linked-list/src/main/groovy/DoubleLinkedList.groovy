class DoubleLinkedList<T> {

    Node<T> root

    void push(T value) {
        if (!root) {
            root = new Node(value, null, null)
            root.prevNode = root
            root.nextNode = root
            return
        }
        Node last = new Node(value, root.prevNode, root)
        root.prevNode.nextNode = last
        root.prevNode = last
    }

    T pop() {
        root = root.prevNode
        shift()
    }

    T shift() {
        T stored = root.payload
        if (root.nextNode == null) {
            root = null
        } 
        else {
            root.nextNode.prevNode = root.prevNode
            root.prevNode.nextNode = root.nextNode
            root = root.nextNode
        }
        stored
    }

    void unshift(T value) {
        push(value)
        root = root.prevNode
    }

    private static class Node<T> {
        final T payload
        Node<T> prevNode, nextNode

        Node() {
            payload = prevNode = nextNode = null
        }

        Node(T value, Node prev, Node next) {
            payload = value
            prevNode = prev
            nextNode = next
        }
    }
}