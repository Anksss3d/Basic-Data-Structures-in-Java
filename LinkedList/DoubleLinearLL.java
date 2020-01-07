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
public class DoubleLinearLL {
    DLNode head, tail;
    int length;

    public DoubleLinearLL() {
        this.head = this.tail = null;
        this.length = 0;
    }
    
    public void add(int x){
        if(this.head == null){
            this.head = this.tail = new DLNode(x);
        }
        else{
            DLNode temp = new DLNode(x);
            this.tail.next = temp;
            temp.prev = this.tail;
            this.tail = temp;
        }
        this.length++;
        System.out.println("Element "+x+" appended successfully");
    }
    
    
    public void traverse(){
        if (this.head == null){
            System.out.println("List is Empty!");
        }
        else{
            DLNode temp = this.head;
            System.out.println("Traversing The List");
            while (temp != null){
                System.out.print(temp.val + "\t");
                temp = temp.next;
            }
            System.out.println("");
        }
    }
    
    
    public void insert(int loc, int x){
        DLNode temp = new DLNode(x);
        if(loc == 1){
            temp.next = this.head;
            this.head.prev = temp;
            this.head = temp;
            System.out.println("Element "+x+" added at first position");
        }
        else if (loc == this.length){
            this.add(x);
        }
        else if (loc > 1 && loc < this.length ){
            DLNode itr = this.head;
            int count = 1;
            while (count < loc){
                itr = itr.next;
                count++;
            }
            temp.next = itr.next;
            temp.prev = itr;
            itr.next.prev = temp;
            itr.next = temp;
            System.out.println("Element "+x+" inserted at position : "+loc);
        }
        else{
            System.out.println("Invalid Index");
        }
    }
    
    public void delete(int x){
        DLNode temp = this.head;
        this.length--;
        if (temp.val == x){
            this.head = this.head.next;
            this.head.prev = null;
            temp = null;
            System.out.println("Element "+x+" deleted from head");
        }
        else{
            while (temp.next != null){
                if (temp.next.val==x){
                    DLNode delNode = temp.next;
                    delNode.next.prev = temp;
                    temp.next = delNode.next;
                    delNode = null;
                    System.out.println("Element "+x+" deleted from list");
                    return;
                }
                temp = temp.next;
            }
            if (temp.val == x){
                this.tail = this.tail.prev;
                temp = null;
                System.out.println("Element "+x+" deleted from tail");
            }
            else{
                this.length++;
                System.out.println("Element "+x+" doesnt exist in list");
            }
        }
    }
    
    public void emptyList(){
        while (this.head != null){
            DLNode temp = this.head;
            this.head = this.head.next;
            temp = null;
        }
        this.tail = null;
        System.out.println("Deleted the list");
    }
    
    
    public void search(int x){
        int count = 1;
        DLNode temp = this.head;
        while (temp != null){
            if (temp.val == x){
                System.out.println("Element "+x+" found at position : "+count);
                return;
            }
            else{
                count++;
                temp = temp.next;
            }
        }
        System.out.println("Element "+x+" doesnt Exist in list");
    }
    
    public int getLength(){
        return this.length;
    }
    
    
    public void printPointers(){
        System.out.println("head = "+this.head.val + "\t tail = :"+this.tail.val);
    }
    
    
         
}
