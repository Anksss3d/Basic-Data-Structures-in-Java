/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queues;

/**
 *
 * @author ankss
 */
public class QueueArray {
    int arr[];
    int first, last; 
    int length; 
    
    public QueueArray(){
        this.arr = new int[5];
        this.first = 0;
        this.last = 0;
        this.length = 5;
    }
    
    public void enQueue(int x){
        if (this.last == this.length){
            System.out.println("Queue is full !");
        }
        else{
            this.arr[last] = x;
            this.last++;
            System.out.println("Element Enqueued : "+x);
        }
    }
    
    public int deQueue(){
        if (this.first == this.last){
            System.out.println("Queue is empty !");
            return Integer.MIN_VALUE;
        }
        else{
            int x = this.arr[first];
            this.first++;
            System.out.println("Element Dequeued : "+x);
            return x;
        }
    }
    
    
    public void traverse(){
        if (this.first == this.last){
            System.out.println("Queue is Empty");
        }
        else{
            System.out.println("Elements in Queue are : ");
            int temp = this.first;
            while (temp < this.last){
                System.out.print(this.arr[temp] + "\t");
                temp++;
            }
            System.out.println("");
        }
    }
    
    
    public void deleteQueue(){
        this.first = this.last = 0;
        System.out.println("Queue Deleted!");
    }
    
    
    
    
}
