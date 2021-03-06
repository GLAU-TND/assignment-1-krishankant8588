package LinkList;

import java.sql.PseudoColumnUsage;

public class LinkedListDefinitionClass<E> implements LinkedListADTInterface<E> {

    private Node<E> head = null;
    private int size = 0;

    public int getSize() {
        return size;
    }

   private Node<E> getNode(int index) {
        Node<E> response = head;
        for (int i = 0; i < index; i++) {
            response = response.getNext();
        }
        return response;
    }

    private void addFirst(E item) {
        head = new Node<>(item, head);
        size++;
    }
    private void addAfter(Node<E> node, E item) {
        node.next = new Node<>(item, node.next);
        size++;
    }
    public void add(int index, E item) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else if (index == 0) {
            addFirst(item);
        } else {
            Node<E> temp = getNode(index - 1);
            addAfter(temp, item);
        }
    }

    @Override
    public void add(E item) {
        add(size, item);
    }
    private E removeFirst() {
        E response = null;
        Node<E> temp = head;
        if (head != null) {
            head = head.getNext();
        }
        if (temp != null) {
            size--;
            response = temp.getData();
        }

        return response;
    }
    private E removeAfter(Node<E> node) {
        E response = null;
        Node<E> temp = node.getNext();
        if (temp != null) {
            node.next = temp.getNext();
            size--;
            response = temp.getData();
        }
        return response;
    }
    public E remove(int index) {
        E response = null;
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else if (index == 0) {
            response = removeFirst();
        } else {
            Node<E> previousNode = getNode(index - 1);
            response = removeAfter(previousNode);
        }
        return response;
    }

    @Override
    public E remove() {
        return remove(size - 1);
    }

    @Override
    public int search(E item) {
        int response = -1;
        for (int i = 0; i < size; i++) {

            E data = this.getNode(i).getData();

            if (item.equals(data)) {
                response = i;
                break;
            }
        }
        return response;
    }

    public void swap(int firstNode, int secondNode,int previous) {
        Node<E> first =getNode(firstNode);
        Node<E> second=getNode(secondNode);
        Node<E> change=second;
        second=first;
        first=change;
    }

    //@Override
    //public LinkedListDefinitionClass<E> sort(LinkedListDefinitionClass<E> noteData) {

    //}

    @Override
    public void print() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            E data = this.getNode(i).getData();
            System.out.print(data + (i < size - 1 ? ", " : ""));
        }
        System.out.println("]");

    }
    public E dataAtIndex(int i){
        Node<E> node=getNode(i);
        return node.getData();
    }
    private static class Node<E> {
        private E data;
        private Node<E> next;
        private Node(E data) {
            this.data = data;
        }
        private Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
        private E getData() {
            return data;
        }
        private Node<E> getNext() {
            return next;
        }
    }
}
