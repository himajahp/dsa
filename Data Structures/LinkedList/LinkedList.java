package com.company;

public class LinkedList {
    public SinglyLinkedListNode head;

    public void insertAtHead(int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        newNode.setNextNode(this.head);
        head = newNode;
    }

    @Override
    public String toString() {
        String result = "{ ";
        SinglyLinkedListNode current = head;
        while(current != null) {
            result += current.toString() + ",";
            current = current.getNextNode();
        }
        result += " }";
        return result;
    }
}
