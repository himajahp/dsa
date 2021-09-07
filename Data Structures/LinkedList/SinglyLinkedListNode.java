package com.company;

public class SinglyLinkedListNode {
    private int data;
    private SinglyLinkedListNode nextNode;

    public SinglyLinkedListNode(int data) {
        this.data = data;
        this.nextNode = null;
    }

    public int getData() {
        return this.getData();
    }

    public SinglyLinkedListNode getNextNode() {
        return this.nextNode;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNextNode(SinglyLinkedListNode nextNode){
        this.nextNode = nextNode;
    }

    @Override
    public String toString(){
        return "Data: " + this.data;
    }
}


