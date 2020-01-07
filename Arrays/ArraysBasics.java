/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Scanner;
import java.lang.ArrayIndexOutOfBoundsException;

/**
 *
 * @author ankss
 */
public class ArraysBasics {
    private int[] arr;
    private int N;
    
    public ArraysBasics(int n){
        N = n;
        arr = new int[N];
        for(int i=0; i<N;i++){
            arr[i] = 0;
        }
    }
    
    public void takeInput(){
        System.out.println("Please enter "+this.N + " Numbers : ");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<this.N; i++){
            this.arr[i] = sc.nextInt();
        }
    }
    
    public boolean insertValue(int value, int position){
        if(position < 0 || position >= this.N){
            return false;
        }
        if(this.arr[position] != 0){
            this.arr[position] = value;
            return true;
        }
        else{
            return false;
        }
    }
    
    public int[] getValues(){
        return this.arr;
    }
    
    public void printValues(){
        System.out.println("Array Values are: "+ this.arr.toString());
    }
    
    public int getValue(int position){
        if(position>=this.N){
            return -1;
        }
        else{
            return this.arr[position];
        }
    }
    
    public int search(int value){
        for(int i=0;i<this.N; i++){
            if(this.arr[i] == value){
                return i;
            }
        }
        return -1;
    }
    
    public void delete(int index){
        if(this.arr[index] != 0){
            this.arr[index] = 0;
        }
        else{
            return;
        }
    }
    
}
