/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stacks;

/**
 *
 * @author ankss
 */
public class StackArray {
    int[] arr;
    int top;
    int len;
    public StackArray(int x){
        this.arr = new int[x];
        this.top = 0;
        this.len = x;
    }
    
    public void push(int x){
        if (this.top == this.len){
            System.out.println("Stack is Full");
        }
        else{
            this.arr[this.top] = x;
            this.top++;
            System.out.println("pushed element : "+ this.arr[this.top-1]);
        }
    }
    
    public int pop(){
        if (this.top == 0){
            System.out.println("Stack is Empty");
            return Integer.MIN_VALUE;
        }
        else{
            this.top--;
            System.out.println("Popped element : "+this.arr[this.top]);
            return this.arr[this.top];
        }
    }
    
    public void traverse(){
        if (this.top == 0){
            System.out.println("Stack is Empty");
        }
        else{
            System.out.println("Elements in stack are: ");
            int temp = this.top - 1;
            while(temp >= 0){
                System.out.print(this.arr[temp] + "\t");
                temp--;
            }
            System.out.println("");
        }
    }
    
    public int peak(){
        if (this.top == 0){
            System.out.println("Stack is Empty");
            return Integer.MIN_VALUE;
        }
        else{
            return this.arr[this.top];
        }
    }
    
    public void deleteStack(){
        this.top = 0;
        System.out.println("Deleted Stack!");
    }
}
