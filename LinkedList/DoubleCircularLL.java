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
public class DoubleCircularLL {
    DLNode head, tail;
    int length;

    public DoubleCircularLL() {
        this.head = this.tail = null;
        this.length = 0;
    }
    
    public void add(int x){
        if (this.head == null){
            this.head = this.tail = new DLNode(x);
            this.head.next = this.tail;
            this.tail.prev = this.head;
        }
        else{
            DLNode temp = new DLNode(x);
            temp.prev = this.tail;
            temp.next = this.head;
            this.tail.next = temp;
            this.tail = temp;
        }
        this.length++;
    }
    
    public void insert(int loc, int x){
        DLNode temp = new DLNode(x);
        if (loc == 1){
            temp.next = this.head;
            temp.prev = this.tail;
            this.tail.next = temp;
            this.head.prev = temp;
            this.head = temp;
            System.out.println("Element "+x+" added at head!");
        }
        else if (loc == this.length){
            this.tail.next = temp;
            temp.next = this.head;
            this.head.prev = temp;
            temp.prev = this.tail;
            this.tail = temp;
            System.out.println("Element "+x+" added at tail");
        }
        else if (loc > 1 && loc < this.length){
            int count = 1;
            DLNode itr = this.head;
            while (count < loc-1){
                count++;
                itr = itr.next;
            }
            temp.next = itr.next;
            temp.prev = itr;
            temp.next.prev = temp;
            itr.next = temp;
            System.out.println("Element "+x+" inserted at position : "+ loc);
                 
        }
        else{
            System.out.println("Invalid Index!");
        }
    }
    
    
    public void traverse(){
        if (this.head == null){
            System.out.println("List is Empty");
        }
        else{
            System.out.println("Traversing the List");
            DLNode temp = this.head;
            while (temp.next != this.head){
                System.out.print(temp.val + "\t");
                temp = temp.next;
            }
            System.out.println(this.tail.val);
        }
    }
    
    
    public void search(int x){
        DLNode temp = this.head;
        int count = 1;
        while (temp.next != this.head){
            if (temp.val == x){
                System.out.println("Element "+x+" found at position : "+count);
                return;
            }
            else{
                count++;
                temp = temp.next;
            }
        }
        if (this.tail.val == x){
            System.out.println("Element "+x+" found at tail");
        }
        else{
            System.out.println("List doesnt contain element "+x+" !");
        }
    }
    
    
    public void delete(int x){
        if(this.head == null){
            System.out.println("List is Empty ...!");
            return;
        }
        else{
            DLNode delNode;
            if (this.head.val == x){
                delNode = this.head;
                this.head = delNode.next;
                this.head.prev = this.tail;
                this.tail.next = this.head;
                delNode = null;
                System.out.println("Deleted element "+x+" fro head ");
                return;
            }
            else if (this.tail.val == x){
                delNode = this.tail;
                this.tail = this.tail.prev;
                this.tail.next = head;
                this.head.prev = this.tail;
                delNode = null;
                System.out.println("Deleted Element "+x+" from tail");
                return;
            }
            else{
                DLNode temp = this.head.next;
                while (temp != this.tail){
                    if (temp.val == x){
                        delNode = temp;
                        delNode.prev.next = delNode.next;
                        delNode.next.prev = delNode.prev;
                        delNode = null;
                        System.out.println("Deleted "+x+" from list");
                        return;
                        
                    }
                    temp = temp.next;
                }
                System.out.println("Elment doesnt exist in list");
            }
        }
    }
    
    public int getLength(){
        return this.length;
    }
    
    
    public void printPointers(){
        System.out.println("head = "+this.head.val + "\t tail = :"+this.tail.val);
    }
    
    
    public void emptyList(){
        if (this.head == null){
            System.out.println("List is Empty");
        }
        else{
            this.head = null;
            this.tail = null;
            System.out.println("Deleted linked list");
        }
    }
    
}
