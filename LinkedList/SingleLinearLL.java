/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;
import LinkedList.SLNode;
/**
 *
 * @author ankss
 */
public class SingleLinearLL {
    SLNode head;
    SLNode tail;
    int length;
    
    public SingleLinearLL(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    
    
    public int getLength(){
        return this.length;
    }
    
    
    public void add(int x){
        if(this.head==null){
            this.head = this.tail = new SLNode(x);
        }
        else{
            this.tail.next = new SLNode(x);
            this.tail = this.tail.next;
        }
        this.length++;
        System.out.println("New Node Created");
    }
    
    
    public void insert(int index, int val){
        if (index > (this.length+1) || index <= 0){
            System.out.println("index invalid");
            return;
        }
        else if(index == this.length){
            this.add(val);
        }
        else if(index == 1){
            SLNode newNode = new SLNode(val);
            newNode.next = this.head;
            this.head = newNode;
        }
        else{
            SLNode temp = this.head;
            int i = 1;
            while (i < index-1){
                temp = temp.next;
            }
            SLNode newNode = new SLNode(val);
            newNode.next = temp.next;
            temp.next = newNode;
        }
        System.out.println("Inserted value at given position");
    }
    
    
    public void traverse(){
        SLNode temp = this.head;
        if(temp == null){
            System.out.println("List is Empty!");
            return;
        }
        System.out.println("Traversing the list");
        while(temp != null){
            System.out.print(temp.val + "\t");
            temp = temp.next;
        }
        System.out.println();
    }
    
    
    public void search(int x){
        SLNode temp = this.head;
        int i = 1;
        System.out.println("Searching the list");
        while(temp != null){
            if(temp.val == x){
                System.out.println("found value at "+i+"th position");
                return;
            }
            i++;
            temp = temp.next;
        }
        System.out.println("Value not available in the list");
    }
    
    public void delete(int x){
        if(head.val == x){
            head = head.next;
            this.length--;
            System.out.println("Value Deleted Successfully");
            return;
        }
        SLNode temp = this.head;
        while(temp != this.tail){
            if (temp.next.val == x){
                SLNode tmp = temp.next;
                if(tmp == this.tail){
                    this.tail = temp;
                    this.tail.next = null;
                }
                else{
                    temp.next = tmp.next;
                }
                tmp = null;
                this.length--;
                System.out.println("Value Deleted Successfully");
                return;
            }
            temp = temp.next;
        }
        System.out.println("We dont have node with this value, So couldn't delete anything!");
    }
    
    
    public void emptyList(){
        while(this.head != null){
            SLNode temp = this.head;
            this.head = this.head.next;
            temp = null;
            
        }
        this.length = 0;
        System.out.println("List is deleted");
    }
    
}
