package com.dataStructrue;

public class Node {
    public String value;
    public Node next;
    Node()
    {
        next=null;
    }
    public int getLength()
    {
        if(this.next==null) return 1;
        else {
            return 1+this.next.getLength();
        }
    }


}
