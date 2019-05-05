package com.mym.link;

/**
 * 链表逆序测试
 */
public class LinkReverseTest {

    /**
     * 逆序
     * @param head 链表头节点
     */
    public static void reverse(LNode head){
        // 判断链表是否为空
        if(head == null || head.getNext() == null){
            return;
        }

        LNode pre = null;       // 前驱结点
        LNode cur = null;       // 当前节点
        LNode next = null;      // 后继节点
        cur = head.getNext();
        next = cur.getNext();
        cur.setNext(null);
        pre = cur;
        cur = next;

        // 使得当前遍历到的节点cur指向其前驱节点
        while(cur.getNext() != null){
            next = cur.getNext();
            cur.setNext(pre);
            pre = cur;
            cur = cur.getNext();
            cur = next;
        }

        // 节点最后一个节点直线倒数第二个节点
        cur.setNext(pre);
        // 链表的头节点指向原来链表的尾节点
        head.setNext(cur);
    }

    public static void main(String[] args) {
        // 链表头节点
        LNode head = new LNode();
        head.setNext(null);

        LNode tmp = null;
        LNode cur = head;
        // 构造单链表
        for(int i = 1; i < 8; i++){
            tmp = new LNode();
            tmp.setData(i);
            tmp.setNext(null);
            cur.setNext(tmp);
            cur = tmp;
        }
        System.out.println("逆序前：");
        for(cur = head.getNext(); cur != null; cur = cur.getNext()){
            System.out.print(cur.getData() + " ");
        }
        reverse(head);
        System.out.println("\n逆序后：");
        for(cur = head.getNext(); cur != null; cur = cur.getNext()){
            System.out.print(cur.getData() + " ");
        }
    }
}
