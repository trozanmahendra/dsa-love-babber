package practice.dsa.list;

import java.io.PrintStream;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;
    static class Node<T> {
        private Node<T> next;
        private  T data;
        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    public int size() {
        int count = 0;
        Node<T> temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public T get(int index){
        T data = null;
        Node<T> temp = head;
        if(index < size()){
            for(int i=0;i<=index;i++){
                if(temp != null){
                    data = temp.data;
                    temp = temp.next;
                }
            }
        }
        return data;
    }
    public void insert(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }
    public void insertAtStart(T data) {
        Node<T> curr = new Node<>(data);
        curr.next = head;
        head = curr;
    }
    public void insertAtPos(int pos, T data) {
        if (pos <= size()) {
            Node<T> temp = head;
            if (pos == 0) {
                insertAtStart(data);
                return;
            }
            for (int i = 0; i < pos - 1; i++) {
                temp = temp.next;
            }
            Node<T> curr = new Node<>(data);
            curr.next = temp.next;
            temp.next = curr;
        } else {
            insert(data);
        }
    }
    public boolean update(T oldData,T newData){
        if (head == null) return false;
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data == oldData) {
                temp.data = newData;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public boolean updateAll(T oldData, T newData){
        if (head == null) return false;
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data == oldData) {
                temp.data = newData;
            }
            temp = temp.next;
        }
        return true;
    }
    public boolean deleteFirst(T data) {
        if (head == null) return false;
        Node<T> temp = head;
        Node<T> prev = null;
        while (temp != null) {
            if (temp.data == data) {
                if (prev == null) head = head.next;
                else prev.next = temp.next;
                return true;
            }
            prev = temp;
            temp = temp.next;
        }
        return false;
    }
    public boolean deleteLast(T data) {
        if (head == null) return false;
        Node<T> temp = head;
        Node<T> prev = null;
        Node<T> prevOfDel = null;
        Node<T> nodeToDelete = null;
        while (temp != null) {
            if (temp.data == data) {
                nodeToDelete = temp;
                prevOfDel = prev;
            }
            prev = temp;
            temp = temp.next;
        }
        if(prevOfDel == null && nodeToDelete == null) return false;
        else if(prevOfDel == null) head = head.next;
        else prevOfDel.next = nodeToDelete.next;
        return true;
    }
    public void display() {
        Node<T> node = head;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            System.out.print("[");
            while (node.next != null) {
                System.out.print(node.data + ",");
                node = node.next;
            }
            System.out.print(node.data + "]");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i=0;i<20;i++){
            linkedList.insert(i);
        }
        linkedList.insert(11);
        linkedList.insert(12);
        linkedList.insert(13);
        linkedList.insert(11);
        linkedList.deleteFirst(11);
        linkedList.insertAtStart(876);
        linkedList.insertAtPos(1,90);
        linkedList.update(90,990);
        linkedList.insertAtPos(linkedList.size(), 9000);
        linkedList.insertAtPos(linkedList.size()-1, 99);
        linkedList.deleteLast(13);
        linkedList.updateAll(11,1221);
        linkedList.display();
        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList2.insert("revanth");
        linkedList2.insert("revanth");
        linkedList2.insert("revanth");
        linkedList2.insert("mahendra");
        linkedList2.insert("Bharath");
        linkedList2.insert("Surendra");
        linkedList2.insert("Rishanth");
        linkedList2.insert("Rishanth");
        linkedList2.insert("Rishanth goud");
        linkedList2.insert("mahendra");
        linkedList2.insert("revanth");
        linkedList2.insert("revanth");
        linkedList2.deleteLast("mahendra");
        linkedList2.updateAll("revanth","Mahendra");
        linkedList2.updateAll("Mahendra","Mahendra_Goud");
        linkedList2.update("Bharath","BHARATH");
        linkedList2.insert("revanth");
        linkedList2.display();
        System.out.println(linkedList2.get(0));
        System.out.println(linkedList2.size());
    }
}
