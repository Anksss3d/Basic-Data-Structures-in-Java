/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author ankss
 */
public class SingleCircularLL {
    SLNode head, tail;
    int length;
    public SingleCircularLL(){
        this.head = this.tail = null;
        this.length = 0;
    }
    
    public int getLength(){
        return this.length;
    }
    
    
    public void add(int x){
        if (this.head == null){
            this.head = this.tail = new SLNode(x);
            this.tail.next = this.head;
        }
        else{
            SLNode temp = new SLNode(x);
            temp.next = this.head;
            this.tail.next = temp;
            this.tail = temp;
        }
        this.length++;
        System.out.println("Element "+ x +" appeneded in the list");
    }
    
    
    public void printPointers(){
        System.out.println("head = "+this.head.val + "\t tail = :"+this.tail.val);
    }
    
    
    public void traverse(){
        if(this.head == null){
            System.out.println("List is Empty");
            return;
        }
        System.out.println("Traversing The List");
        SLNode temp = this.head;
        while(temp!= this.tail){
            System.out.print(temp.val+"\t");
            temp = temp.next;
        }
        System.out.println(this.tail.val);
    }
    
    public void insert(int loc, int x){
        if (loc<1 || loc > this.length){
            System.out.println("Invalid Location!");
        }
        else if (loc == 1){
            SLNode temp = new SLNode(x);
            this.tail.next = temp;
            temp.next = this.head;
            this.head = temp;
            System.out.println("Element " + x + " inserted at first position");
            this.length++;
            
        }
        else if (loc == this.length){
            this.add(x);
        }
        else{
            SLNode temp = this.head;
            while(loc > 2){
                temp = temp.next;
                loc--;
            }
            SLNode newNode = new SLNode(x);
            newNode.next = temp.next;
            temp.next = newNode;
            System.out.println("Element " + x + " insertd at position: "+loc);
            this.length++;
        }
    }
    
    
    public void search(int x){
        int count = 1;
        SLNode temp = this.head;
        while(temp != this.tail){
            if (temp.val == x){
                System.out.println("Element " + x + " found at Position : "+count);
                return;
            }
            else{
                count += 1;
                temp = temp.next;
            }
        }
        if (temp.val == x){
            System.out.println("Element " + x + " found at Position : "+count);
        }
        else{
            System.out.println("Elemnt " + x + " doesnt Exist in List");
        }
        return;
    }
    
    
    public void delete(int x){
        int count = 1;
        if (this.head.val == x){
            this.tail.next = this.head.next;
            this.head = null;
            this.head = this.tail.next;
            System.out.println("Element " + x + " deleted from head");
            return;
        }
        
        SLNode temp = this.head;
        
        while(temp.next != this.tail){
            if (temp.next.val == x){
                SLNode delNode = temp.next;
                temp.next = temp.next.next;
                delNode = null;
                System.out.println("Element " + x + " Deleted from position : "+count);
                return;
            }
            else{
                count += 1;
                temp = temp.next;
            }
        }
        if (temp.next.val == x){
            temp.next = this.head;
            this.tail = null;
            this.tail = temp;
            System.out.println("Element " + x + " deleted from tail");
        }
        else{
            System.out.println("Elemnt " + x + " doesnt Exist in List");
        }
        return;
    }
    
    public void emptyList(){
        while(this.head != this.tail){
            SLNode temp = this.head;
            this.head = temp.next;
            temp = null;
        }
        this.head = this.tail = null;
        System.out.println("List Deleted Successully");
    }
    
}
