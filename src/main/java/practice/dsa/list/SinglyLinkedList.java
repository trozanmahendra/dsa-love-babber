package practice.dsa.list;

public class SinglyLinkedList<T> {
    Node<T> head;
    Node<T> tail;
    Integer size = 0;
    public static class Node<T> {
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
    public Node<T> get(int index){
        Node<T> data = null;
        Node<T> temp = head;
        if(index < size){
            for(int i=0;i<=index;i++){
                if(temp != null){
                    data = temp;
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
        size++;
    }
    public void insertAtStart(T data) {
        Node<T> curr = new Node<>(data);
        curr.next = head;
        head = curr;
        size++;
    }
    public void insertAtPos(int pos, T data) {
        if (pos <= size) {
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
            size++;
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
                size--;
                return true;
            }
            prev = temp;
            temp = temp.next;
            size--;
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
        size--;
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
    public void reverse(){
        Node<T> prev = null;
        Node<T> curr = head;
        tail = curr;
        while (curr != null){
            Node<T> next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
        for(int i=0;i<20;i++){
            singlyLinkedList.insert(i);
        }
        singlyLinkedList.insert(11);
        singlyLinkedList.insert(12);
        singlyLinkedList.insert(13);
        singlyLinkedList.insert(11);
        singlyLinkedList.deleteFirst(11);
        singlyLinkedList.insertAtStart(876);
        singlyLinkedList.insertAtPos(1,90);
        singlyLinkedList.update(90,990);
        singlyLinkedList.insertAtPos(singlyLinkedList.size, 9000);
        singlyLinkedList.insertAtPos(singlyLinkedList.size-1, 99);
        singlyLinkedList.deleteLast(13);
        singlyLinkedList.updateAll(11,1221);
        singlyLinkedList.display();
        SinglyLinkedList<String> singlyLinkedList2 = new SinglyLinkedList<>();
        singlyLinkedList2.insert("Ganesh");
        singlyLinkedList2.insert("Ganesh");
        singlyLinkedList2.insert("Ganesh");
        singlyLinkedList2.insert("mahendra");
        singlyLinkedList2.insert("Bharath");
        singlyLinkedList2.insert("Surendra");
        singlyLinkedList2.insert("Rishanth");
        singlyLinkedList2.insert("Rishanth");
        singlyLinkedList2.insert("Rishanth goud");
        singlyLinkedList2.insert("mahendra");
        singlyLinkedList2.insert("revanth");
        singlyLinkedList2.insert("revanth");
        singlyLinkedList2.deleteLast("mahendra");
        singlyLinkedList2.updateAll("revanth","Mahendra");
        singlyLinkedList2.updateAll("Mahendra","Mahendra_Goud");
        singlyLinkedList2.update("Bharath","BHARATH");
        singlyLinkedList2.insert("revanth");
        System.out.println(singlyLinkedList2.head.data+ " "+singlyLinkedList2.tail.data);
        singlyLinkedList2.reverse();
        System.out.println(singlyLinkedList2.head.data+ " "+singlyLinkedList2.tail.data);
        singlyLinkedList2.display();
        System.out.println(singlyLinkedList2.get(0).data);
        System.out.println(singlyLinkedList2.size());
        System.out.println(singlyLinkedList2.size);
    }
}
