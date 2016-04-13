//题目描述:
//编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
//给定一个链表的头指针 ListNode* pHead，请返回重新排列后的链表的头指针。注意：分割以后保持原来的数据顺序不变。
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        if(pHead == null){
            return pHead;
        }
        ListNode smallNode = new ListNode(-1);
        ListNode bigNode = new ListNode(-1);
        ListNode smallFirst,bigFirst;
        smallFirst = smallNode;
        bigFirst = bigNode;
        while(pHead != null){
            if(pHead.val < x){
                smallNode.next = pHead;
                smallNode = pHead;
            }else{
                bigNode.next = pHead;
                bigNode = pHead;
            }
            pHead = pHead.next;
        }
        smallNode.next = bigFirst.next;
        bigNode.next = null;
        return smallFirst.next;
    }
    
}
