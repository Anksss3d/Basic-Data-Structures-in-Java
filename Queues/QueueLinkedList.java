/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queues;

import Stacks.*;
import LinkedList.SLNode;

/**
 *
 * @author ankss
 */
public class QueueLinkedList {
    SLNode first, last;

    public QueueLinkedList() {
        this.first = this.last = null;
    }
    
    public void enQueue(int x){
        if (this.first == null){
            System.out.println("Queue is Empty, Creating Queue");
            this.first = this.last = new SLNode(x);
        }
        else{
            SLNode temp = new SLNode(x);
            this.last.next = temp;
            this.last = temp;
            System.out.println("inserted element : "+ x);
        }
    }
    
    public int deQueue(){
        if (this.first == null){
            System.out.println("Queue is Empty");
            return Integer.MIN_VALUE;
        }
        else{
            SLNode temp = this.first;
            this.first = this.first.next;
            System.out.println("removed element : "+temp.val);
            return temp.val;
        }
    }
    
    public void traverse(){
        if (this.first == null){
            System.out.println("Queue is Empty");
        }
        else{
            System.out.println("Elements in Queue are: ");
            SLNode temp = this.first;
            while(temp != null){
                System.out.print(temp.val + "\t");
                temp = temp.next;
            }
            System.out.println("");
        }
    }
    
    public int peak(){
        if (this.first == null){
            System.out.println("Queue is Empty");
            return Integer.MIN_VALUE;
        }
        else{
            return this.first.val;
        }
    }
    
    public void deleteQueue(){
        this.first = this.last = null;
        System.out.println("Deleted Queue!");
    }
}
