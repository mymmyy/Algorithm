package com.mym.link;

/**
 * 链表逆序测试
 */
public class LinkReverseTest {

    /**
     * 逆序,直接遍历反转
     * 时间复杂度：O(N)
     * 空间复杂度：O(1)
     * @param head 链表头节点
     */
    public static void derectReverse(LNode head){
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
            cur = next;
        }

        // 节点最后一个节点直线倒数第二个节点
        cur.setNext(pre);
        // 链表的头节点指向原来链表的尾节点
        head.setNext(cur);
    }

    /**
     * 递归逆序，对不带头节点的单链表进行逆序
     * 性能：只需一次遍历、思路直观、需要额外压栈与弹栈操作，与方法1相比性能会有所下降
     * 时间复杂度：O(N)
     * 空间复杂度：不需要额外保存前驱节点地址
     * @param head
     */
    public static LNode recursiveReverseNoHead(LNode head){
        if(head == null || head.getNext() == null){
            return head;
        }else{
            // 反转后边的节点
            LNode newHead = recursiveReverseNoHead(head.getNext());
            // 把当前便利的节点加到后面节点逆序后链表的尾部
            head.getNext().setNext(head);
            head.setNext(null);
            return newHead;
        }
    }

    /**
     * 递归逆序，对带头节点的单链表进行逆序
     * 性能：只需一次遍历、思路直观、需要额外压栈与弹栈操作，与方法1相比性能会有所下降
     * 时间复杂度：O(N)
     * 空间复杂度：不需要额外保存前驱节点地址
     * @param head
     */
    public static void recursiveReverseHadHead(LNode head){
        if(head == null){
            return;
        }
        // 获取链表的第一个节点
        LNode firstNode = head.getNext();
        // 对链表进行逆序
        LNode newHead = recursiveReverseNoHead(firstNode);
        // 头节点指向你虚侯链表的第一个节点
        head.setNext(newHead);
    }

    /**
     * 时间复杂度：O(N)
     * 与直接逆序方法相比，不需要保存前驱节点地址，与递归方法相比，不需要递归调用效率更高
     * @param head
     */
    public static void insertReverse(LNode head){
        if(head == null || head.getNext() == null){
            return;
        }

        LNode cur = null;
        LNode next = null;
        cur = head.getNext().getNext();
        // 设置链表的一个节点为尾节点
        head.getNext().setNext(null);
        // 把遍历到节点插入到头节点后面
        while(cur != null){
            next = cur.getNext();
            cur.setNext(head.getNext());
            head.setNext(cur);
            cur = next;
        }
    }

    /**
     * 逆序输出，递归方式
     * @param firstNode
     */
    public static void reversePrint(LNode firstNode){
        if(firstNode == null){
            return;
        }
        reversePrint(firstNode.getNext());
        System.out.print(firstNode.getData() + " ");
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

//        derectReverse(head);
//        recursiveReverseHadHead(head);
        insertReverse(head);
        System.out.println("\n逆序后：");
        for(cur = head.getNext(); cur != null; cur = cur.getNext()){
            System.out.print(cur.getData() + " ");
        }

        System.out.println("\n逆序输出：");
        reversePrint(head);
    }
}
