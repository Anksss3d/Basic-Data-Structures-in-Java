/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import Arrays.Array2D;
import LinkedList.DoubleCircularLL;
import LinkedList.DoubleLinearLL;
import LinkedList.SingleLinearLL;
import LinkedList.SingleCircularLL;
import Queues.CircularQueueArray;
import Queues.QueueArray;
import Queues.QueueLinkedList;
import Stacks.StackArray;
import Stacks.StackLinkedList;
/**
 *
 * @author ankss
 */
public class MainClass {
    public static void main(String[] args) {
        // callCircularQueueArray();
    }
    
    
    public static void call2DArray(){
        Array2D ar = new Array2D(3, 2);
        ar.traverse();
        ar.getValues();
        ar.traverse();
        ar.getValue(1, 0);
        ar.getValue(3, 4);
        System.out.println(Arrays.toString(ar.searchArray(65)));
        System.out.println(Arrays.toString(ar.searchArray(5)));
    }
    
    public static void callSingleLinearLL(){
        SingleLinearLL list = new SingleLinearLL();
        list.traverse();
        list.add(10);
        list.add(20);
        list.add(25);
        list.add(19);
        list.add(11);
        list.add(100);
        list.add(123);
        list.add(99);
        list.traverse();
        list.search(25);
        list.search(120);
        list.delete(10);
        list.traverse();
        list.delete(100);
        list.traverse();
        list.delete(25);
        list.traverse();
        
        list.insert(2, 101010);
        list.traverse();
        list.insert(1, 1111);
        list.traverse();
        list.insert(12, 293);
        list.traverse();
        list.insert(list.getLength(), 192);
        list.traverse();
             
        list.emptyList();
        list.traverse();
    }
    
 
    public static void callSingleCircularLL(){
        SingleCircularLL list = new SingleCircularLL();
        list.traverse();
        list.add(10);
        list.add(20);
        list.add(25);
        list.add(19);
        list.add(11);
        list.add(100);
        list.add(123);
        list.add(99);
        list.printPointers();
        list.traverse();
        list.search(25);
        list.search(120);
        list.delete(10);
        list.traverse();
        list.delete(100);
        list.traverse();
        list.delete(25);
        list.traverse();
        
        list.insert(2, 101010);
        list.traverse();
        list.insert(1, 1111);
        list.traverse();
        list.insert(12, 293);
        list.traverse();
        list.insert(list.getLength(), 192);
        list.traverse();
             
        list.emptyList();
        list.traverse();
    }
    
    
    public static void callDoubleLinearLL(){
        DoubleLinearLL list = new DoubleLinearLL();
        list.traverse();
        list.add(10);
        list.add(20);
        list.add(25);
        list.add(19);
        list.add(11);
        list.add(100);
        list.add(123);
        list.add(99);
        list.printPointers();
        list.traverse();
        list.search(25);
        list.search(120);
        list.delete(10);
        list.traverse();
        list.delete(100);
        list.traverse();
        list.delete(25);
        list.traverse();
        
        list.insert(2, 101010);
        list.traverse();
        list.insert(1, 1111);
        list.traverse();
        list.insert(12, 293);
        list.traverse();
        list.insert(list.getLength(), 192);
        list.traverse();
             
        list.emptyList();
        list.traverse();
    }
    
    public static void callDoubleCircularLL(){
        DoubleCircularLL list = new DoubleCircularLL();
        list.traverse();
        list.add(10);
        list.add(20);
        list.add(25);
        list.add(19);
        list.add(11);
        list.add(100);
        list.add(123);
        list.add(99);
        list.printPointers();
        list.traverse();
        list.search(25);
        list.search(120);
        list.delete(10);
        list.traverse();
        list.delete(100);
        list.traverse();
        list.delete(25);
        list.traverse();
        
        list.insert(2, 101010);
        list.traverse();
        list.insert(1, 1111);
        list.traverse();
        list.insert(12, 293);
        list.traverse();
        list.insert(list.getLength(), 192);
        list.traverse();
             
        list.emptyList();
        list.traverse();
    }
    
    
    public static void callStackArray(){
        StackArray st = new StackArray(5);
        st.pop();
        st.traverse();
        st.push(23);
        st.push(25);
        st.push(64);
        st.push(9);
        st.push(100);
        st.push(101);
        st.traverse();
        st.pop();
        st.pop();
        st.traverse();
        st.deleteStack();
        st.traverse();
    }
    
    
    public static void callStackLinkedList(){
        StackLinkedList st = new StackLinkedList();
        st.pop();
        st.traverse();
        st.push(23);
        st.push(25);
        st.push(64);
        st.push(9);
        st.push(100);
        st.push(101);
        st.traverse();
        st.pop();
        st.pop();
        st.traverse();
        st.deleteStack();
        st.traverse();
    }
    

    
    public static void callQueueArray(){
        QueueArray q = new QueueArray();
        q.deQueue();
        q.traverse();
        q.enQueue(23);
        q.enQueue(25);
        q.enQueue(64);
        q.enQueue(9);
        q.enQueue(100);
        q.enQueue(101);
        q.traverse();
        q.deQueue();
        q.deQueue();
        q.traverse();
        q.deleteQueue();
        q.traverse();
    }   
   
   
    public static void callCircularQueueArray(){
        CircularQueueArray q = new CircularQueueArray(5);
        q.deQueue();
        q.traverse();
        q.enQueue(23);
        q.enQueue(25);
        q.enQueue(64);
        q.enQueue(9);
        q.enQueue(100);
        q.enQueue(101);
        q.traverse();
        q.deQueue();
        q.deQueue();
        q.traverse();
        q.deleteQueue();
        q.traverse();
    } 
   
    public static void callQueueLinkedList(){
        QueueLinkedList q = new QueueLinkedList();
        q.deQueue();
        q.traverse();
        q.enQueue(23);
        q.enQueue(25);
        q.enQueue(64);
        q.enQueue(9);
        q.enQueue(100);
        q.enQueue(101);
        q.traverse();
        q.deQueue();
        q.deQueue();
        q.traverse();
        q.deleteQueue();
        q.traverse();
    }  
    
}
