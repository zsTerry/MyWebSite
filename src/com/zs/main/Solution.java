package com.zs.main;

import java.util.List;

/**
 * @author zshuai
 * @Title: some-test
 * @Description: 链表求和
 * @date 2021-01-08
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) {
            return null;
        }

        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }

        int length1 = getLength(l1);
        int length2 = getLength(l2);
        ListNode l3 = null;
        if(length1 >= length2) {
            l3 = addListNode(l1, l2);
        } else {
            l3 = addListNode(l2, l1);
        }
        return l3;
    }

    private int getLength(ListNode listNode){
        int length = 0;
        while(listNode!=null){
            length++;
            listNode = listNode.next;
        }
        return length;
    }

    private ListNode addListNode(ListNode outerNode, ListNode innerNode) {
        ListNode resultNode = null;
        int preNodeCarry = 0;
        while(outerNode != null) {
            int innerNodeVal = 0;
            if(innerNode != null) {
                innerNodeVal = innerNode.val;
                innerNode = innerNode.next;
            }

            int outerNodeVal = outerNode.val;
            int resultNodeVal = innerNodeVal + outerNodeVal + preNodeCarry;
            if(resultNodeVal >= 10) {
                resultNodeVal = resultNodeVal%10;
                preNodeCarry = 1;
            } else {
                preNodeCarry = 0;
            }

            if (resultNode == null) {
                resultNode = new ListNode(resultNodeVal);
            } else {
                addNode(resultNodeVal, resultNode);
            }

            outerNode = outerNode.next;
        }
        if (preNodeCarry > 0) {
            addNode(preNodeCarry, resultNode);
        }
        return resultNode;
    }

    private ListNode addNode(int data, ListNode resultNode){
        ListNode node = new ListNode(data);
        if(resultNode == null){
            resultNode = node;
            return resultNode;
        }

        if(resultNode.next == null){
            resultNode.next = node;
            return resultNode;
        }

        while(resultNode.next != null){
            resultNode = resultNode.next;
        }
        resultNode.next = node;
        return resultNode;
    }

    public void printNode(ListNode listNode){
        ListNode tmpNode = listNode;
        while(tmpNode != null){
            System.out.println(tmpNode.val + ",");
            tmpNode = tmpNode.next;
        }
    }

    public static void main(String[] args) {
        /*Solution solution = new Solution();
        ListNode l1 = new ListNode(9);
        solution.addNode(9, l1);
        solution.addNode(9, l1);
        solution.addNode(9, l1);
        solution.printNode(l1);

        ListNode l2 = new ListNode(9);
        solution.addNode(9, l2);
        solution.addNode(9, l2);
        solution.printNode(l2);

        ListNode resultNode = solution.addTwoNumbers(l1, l2);
        solution.printNode(resultNode);*/
        int i = 123;
        String s = String.valueOf(i);
        System.out.println(s.toCharArray());
    }
}
