/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stacks;

import LinkedList.SLNode;

/**
 *
 * @author ankss
 */
public class StackLinkedList {
    SLNode top;

    public StackLinkedList() {
        this.top = null;
    }
    
    public void push(int x){
        if (this.top == null){
            this.top = new SLNode(x);
        }
        else{
            SLNode temp = new SLNode(x);
            temp.next = this.top;
            this.top = temp;
            System.out.println("pushed element : "+ x);
        }
    }
    
    public int pop(){
        if (this.top == null){
            System.out.println("Stack is Empty");
            return Integer.MIN_VALUE;
        }
        else{
            SLNode temp = this.top;
            this.top = this.top.next;
            System.out.println("Popped element : "+temp.val);
            return temp.val;
        }
    }
    
    public void traverse(){
        if (this.top == null){
            System.out.println("Stack is Empty");
        }
        else{
            System.out.println("Elements in stack are: ");
            SLNode temp = this.top;
            while(temp != null){
                System.out.print(temp.val + "\t");
                temp = temp.next;
            }
            System.out.println("");
        }
    }
    
    public int peak(){
        if (this.top == null){
            System.out.println("Stack is Empty");
            return Integer.MIN_VALUE;
        }
        else{
            return this.top.val;
        }
    }
    
    public void deleteStack(){
        this.top = null;
        System.out.println("Deleted Stack!");
    }
}
