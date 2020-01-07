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
public class CircularQueueArray {
    int arr[];
    int first, last; 
    int length; 
    int count;
    
    public CircularQueueArray(int N){
        this.arr = new int[N];
        this.first = 0;
        this.last = 0;
        this.length = N;
        this.count = 0;
    }
    
    public void enQueue(int x){
        if (this.count == this.length){
            System.out.println("Queue is full");
        }
        else{
            this.arr[this.last] = x;
            this.last = (this.last + 1) % this.length;
            System.out.println("Element inserted successfully : " + x);
            this.count++;
        }
    }
    
    public int deQueue(){
        if (this.count == 0){
            System.out.println("Queue is empty !");
            return Integer.MIN_VALUE;
        }
        else{
            int temp = this.arr[this.first];
            this.arr[this.first] = Integer.MIN_VALUE;
            this.first = (this.first + 1) % this.length;
            System.out.println("Element Dequeued:" + temp);
            this.count--;
            return temp;
        }
    }
    
    
    public void traverse(){
        if (this.count == 0){
            System.out.println("Queue is Empty");
        }
        else{
            System.out.println("Elements in Queue are : ");
            int temp = this.first;
            int cnt = 0;
            while (cnt < this.count){
                System.out.print(this.arr[temp] + "\t");
                temp = (temp + 1) % this.length;
                cnt++;
            }
            System.out.println("");
        }
    }
    
    
    public void deleteQueue(){
        this.first = this.last = this.count = 0;
        System.out.println("Queue Deleted!");
    }
    
    
    
    
}
