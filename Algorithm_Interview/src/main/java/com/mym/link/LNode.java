package com.mym.link;

/**
 * 链表节点实体类
 */
public class LNode {
    private int data;       // 数据域

    private LNode next;     // 下一个节点的引用

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public LNode getNext() {
        return next;
    }

    public void setNext(LNode next) {
        this.next = next;
    }
}
